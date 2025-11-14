import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import ast.*;

public class IkeaMain {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Uso: java IkeaMain <ruta_fichero>");
            System.exit(1);
        }

        // 1. Lexer + parser
        CharStream input = CharStreams.fromFileName(args[0]);
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IkeaParser parser = new IkeaParser(tokens);

        ParseTree tree = parser.manual();
        System.out.println("Parseo correcto.\n");

        // 2. AST
        IkeaAstBuilder builder = new IkeaAstBuilder();
        ManualNode ast = (ManualNode) builder.visit(tree);

        System.out.println("AST construido correctamente.");
        System.out.println("ITEM: " + ast.itemName);
        System.out.println("Número de pasos: " + ast.steps.size());

        // 3. Parse Tree HTML
        String ptName = ast.itemName + "_parse_tree.html";
        ParseTreeToHtml.toHtml(tree, parser, ptName);
        System.out.println("Árbol de parseo generado en: parse_tree_html/" + ptName);

        // 4. AST HTML
        String astName = ast.itemName + "_ast.html";
        AstToHtml.toHtml(ast, astName);
        System.out.println("AST visual generado en: ast_html/" + astName);
    }
}
