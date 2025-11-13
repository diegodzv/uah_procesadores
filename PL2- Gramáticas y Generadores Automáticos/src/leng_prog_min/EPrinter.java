import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.stream.Collectors;

public class EPrinter {
    public static void main(String[] args) throws Exception {
        // --- 1. Comprobar argumento ---
        if (args.length == 0) {
            System.err.println("ERROR: No se ha indicado ningún archivo de entrada.");
            System.err.println("Uso: java EPrinter <archivo.txt>");
            return;
        }

        String inputFile = args[0];
        File file = new File(inputFile);
        if (!file.exists()) {
            System.err.println("ERROR: El archivo '" + inputFile + "' no existe.");
            return;
        }

        // --- 2. Preparar archivo de salida ---
        String outputFile = "AST_" + inputFile;
        PrintStream out = new PrintStream(new File(outputFile), "UTF-8");
        System.setOut(out);

        // --- 3. Leer archivo de entrada ---
        CharStream input = CharStreams.fromFileName(inputFile);

        // --- 4. Crear lexer y parser ---
        ELexer lexer = new ELexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EParser parser = new EParser(tokens);

        // --- 5. Eliminar mensajes de error estándar ---
        parser.removeErrorListeners();

        // --- 6. Analizar programa ---
        EParser.ProgramaContext tree = parser.programa();

        // --- 7. Imprimir árbol legible al archivo ---
        System.out.println("Programa E (" + inputFile + ")");
        for (EParser.InstruccionContext inst : tree.instruccion()) {
            if (inst.asignacion() != null) {
                // Asignación (simple o múltiple)
                String ids = inst.asignacion().listaIDs().getText();
                String expr = inst.asignacion().expresion().getText();
                System.out.println("  Asignar: " + ids + " = " + expr);
            } else if (inst.impresion() != null) {
                // Mostrar
                String expr = inst.impresion().expresion().getText();
                System.out.println("  Mostrar: " + expr);
            } else if (inst.condicional() != null) {
                // Condicional
                String cond = inst.condicional().expresion().getText();
                System.out.println("  Si (" + cond + "):");
                for (EParser.InstruccionContext sub : inst.condicional().bloque(0).instruccion()) {
                    System.out.println("    " + sub.getText());
                }
                if (inst.condicional().bloque().size() > 1) {
                    System.out.println("  No:");
                    for (EParser.InstruccionContext sub : inst.condicional().bloque(1).instruccion()) {
                        System.out.println("    " + sub.getText());
                    }
                }
                System.out.println("  Terminar");
            } else if (inst.bucle() != null) {
                // Bucle mientras
                String cond = inst.bucle().expresion().getText();
                System.out.println("  Mientras (" + cond + "):");
                for (EParser.InstruccionContext sub : inst.bucle().bloque().instruccion()) {
                    System.out.println("    " + sub.getText());
                }
                System.out.println("  FinMientras");
            }
        }

        // --- 8. Cerrar archivo de salida ---
        out.close();
        System.err.println("AST generado correctamente en: " + outputFile);
    }
}
