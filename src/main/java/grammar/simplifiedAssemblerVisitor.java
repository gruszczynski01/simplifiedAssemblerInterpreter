// Generated from /Users/szymongruszczynski/SEM5/JFK/assemblerInterpeter/simplifiedAssemblerInterpreter/src/main/java/simplifiedAssembler.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplifiedAssemblerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplifiedAssemblerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#parser_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParser_rule(simplifiedAssemblerParser.Parser_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#push_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_rule(simplifiedAssemblerParser.Push_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#mov_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov_rule(simplifiedAssemblerParser.Mov_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#xor_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_rule(simplifiedAssemblerParser.Xor_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(simplifiedAssemblerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(simplifiedAssemblerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(simplifiedAssemblerParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplifiedAssemblerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(simplifiedAssemblerParser.ValueContext ctx);
}