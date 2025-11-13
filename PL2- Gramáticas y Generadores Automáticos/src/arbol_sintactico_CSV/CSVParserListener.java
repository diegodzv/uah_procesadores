// Generated from CSVParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(CSVParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(CSVParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CSVParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CSVParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CSVParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CSVParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CSVParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CSVParser.FieldContext ctx);
}