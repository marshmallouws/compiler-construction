// Generated from html.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link htmlParser}.
 */
public interface htmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link htmlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(htmlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(htmlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(htmlParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(htmlParser.HtmlContext ctx);
}