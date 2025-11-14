import ast.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.*;

public class AstToHtml {

    private static int nodeId = 0;

    public static void toHtml(AstNode ast, String filename) throws Exception {
        nodeId = 0;

        // Crear carpeta ast_html/
        File dir = new File("ast_html");
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
                    display: block; /* expandido */
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
        <h2>Árbol AST</h2>
        <ul>
        """);

        writeNode(fw, ast);

        fw.write("""
        </ul>
        </body>
        </html>
        """);

        fw.close();
        System.out.println("AST HTML guardado en: " + output.getAbsolutePath());
    }

    private static void writeNode(FileWriter fw, Object node) throws Exception {
        if (node == null) return;

        int id = nodeId++;

        String label = node.getClass().getSimpleName();

        fw.write("<li>");
        fw.write("<span class='node' onclick='toggle(\"children" + id + "\")'>" 
                 + label + "</span>");

        // Obtener campos del nodo
        Field[] fields = node.getClass().getFields();

        if (fields.length > 0) {
            fw.write("<ul id='children" + id + "' class='children'>");

            for (Field f : fields) {
                Object value = f.get(node);

                fw.write("<li><b>" + f.getName() + ":</b> ");

                if (value instanceof AstNode) {
                    fw.write("</li>");
                    writeNode(fw, value);

                } else if (value instanceof List<?>) {
                    fw.write("</li>");
                    fw.write("<ul>");
                    for (Object elem : (List<?>) value) {
                        if (elem instanceof AstNode) {
                            writeNode(fw, elem);
                        } else {
                            fw.write("<li>" + elem + "</li>");
                        }
                    }
                    fw.write("</ul>");

                } else {
                    fw.write(String.valueOf(value) + "</li>");
                }
            }

            fw.write("</ul>");
        }

        fw.write("</li>");
    }
}
