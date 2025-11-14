import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import ast.*;

import java.util.*;
import java.util.stream.Collectors;

public class IkeaAnalyzer {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Uso: java IkeaAnalyzer <fichero_manual>");
            System.exit(1);
        }

        // 1. Lexer + parser
        CharStream input = CharStreams.fromFileName(args[0]);
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IkeaParser parser = new IkeaParser(tokens);

        ParseTree tree = parser.manual();

        // 2. Construir AST
        IkeaAstBuilder builder = new IkeaAstBuilder();
        ManualNode manual = (ManualNode) builder.visit(tree);

        // 3. Índice de pasos: "6" o "6.2" -> StepNode
        Map<String, StepNode> indicePasos = new HashMap<>();
        for (StepNode step : manual.steps) {
            String etiqueta = etiquetaPaso(step.label);
            indicePasos.put(etiqueta, step);
        }

        // 4. Tablas de símbolos:
        //    - herrajes: "ESPIGA 101345" -> cantidad
        //    - herramientas: DESTORNILLADOR, MARTILLO...
        Map<String, Integer> herrajes = new HashMap<>();
        Set<String> herramientas = new HashSet<>();

        // Recorremos todos los pasos, dejando que cada uno procese sus REPETIR
        for (StepNode step : manual.steps) {
            acumularPaso(step, herrajes, herramientas, indicePasos, new HashSet<>());
        }

        // 5. Mostrar resultados
        System.out.println("ITEM: " + manual.itemName);
        System.out.println("Pasos totales: " + manual.steps.size());
        System.out.println();

        System.out.println("Herrajes necesarios:");
        herrajes.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e ->
                        System.out.println("  " + e.getKey() + ": " + e.getValue() + " uds")
                );

        System.out.println();

        System.out.println("Herramientas a utilizar:");
        if (herramientas.isEmpty()) {
            System.out.println("  (ninguna)");
        } else {
            herramientas.stream()
                    .sorted()
                    .forEach(h -> System.out.println("  " + h));
        }
    }

    // ==================== FUNCIONES AUXILIARES ====================

    // Convierte [6,2] -> "6.2", [7] -> "7"
    private static String etiquetaPaso(List<Integer> label) {
        return label.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("."));
    }

    // Procesa un paso:
    // - suma sus herrajes/herramientas
    // - resuelve REPETIR de forma recursiva
    private static void acumularPaso(StepNode step,
                                     Map<String, Integer> herrajes,
                                     Set<String> herramientas,
                                     Map<String, StepNode> indicePasos,
                                     Set<String> visitando) {

        String estaEtiqueta = etiquetaPaso(step.label);

        if (!visitando.add(estaEtiqueta)) {
            return;
        }

        for (InstructionNode instr : step.instructions) {

            if (instr instanceof PonerInstrNode) {
                PonerInstrNode p = (PonerInstrNode) instr;
                String clave = p.tipoHerraje + " " + p.idHerraje;
                herrajes.merge(clave, p.cantidad, Integer::sum);

                if (p.herramienta != null) {
                    herramientas.add(p.herramienta);
                }

            } else if (instr instanceof ConHerramientaAtornillarInstrNode) {
                ConHerramientaAtornillarInstrNode c = (ConHerramientaAtornillarInstrNode) instr;

                if (c.herramienta != null) {
                    herramientas.add(c.herramienta);
                }

                AtornillarInstrNode a = c.inner;
                if (a != null) {
                    String claveT = "TORNILLO " + a.idTornillo;
                    herrajes.merge(claveT, a.cantidad, Integer::sum);

                    if (a.idTuerca != null) {
                        String claveTuerca = "TUERCA " + a.idTuerca;
                        herrajes.merge(claveTuerca, a.cantidad, Integer::sum);
                    }
                }

            } else if (instr instanceof AtornillarInstrNode) {
                AtornillarInstrNode a = (AtornillarInstrNode) instr;
                String claveT = "TORNILLO " + a.idTornillo;
                herrajes.merge(claveT, a.cantidad, Integer::sum);

                if (a.idTuerca != null) {
                    String claveTuerca = "TUERCA " + a.idTuerca;
                    herrajes.merge(claveTuerca, a.cantidad, Integer::sum);
                }

            } else if (instr instanceof RepetirInstrNode) {
                RepetirInstrNode r = (RepetirInstrNode) instr;
                String objetivo = etiquetaPaso(r.paso);
                StepNode target = indicePasos.get(objetivo);
                if (target != null) {
                    acumularPaso(target, herrajes, herramientas, indicePasos, visitando);
                }
            }
        }

        visitando.remove(estaEtiqueta);
    }
}
