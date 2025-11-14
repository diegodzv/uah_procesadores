import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import java.io.File;
import java.io.FileWriter;

public class ParseTreeToHtml {

    private static int nodeId = 0;

    public static void toHtml(ParseTree tree, IkeaParser parser, String filename) throws Exception {
        nodeId = 0;

        // Crear carpeta parse_tree_html/
        File dir = new File("parse_tree_html");
        if (!dir.exists()) dir.mkdirs();

        File output = new File(dir, filename);
        FileWriter fw = new FileWriter(output);

        fw.write("""
        <html>
        <head>
            <meta charset="UTF-8">
            <style>
                ul { list-style-type: none; }
                .node { cursor: pointer; font-family: Consolas; }
                .children { 
                    margin-left: 20px; 
                    display: block; /* EXPANDIDO */
                }
            </style>
            <script>
            function toggle(id) {
                var el = document.getElementById(id);
                if (el.style.display === "block") el.style.display = "none";
                else el.style.display = "block";
            }
            </script>
        </head>
        <body>
        <h2>Árbol de Parseo (ANTLR)</h2>
        """);

        fw.write("<ul>\n");
        writeNode(fw, tree, parser);
        fw.write("</ul>\n");
        fw.write("</body></html>");
        fw.close();

        System.out.println("Árbol guardado en: " + output.getAbsolutePath());
    }

    private static void writeNode(FileWriter fw, ParseTree tree, IkeaParser parser) throws Exception {
        int id = nodeId++;
        String label = Trees.getNodeText(tree, parser)
                .replace("<", "&lt;")
                .replace(">", "&gt;");

        fw.write("<li><span class='node' onclick='toggle(\"children" + id + "\")'>" 
                 + label + "</span>");

        if (tree.getChildCount() > 0) {
            fw.write("<ul id='children" + id + "' class='children'>");
            for (int i = 0; i < tree.getChildCount(); i++) {
                writeNode(fw, tree.getChild(i), parser);
            }
            fw.write("</ul>");
        }
        fw.write("</li>");
    }
}
