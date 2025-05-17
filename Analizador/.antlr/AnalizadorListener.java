// Generated from c:/Users/ue/51906/Analizador/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnalizadorParser}.
 */
public interface AnalizadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AnalizadorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AnalizadorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instr0}
	 * labeled alternative in {@link AnalizadorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstr0(AnalizadorParser.Instr0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code instr0}
	 * labeled alternative in {@link AnalizadorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstr0(AnalizadorParser.Instr0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code instr1}
	 * labeled alternative in {@link AnalizadorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstr1(AnalizadorParser.Instr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code instr1}
	 * labeled alternative in {@link AnalizadorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstr1(AnalizadorParser.Instr1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ins1}
	 * labeled alternative in {@link AnalizadorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterIns1(AnalizadorParser.Ins1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ins1}
	 * labeled alternative in {@link AnalizadorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitIns1(AnalizadorParser.Ins1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code dec1}
	 * labeled alternative in {@link AnalizadorParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDec1(AnalizadorParser.Dec1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code dec1}
	 * labeled alternative in {@link AnalizadorParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDec1(AnalizadorParser.Dec1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sal1}
	 * labeled alternative in {@link AnalizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSal1(AnalizadorParser.Sal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code sal1}
	 * labeled alternative in {@link AnalizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSal1(AnalizadorParser.Sal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code salsen1}
	 * labeled alternative in {@link AnalizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSalsen1(AnalizadorParser.Salsen1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code salsen1}
	 * labeled alternative in {@link AnalizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSalsen1(AnalizadorParser.Salsen1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code terminar1}
	 * labeled alternative in {@link AnalizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterTerminar1(AnalizadorParser.Terminar1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code terminar1}
	 * labeled alternative in {@link AnalizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitTerminar1(AnalizadorParser.Terminar1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code salida1}
	 * labeled alternative in {@link AnalizadorParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida1(AnalizadorParser.Salida1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code salida1}
	 * labeled alternative in {@link AnalizadorParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida1(AnalizadorParser.Salida1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ter1}
	 * labeled alternative in {@link AnalizadorParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTer1(AnalizadorParser.Ter1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ter1}
	 * labeled alternative in {@link AnalizadorParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTer1(AnalizadorParser.Ter1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cero1}
	 * labeled alternative in {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCero1(AnalizadorParser.Cero1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cero1}
	 * labeled alternative in {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCero1(AnalizadorParser.Cero1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uno1}
	 * labeled alternative in {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterUno1(AnalizadorParser.Uno1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uno1}
	 * labeled alternative in {@link AnalizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitUno1(AnalizadorParser.Uno1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cadena1}
	 * labeled alternative in {@link AnalizadorParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena1(AnalizadorParser.Cadena1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cadena1}
	 * labeled alternative in {@link AnalizadorParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena1(AnalizadorParser.Cadena1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code caracter1}
	 * labeled alternative in {@link AnalizadorParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void enterCaracter1(AnalizadorParser.Caracter1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code caracter1}
	 * labeled alternative in {@link AnalizadorParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void exitCaracter1(AnalizadorParser.Caracter1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code caracteres1}
	 * labeled alternative in {@link AnalizadorParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void enterCaracteres1(AnalizadorParser.Caracteres1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code caracteres1}
	 * labeled alternative in {@link AnalizadorParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void exitCaracteres1(AnalizadorParser.Caracteres1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code letr}
	 * labeled alternative in {@link AnalizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterLetr(AnalizadorParser.LetrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letr}
	 * labeled alternative in {@link AnalizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitLetr(AnalizadorParser.LetrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dig}
	 * labeled alternative in {@link AnalizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterDig(AnalizadorParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dig}
	 * labeled alternative in {@link AnalizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitDig(AnalizadorParser.DigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sim}
	 * labeled alternative in {@link AnalizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterSim(AnalizadorParser.SimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sim}
	 * labeled alternative in {@link AnalizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitSim(AnalizadorParser.SimContext ctx);
}