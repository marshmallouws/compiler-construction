// Generated from simpleCalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(simpleCalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(simpleCalcParser.ExprContext ctx);
}