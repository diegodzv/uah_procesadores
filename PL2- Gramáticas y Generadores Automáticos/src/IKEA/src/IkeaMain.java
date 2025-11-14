import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import ast.*;

public class IkeaMain {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Uso: java IkeaMain <ruta_fichero>");
            System.exit(1);
        }

        CharStream input = CharStreams.fromFileName(args[0]);
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IkeaParser parser = new IkeaParser(tokens);

        ParseTree tree = parser.manual();
        System.out.println("Parseo correcto.");

        IkeaAstBuilder builder = new IkeaAstBuilder();
        ManualNode ast = (ManualNode) builder.visit(tree);

        System.out.println("AST construido correctamente.");
        System.out.println("ITEM: " + ast.itemName);
        System.out.println("Número de pasos: " + ast.steps.size());
    }
}
