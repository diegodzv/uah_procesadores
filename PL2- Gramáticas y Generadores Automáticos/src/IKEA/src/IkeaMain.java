import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class IkeaMain {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Uso: java IkeaMain <ruta-fichero>");
            System.exit(1);
        }

        // Cargar fichero
        CharStream input = CharStreams.fromFileName(args[0]);

        // Crear lexer
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear parser
        IkeaParser parser = new IkeaParser(tokens);

        // Parsear
        ParseTree tree = parser.manual();

        System.out.println("Parseo finalizado correctamente.");
        System.out.println(tree.toStringTree(parser));
    }
}
