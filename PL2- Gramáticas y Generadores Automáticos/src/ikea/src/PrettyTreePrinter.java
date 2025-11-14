import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

public class PrettyTreePrinter {

    public static void printTree(ParseTree tree, IkeaParser parser) {
        prettyPrint(tree, parser, "", true);
    }

    private static void prettyPrint(ParseTree tree, IkeaParser parser, String prefix, boolean isLast) {
        String nodeText = Trees.getNodeText(tree, parser);

        System.out.print(prefix);
        System.out.print(isLast ? "└── " : "├── ");
        System.out.println(nodeText);

        int count = tree.getChildCount();
        for (int i = 0; i < count; i++) {
            ParseTree child = tree.getChild(i);
            boolean last = (i == count - 1);
            prettyPrint(child, parser, prefix + (isLast ? "    " : "│   "), last);
        }
    }
}
