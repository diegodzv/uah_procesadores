import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CSVPrinter {

    public static void main(String[] args) throws Exception {
        // Elegir el archivo de entrada
        String inputFile;
        if (args.length > 0) {
            inputFile = args[0]; // Si se pasa por argumento
        } else {
            System.err.println("ERROR: no se ha indicado ningun archivo por argumento");
            return;
        }

        // Crear el nombre del archivo de salida
        String outputFile = "AST_" + inputFile.replace(".txt", "") + ".txt";

        // Redirigir la salida estándar al archivo AST correspondiente
        PrintStream out = new PrintStream(new File(outputFile), "UTF-8");
        System.setOut(out);

        // Leer el archivo CSV indicado
        CharStream input = CharStreams.fromFileName(inputFile);

        // Crear el lexer y parser
        CSVLexer lexer = new CSVLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);

        // Analizar el archivo CSV
        CSVParser.CsvContext tree = parser.csv();

        // Mostrar el AST en formato legible
        System.out.println("CSV (" + inputFile + ")");
        List<String> headerFields = tree.header().field().stream()
                .map(f -> f.getText())
                .collect(Collectors.toList());
        System.out.println("  Header: " + String.join(", ", headerFields));

        for (CSVParser.RowContext row : tree.row()) {
            List<String> rowFields = row.field().stream()
                    .map(f -> f.getText())
                    .collect(Collectors.toList());
            System.out.println("  Row: " + String.join(", ", rowFields));
        }

        // Cerrar el flujo de salida para guardar el archivo
        out.close();

        // Aviso en consola (opcional)
        System.err.println("AST generado correctamente en: " + outputFile);
    }
}
