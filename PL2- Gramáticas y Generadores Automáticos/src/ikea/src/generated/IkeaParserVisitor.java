// Generated from IkeaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IkeaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IkeaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IkeaParser#manual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManual(IkeaParser.ManualContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#itemHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemHeader(IkeaParser.ItemHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(IkeaParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#stepLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepLabel(IkeaParser.StepLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#instructionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionList(IkeaParser.InstructionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(IkeaParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#unirInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnirInstr(IkeaParser.UnirInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#ponerInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonerInstr(IkeaParser.PonerInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#conHerramientaAtornillarInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConHerramientaAtornillarInstr(IkeaParser.ConHerramientaAtornillarInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#atornillarInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtornillarInstr(IkeaParser.AtornillarInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#girarInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirarInstr(IkeaParser.GirarInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#repetirInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetirInstr(IkeaParser.RepetirInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#orientacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrientacion(IkeaParser.OrientacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#herramienta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerramienta(IkeaParser.HerramientaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#tipoHerraje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoHerraje(IkeaParser.TipoHerrajeContext ctx);
}