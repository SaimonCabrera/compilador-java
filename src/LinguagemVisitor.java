// Generated from /home/saimon/IdeaProjects/CompiladoresFinal/src/Linguagem.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LinguagemParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(LinguagemParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(LinguagemParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(LinguagemParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LinguagemParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(LinguagemParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(LinguagemParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LinguagemParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LinguagemParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(LinguagemParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(LinguagemParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(LinguagemParser.FactorContext ctx);
}