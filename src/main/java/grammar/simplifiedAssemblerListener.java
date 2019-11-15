// Generated from /Users/szymongruszczynski/SEM5/JFK/assemblerInterpeter/simplifiedAssemblerInterpreter/src/main/java/simplifiedAssembler.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplifiedAssemblerParser}.
 */
public interface simplifiedAssemblerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#parser_rule}.
	 * @param ctx the parse tree
	 */
	void enterParser_rule(simplifiedAssemblerParser.Parser_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#parser_rule}.
	 * @param ctx the parse tree
	 */
	void exitParser_rule(simplifiedAssemblerParser.Parser_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#push_rule}.
	 * @param ctx the parse tree
	 */
	void enterPush_rule(simplifiedAssemblerParser.Push_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#push_rule}.
	 * @param ctx the parse tree
	 */
	void exitPush_rule(simplifiedAssemblerParser.Push_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#mov_rule}.
	 * @param ctx the parse tree
	 */
	void enterMov_rule(simplifiedAssemblerParser.Mov_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#mov_rule}.
	 * @param ctx the parse tree
	 */
	void exitMov_rule(simplifiedAssemblerParser.Mov_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#xor_rule}.
	 * @param ctx the parse tree
	 */
	void enterXor_rule(simplifiedAssemblerParser.Xor_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#xor_rule}.
	 * @param ctx the parse tree
	 */
	void exitXor_rule(simplifiedAssemblerParser.Xor_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(simplifiedAssemblerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(simplifiedAssemblerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(simplifiedAssemblerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(simplifiedAssemblerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(simplifiedAssemblerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(simplifiedAssemblerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplifiedAssemblerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(simplifiedAssemblerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplifiedAssemblerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(simplifiedAssemblerParser.ValueContext ctx);
}