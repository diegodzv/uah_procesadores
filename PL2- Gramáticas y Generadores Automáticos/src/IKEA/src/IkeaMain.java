import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import ast.*;

public class IkeaMain {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Uso: java IkeaMain <ruta_fichero>");
            System.exit(1);
        }

        // 1. Lectura
        CharStream input = CharStreams.fromFileName(args[0]);
        IkeaLexer lexer = new IkeaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IkeaParser parser = new IkeaParser(tokens);

        // 2. Parseo
        ParseTree tree = parser.manual();
        System.out.println("Parseo correcto.\n");

        // 3. AST
        IkeaAstBuilder builder = new IkeaAstBuilder();
        ManualNode ast = (ManualNode) builder.visit(tree);

        System.out.println("AST construido correctamente.");
        System.out.println("ITEM: " + ast.itemName);
        System.out.println("Número de pasos: " + ast.steps.size());

        // ======================================================
        // 4. GENERAR HTML DEL PARSE TREE (ANTLR)
        // ======================================================
        String parseTreeName = ast.itemName + "_parse_tree.html";
        ParseTreeToHtml.toHtml(tree, parser, parseTreeName);
        System.out.println("Árbol de parseo generado en: parse_tree_html/" + parseTreeName);

        // ======================================================
        // 5. GENERAR HTML DEL AST (TU ÁRBOL)
        // ======================================================
        String astName = ast.itemName + "_ast.html";
        AstToHtml.toHtml(ast, astName);   // (esta clase la creo cuando envíes tu AST)
        System.out.println("AST visual generado en: ast_html/" + astName);
    }
}
