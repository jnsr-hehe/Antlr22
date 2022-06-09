// Generated from ./HelloWorld.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(HelloWorldParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(HelloWorldParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(HelloWorldParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(HelloWorldParser.ProductContext ctx);
}