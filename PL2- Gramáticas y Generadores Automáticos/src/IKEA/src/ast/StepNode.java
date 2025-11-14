package ast;

import java.util.*;

public class StepNode extends AstNode {
    public List<Integer> label = new ArrayList<>();
    public List<InstructionNode> instructions = new ArrayList<>();
}
