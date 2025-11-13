// Generated from EParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EParser}.
 */
public interface EParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(EParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(EParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(EParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(EParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs(EParser.ListaIDsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs(EParser.ListaIDsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(EParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(EParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EParser.ExpresionContext ctx);
}