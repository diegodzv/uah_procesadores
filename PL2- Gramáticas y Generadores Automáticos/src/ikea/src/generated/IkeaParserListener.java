// Generated from IkeaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IkeaParser}.
 */
public interface IkeaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IkeaParser#manual}.
	 * @param ctx the parse tree
	 */
	void enterManual(IkeaParser.ManualContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#manual}.
	 * @param ctx the parse tree
	 */
	void exitManual(IkeaParser.ManualContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#itemHeader}.
	 * @param ctx the parse tree
	 */
	void enterItemHeader(IkeaParser.ItemHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#itemHeader}.
	 * @param ctx the parse tree
	 */
	void exitItemHeader(IkeaParser.ItemHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(IkeaParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(IkeaParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#stepLabel}.
	 * @param ctx the parse tree
	 */
	void enterStepLabel(IkeaParser.StepLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#stepLabel}.
	 * @param ctx the parse tree
	 */
	void exitStepLabel(IkeaParser.StepLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#instructionList}.
	 * @param ctx the parse tree
	 */
	void enterInstructionList(IkeaParser.InstructionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#instructionList}.
	 * @param ctx the parse tree
	 */
	void exitInstructionList(IkeaParser.InstructionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(IkeaParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(IkeaParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#unirInstr}.
	 * @param ctx the parse tree
	 */
	void enterUnirInstr(IkeaParser.UnirInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#unirInstr}.
	 * @param ctx the parse tree
	 */
	void exitUnirInstr(IkeaParser.UnirInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#ponerInstr}.
	 * @param ctx the parse tree
	 */
	void enterPonerInstr(IkeaParser.PonerInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#ponerInstr}.
	 * @param ctx the parse tree
	 */
	void exitPonerInstr(IkeaParser.PonerInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#conHerramientaAtornillarInstr}.
	 * @param ctx the parse tree
	 */
	void enterConHerramientaAtornillarInstr(IkeaParser.ConHerramientaAtornillarInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#conHerramientaAtornillarInstr}.
	 * @param ctx the parse tree
	 */
	void exitConHerramientaAtornillarInstr(IkeaParser.ConHerramientaAtornillarInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#atornillarInstr}.
	 * @param ctx the parse tree
	 */
	void enterAtornillarInstr(IkeaParser.AtornillarInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#atornillarInstr}.
	 * @param ctx the parse tree
	 */
	void exitAtornillarInstr(IkeaParser.AtornillarInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#girarInstr}.
	 * @param ctx the parse tree
	 */
	void enterGirarInstr(IkeaParser.GirarInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#girarInstr}.
	 * @param ctx the parse tree
	 */
	void exitGirarInstr(IkeaParser.GirarInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#repetirInstr}.
	 * @param ctx the parse tree
	 */
	void enterRepetirInstr(IkeaParser.RepetirInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#repetirInstr}.
	 * @param ctx the parse tree
	 */
	void exitRepetirInstr(IkeaParser.RepetirInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#orientacion}.
	 * @param ctx the parse tree
	 */
	void enterOrientacion(IkeaParser.OrientacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#orientacion}.
	 * @param ctx the parse tree
	 */
	void exitOrientacion(IkeaParser.OrientacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#herramienta}.
	 * @param ctx the parse tree
	 */
	void enterHerramienta(IkeaParser.HerramientaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#herramienta}.
	 * @param ctx the parse tree
	 */
	void exitHerramienta(IkeaParser.HerramientaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#tipoHerraje}.
	 * @param ctx the parse tree
	 */
	void enterTipoHerraje(IkeaParser.TipoHerrajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#tipoHerraje}.
	 * @param ctx the parse tree
	 */
	void exitTipoHerraje(IkeaParser.TipoHerrajeContext ctx);
}