// Generated from /home/smc/Projects/repositorios/compilador-java/src/Linguagem.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemParser}.
 */
public interface LinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LinguagemParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LinguagemParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(LinguagemParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(LinguagemParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(LinguagemParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(LinguagemParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(LinguagemParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(LinguagemParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LinguagemParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LinguagemParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(LinguagemParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(LinguagemParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(LinguagemParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(LinguagemParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LinguagemParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LinguagemParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LinguagemParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LinguagemParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(LinguagemParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(LinguagemParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(LinguagemParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(LinguagemParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LinguagemParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LinguagemParser.FactorContext ctx);
}