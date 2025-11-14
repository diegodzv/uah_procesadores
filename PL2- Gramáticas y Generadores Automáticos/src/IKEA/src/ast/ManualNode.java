package ast;

import java.util.*;

public class ManualNode extends AstNode {
    public String itemName;
    public List<StepNode> steps = new ArrayList<>();
}
