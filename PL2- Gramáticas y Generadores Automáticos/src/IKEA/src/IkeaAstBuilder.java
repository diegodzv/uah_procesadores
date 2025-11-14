import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import ast.*;

public class IkeaAstBuilder extends IkeaParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitManual(IkeaParser.ManualContext ctx) {
        ManualNode m = new ManualNode();
        m.itemName = ctx.IDENT().getText();  // ITEM: X

        for (IkeaParser.StepContext s : ctx.step()) {
            m.steps.add((StepNode) visit(s));
        }
        return m;
    }

    @Override
    public AstNode visitStep(IkeaParser.StepContext ctx) {
        StepNode node = new StepNode();

        // stepLabel: INT (DOT INT)*
        for (TerminalNode t : ctx.stepLabel().INT()) {
            node.label.add(Integer.parseInt(t.getText()));
        }

        for (IkeaParser.InstructionContext ic : ctx.instructionList().instruction()) {
            node.instructions.add((InstructionNode) visit(ic));
        }

        return node;
    }

    // ===========================
    // Instrucciones concretas
    // ===========================

    @Override
    public AstNode visitUnirInstr(IkeaParser.UnirInstrContext ctx) {
        UnirInstrNode n = new UnirInstrNode();
        // UNIR PIEZA IDENT Y PIEZA IDENT
        n.pieza1 = ctx.IDENT(0).getText();
        n.pieza2 = ctx.IDENT(1).getText();
        return n;
    }

    @Override
    public AstNode visitPonerInstr(IkeaParser.PonerInstrContext ctx) {
        PonerInstrNode n = new PonerInstrNode();
        // PONER INT tipoHerraje INT EN PIEZA IDENT
        n.cantidad = Integer.parseInt(ctx.INT(0).getText());
        n.tipoHerraje = ctx.tipoHerraje().getText(); // ESPIGA/TUERCA/HERRAJE
        n.idHerraje = Integer.parseInt(ctx.INT(1).getText());
        n.piezaDestino = ctx.IDENT().getText();
        return n;
    }

    @Override
    public AstNode visitAtornillarInstr(IkeaParser.AtornillarInstrContext ctx) {
        AtornillarInstrNode n = new AtornillarInstrNode();
        // ATORNILLAR INT TORNILLO INT (EN PIEZA IDENT)? (CON TUERCA INT)?
        n.cantidad = Integer.parseInt(ctx.INT(0).getText());
        n.idTornillo = Integer.parseInt(ctx.INT(1).getText());

        if (ctx.EN() != null) {
            n.piezaDestino = ctx.IDENT() != null ? ctx.IDENT().getText() : null;
        }

        if (ctx.TUERCA() != null) {
            // el último INT será el de la tuerca
            int last = ctx.INT().size() - 1;
            n.idTuerca = Integer.parseInt(ctx.INT(last).getText());
        }

        return n;
    }

    @Override
    public AstNode visitConHerramientaAtornillarInstr(IkeaParser.ConHerramientaAtornillarInstrContext ctx) {
        ConHerramientaAtornillarInstrNode n = new ConHerramientaAtornillarInstrNode();
        // CON herramienta COMMA atornillarInstr
        n.herramienta = ctx.herramienta().getText(); // DESTORNILLADOR/MARTILLO
        n.inner = (AtornillarInstrNode) visit(ctx.atornillarInstr());
        return n;
    }

    @Override
    public AstNode visitGirarInstr(IkeaParser.GirarInstrContext ctx) {
        GirarInstrNode n = new GirarInstrNode();
        // GIRAR IDENT
        n.orientacion = ctx.IDENT().getText();
        return n;
    }

    @Override
    public AstNode visitRepetirInstr(IkeaParser.RepetirInstrContext ctx) {
        RepetirInstrNode n = new RepetirInstrNode();
        // REPETIR stepLabel
        for (TerminalNode t : ctx.stepLabel().INT()) {
            n.paso.add(Integer.parseInt(t.getText()));
        }
        return n;
    }
}
