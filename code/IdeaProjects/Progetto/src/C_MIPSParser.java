// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-10 18:27:51

	// package myCompiler;

    import util.*;
    import java.util.Hashtable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AMP", "ARROW", "ASS", 
		"CHAR", "CHAR_QUOTE", "COMMA", "COMMENT", "DIGIT", "DIGIT_NO_ZERO", "DIV", 
		"DOT", "D_QUOTE", "ELSE", "EQ", "FLOAT", "FOR", "GE", "GT", "HASHTAG", 
		"IF", "INCLUDE", "INT", "K_CHAR", "K_FLOAT", "K_INT", "LBRACK", "LCURL", 
		"LE", "LPAREN", "LT", "MULT", "NEQ", "NEWL", "PERC", "RBRACK", "RCURL", 
		"RETURN", "RPAREN", "SEMICOL", "SLASHR", "SPACE", "SUB", "S_QUOTE", "TAB", 
		"TOKEN_ERROR", "UNDRSCR", "VOID", "WHILE", "WORD", "WS"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AMP=5;
	public static final int ARROW=6;
	public static final int ASS=7;
	public static final int CHAR=8;
	public static final int CHAR_QUOTE=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int DIGIT=12;
	public static final int DIGIT_NO_ZERO=13;
	public static final int DIV=14;
	public static final int DOT=15;
	public static final int D_QUOTE=16;
	public static final int ELSE=17;
	public static final int EQ=18;
	public static final int FLOAT=19;
	public static final int FOR=20;
	public static final int GE=21;
	public static final int GT=22;
	public static final int HASHTAG=23;
	public static final int IF=24;
	public static final int INCLUDE=25;
	public static final int INT=26;
	public static final int K_CHAR=27;
	public static final int K_FLOAT=28;
	public static final int K_INT=29;
	public static final int LBRACK=30;
	public static final int LCURL=31;
	public static final int LE=32;
	public static final int LPAREN=33;
	public static final int LT=34;
	public static final int MULT=35;
	public static final int NEQ=36;
	public static final int NEWL=37;
	public static final int PERC=38;
	public static final int RBRACK=39;
	public static final int RCURL=40;
	public static final int RETURN=41;
	public static final int RPAREN=42;
	public static final int SEMICOL=43;
	public static final int SLASHR=44;
	public static final int SPACE=45;
	public static final int SUB=46;
	public static final int S_QUOTE=47;
	public static final int TAB=48;
	public static final int TOKEN_ERROR=49;
	public static final int UNDRSCR=50;
	public static final int VOID=51;
	public static final int WHILE=52;
	public static final int WORD=53;
	public static final int WS=54;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public C_MIPSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return C_MIPSParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g"; }


		  ParserEnvironment env;
	      ParserSemantic sem;

	      void init (boolean par, boolean postfissa) {
	        System.out.println("Inizio l'analisi\n");
	        env = new ParserEnvironment(par, postfissa);
	        sem = new ParserSemantic(env);
	      }

	      public String getTranslation () {
	        return env.translation.toString();
	      }

	      public Hashtable<String, Double> getVariables() {
	        return env.symbolTable;
	      }



	// $ANTLR start "start"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:1: start : ( INCLUDE )* ( global )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:9: ( ( INCLUDE )* ( global )* EOF )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:11: ( INCLUDE )* ( global )* EOF
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:11: ( INCLUDE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:11: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_start67); 
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:20: ( global )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= K_CHAR && LA2_0 <= K_INT)||LA2_0==MULT||LA2_0==VOID||LA2_0==WORD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:20: global
					{
					pushFollow(FOLLOW_global_in_start70);
					global();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start73); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "global"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:1: global : ( VOID identifier function | ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) ) );
	public final void global() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:10: ( VOID identifier function | ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VOID) ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= K_CHAR && LA8_0 <= K_INT)||LA8_0==MULT||LA8_0==WORD) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:12: VOID identifier function
					{
					match(input,VOID,FOLLOW_VOID_in_global92); 
					pushFollow(FOLLOW_identifier_in_global94);
					identifier();
					state._fsp--;

					pushFollow(FOLLOW_function_in_global96);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:54:6: ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:54:6: ( type_name )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= K_CHAR && LA3_0 <= K_INT)) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:54:6: type_name
							{
							pushFollow(FOLLOW_type_name_in_global104);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:54:17: ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==MULT) ) {
						alt7=1;
					}
					else if ( (LA7_0==WORD) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:54:19: pointer SEMICOL
							{
							pushFollow(FOLLOW_pointer_in_global109);
							pointer();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_global111); 
							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:12: identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function )
							{
							pushFollow(FOLLOW_identifier_in_global125);
							identifier();
							state._fsp--;

							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:23: ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function )
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==ADD||LA6_0==ASS||LA6_0==COMMA||LA6_0==DIV||LA6_0==LBRACK||LA6_0==MULT||LA6_0==SEMICOL||LA6_0==SUB) ) {
								alt6=1;
							}
							else if ( (LA6_0==LPAREN) ) {
								alt6=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 6, 0, input);
								throw nvae;
							}

							switch (alt6) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:24: ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL )
									{
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:24: ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL )
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:25: ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL
									{
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:25: ( assignment ( COMMA identifier assignment )* | vector )
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( (LA5_0==ADD||LA5_0==ASS||LA5_0==COMMA||LA5_0==DIV||LA5_0==MULT||LA5_0==SEMICOL||LA5_0==SUB) ) {
										alt5=1;
									}
									else if ( (LA5_0==LBRACK) ) {
										alt5=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 5, 0, input);
										throw nvae;
									}

									switch (alt5) {
										case 1 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:26: assignment ( COMMA identifier assignment )*
											{
											pushFollow(FOLLOW_assignment_in_global130);
											assignment();
											state._fsp--;

											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:37: ( COMMA identifier assignment )*
											loop4:
											while (true) {
												int alt4=2;
												int LA4_0 = input.LA(1);
												if ( (LA4_0==COMMA) ) {
													alt4=1;
												}

												switch (alt4) {
												case 1 :
													// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:38: COMMA identifier assignment
													{
													match(input,COMMA,FOLLOW_COMMA_in_global133); 
													pushFollow(FOLLOW_identifier_in_global135);
													identifier();
													state._fsp--;

													pushFollow(FOLLOW_assignment_in_global137);
													assignment();
													state._fsp--;

													}
													break;

												default :
													break loop4;
												}
											}

											}
											break;
										case 2 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:69: vector
											{
											pushFollow(FOLLOW_vector_in_global142);
											vector();
											state._fsp--;

											}
											break;

									}

									match(input,SEMICOL,FOLLOW_SEMICOL_in_global145); 
									}

									}
									break;
								case 2 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: function
									{
									pushFollow(FOLLOW_function_in_global165);
									function();
									state._fsp--;

									}
									break;

							}

							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "global"



	// $ANTLR start "assignment"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS expression )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:13: ( ( ( ADD | SUB | MULT | DIV )? ASS expression )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:15: ( ( ADD | SUB | MULT | DIV )? ASS expression )?
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:15: ( ( ADD | SUB | MULT | DIV )? ASS expression )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ADD||LA10_0==ASS||LA10_0==DIV||LA10_0==MULT||LA10_0==SUB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:16: ( ADD | SUB | MULT | DIV )? ASS expression
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:16: ( ADD | SUB | MULT | DIV )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ADD||LA9_0==DIV||LA9_0==MULT||LA9_0==SUB) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
							{
							if ( input.LA(1)==ADD||input.LA(1)==DIV||input.LA(1)==MULT||input.LA(1)==SUB ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,ASS,FOLLOW_ASS_in_assignment203); 
					pushFollow(FOLLOW_expression_in_assignment205);
					expression();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "vector"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:11: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:13: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector228); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:20: ( INT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:20: INT
					{
					match(input,INT,FOLLOW_INT_in_vector230); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector233); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:32: ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:33: ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					{
					match(input,ASS,FOLLOW_ASS_in_vector236); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:37: ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==LCURL) ) {
						alt13=1;
					}
					else if ( (LA13_0==AMP||LA13_0==CHAR_QUOTE||LA13_0==FLOAT||LA13_0==INT||LA13_0==LPAREN||LA13_0==MULT||LA13_0==WORD) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:38: ( LCURL expression ( COMMA expression )* RCURL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:38: ( LCURL expression ( COMMA expression )* RCURL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:39: LCURL expression ( COMMA expression )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector240); 
							pushFollow(FOLLOW_expression_in_vector242);
							expression();
							state._fsp--;

							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:56: ( COMMA expression )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==COMMA) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:57: COMMA expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector245); 
									pushFollow(FOLLOW_expression_in_vector247);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop12;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector251); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:85: expression
							{
							pushFollow(FOLLOW_expression_in_vector256);
							expression();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "vector"



	// $ANTLR start "pointer"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:1: pointer : MULT identifier ( ASS expression )? ;
	public final void pointer() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:11: ( MULT identifier ( ASS expression )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:13: MULT identifier ( ASS expression )?
			{
			match(input,MULT,FOLLOW_MULT_in_pointer279); 
			pushFollow(FOLLOW_identifier_in_pointer281);
			identifier();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:29: ( ASS expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ASS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:30: ASS expression
					{
					match(input,ASS,FOLLOW_ASS_in_pointer284); 
					pushFollow(FOLLOW_expression_in_pointer286);
					expression();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pointer"



	// $ANTLR start "function"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:12: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:14: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function309); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:21: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= K_CHAR && LA17_0 <= K_INT)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:22: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function312);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function314);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:43: ( COMMA type_name identifier )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:44: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function317); 
							pushFollow(FOLLOW_type_name_in_function319);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function321);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function327); 
			pushFollow(FOLLOW_codeblock_in_function329);
			codeblock();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "call_function"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:1: call_function : LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:16: ( LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )? RPAREN )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:18: LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function344); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:25: ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==D_QUOTE||LA25_0==MULT||LA25_0==WORD) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:26: ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )*
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:26: ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==D_QUOTE) ) {
						alt20=1;
					}
					else if ( (LA20_0==MULT||LA20_0==WORD) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:27: ( D_QUOTE ( anything )* D_QUOTE )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:27: ( D_QUOTE ( anything )* D_QUOTE )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:28: D_QUOTE ( anything )* D_QUOTE
							{
							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function349); 
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:36: ( anything )*
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( ((LA18_0 >= ADD && LA18_0 <= AMP)||(LA18_0 >= ASS && LA18_0 <= CHAR)||LA18_0==DIV||(LA18_0 >= FLOAT && LA18_0 <= FOR)||(LA18_0 >= HASHTAG && LA18_0 <= IF)||LA18_0==INT||LA18_0==MULT||LA18_0==PERC||(LA18_0 >= SPACE && LA18_0 <= SUB)||(LA18_0 >= WHILE && LA18_0 <= WS)) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:36: anything
									{
									pushFollow(FOLLOW_anything_in_call_function351);
									anything();
									state._fsp--;

									}
									break;

								default :
									break loop18;
								}
							}

							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function354); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:57: ( MULT )? identifier
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:57: ( MULT )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==MULT) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:57: MULT
									{
									match(input,MULT,FOLLOW_MULT_in_call_function359); 
									}
									break;

							}

							pushFollow(FOLLOW_identifier_in_call_function362);
							identifier();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:75: ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==COMMA) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:76: COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier )
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function366); 
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:82: ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier )
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==D_QUOTE) ) {
								alt23=1;
							}
							else if ( (LA23_0==MULT||LA23_0==WORD) ) {
								alt23=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 23, 0, input);
								throw nvae;
							}

							switch (alt23) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:83: ( D_QUOTE ( anything )* D_QUOTE )
									{
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:83: ( D_QUOTE ( anything )* D_QUOTE )
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:84: D_QUOTE ( anything )* D_QUOTE
									{
									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function370); 
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:92: ( anything )*
									loop21:
									while (true) {
										int alt21=2;
										int LA21_0 = input.LA(1);
										if ( ((LA21_0 >= ADD && LA21_0 <= AMP)||(LA21_0 >= ASS && LA21_0 <= CHAR)||LA21_0==DIV||(LA21_0 >= FLOAT && LA21_0 <= FOR)||(LA21_0 >= HASHTAG && LA21_0 <= IF)||LA21_0==INT||LA21_0==MULT||LA21_0==PERC||(LA21_0 >= SPACE && LA21_0 <= SUB)||(LA21_0 >= WHILE && LA21_0 <= WS)) ) {
											alt21=1;
										}

										switch (alt21) {
										case 1 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:92: anything
											{
											pushFollow(FOLLOW_anything_in_call_function372);
											anything();
											state._fsp--;

											}
											break;

										default :
											break loop21;
										}
									}

									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function375); 
									}

									}
									break;
								case 2 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:113: ( MULT )? identifier
									{
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:113: ( MULT )?
									int alt22=2;
									int LA22_0 = input.LA(1);
									if ( (LA22_0==MULT) ) {
										alt22=1;
									}
									switch (alt22) {
										case 1 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:113: MULT
											{
											match(input,MULT,FOLLOW_MULT_in_call_function380); 
											}
											break;

									}

									pushFollow(FOLLOW_identifier_in_call_function383);
									identifier();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function390); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "call_function"



	// $ANTLR start "codeblock"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:1: codeblock : ( LCURL ( statement )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:13: ( LCURL ( statement )* RCURL | SEMICOL )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LCURL) ) {
				alt27=1;
			}
			else if ( (LA27_0==SEMICOL) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:15: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock409); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:21: ( statement )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==FOR||LA26_0==IF||(LA26_0 >= K_CHAR && LA26_0 <= K_INT)||LA26_0==MULT||LA26_0==RETURN||(LA26_0 >= WHILE && LA26_0 <= WORD)) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:22: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock412);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop26;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock416); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:75:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock430); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "statement"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:1: statement : ( ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL | ifStat | whileStat | forStat | RETURN atom_exp SEMICOL );
	public final void statement() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:13: ( ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL | ifStat | whileStat | forStat | RETURN atom_exp SEMICOL )
			int alt32=5;
			switch ( input.LA(1) ) {
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt32=1;
				}
				break;
			case IF:
				{
				alt32=2;
				}
				break;
			case WHILE:
				{
				alt32=3;
				}
				break;
			case FOR:
				{
				alt32=4;
				}
				break;
			case RETURN:
				{
				alt32=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:15: ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:15: ( type_name )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= K_CHAR && LA28_0 <= K_INT)) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement446);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:26: ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==WORD) ) {
						alt31=1;
					}
					else if ( (LA31_0==MULT) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:27: identifier ( assignment ( COMMA identifier assignment )* | call_function | vector )
							{
							pushFollow(FOLLOW_identifier_in_statement450);
							identifier();
							state._fsp--;

							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:38: ( assignment ( COMMA identifier assignment )* | call_function | vector )
							int alt30=3;
							switch ( input.LA(1) ) {
							case ADD:
							case ASS:
							case COMMA:
							case DIV:
							case MULT:
							case SEMICOL:
							case SUB:
								{
								alt30=1;
								}
								break;
							case LPAREN:
								{
								alt30=2;
								}
								break;
							case LBRACK:
								{
								alt30=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 30, 0, input);
								throw nvae;
							}
							switch (alt30) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:39: assignment ( COMMA identifier assignment )*
									{
									pushFollow(FOLLOW_assignment_in_statement453);
									assignment();
									state._fsp--;

									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:50: ( COMMA identifier assignment )*
									loop29:
									while (true) {
										int alt29=2;
										int LA29_0 = input.LA(1);
										if ( (LA29_0==COMMA) ) {
											alt29=1;
										}

										switch (alt29) {
										case 1 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:51: COMMA identifier assignment
											{
											match(input,COMMA,FOLLOW_COMMA_in_statement456); 
											pushFollow(FOLLOW_identifier_in_statement458);
											identifier();
											state._fsp--;

											pushFollow(FOLLOW_assignment_in_statement460);
											assignment();
											state._fsp--;

											}
											break;

										default :
											break loop29;
										}
									}

									}
									break;
								case 2 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:83: call_function
									{
									pushFollow(FOLLOW_call_function_in_statement466);
									call_function();
									state._fsp--;

									}
									break;
								case 3 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:99: vector
									{
									pushFollow(FOLLOW_vector_in_statement470);
									vector();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:109: pointer
							{
							pushFollow(FOLLOW_pointer_in_statement475);
							pointer();
							state._fsp--;

							}
							break;

					}

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement478); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:6: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement486);
					ifStat();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:6: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement493);
					whileStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:81:6: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement500);
					forStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:6: RETURN atom_exp SEMICOL
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement507); 
					pushFollow(FOLLOW_atom_exp_in_statement509);
					atom_exp();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement511); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "ifStat"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:1: ifStat : IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? ;
	public final void ifStat() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:10: ( IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:12: IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )?
			{
			match(input,IF,FOLLOW_IF_in_ifStat534); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat536); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:22: ( expression compare expression )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:23: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_ifStat539);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_ifStat541);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_ifStat543);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat546); 
			pushFollow(FOLLOW_codeblock_in_ifStat548);
			codeblock();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:71: ( ELSE ( codeblock | ifStat | whileStat ) )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==ELSE) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:72: ELSE ( codeblock | ifStat | whileStat )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat551); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:77: ( codeblock | ifStat | whileStat )
					int alt33=3;
					switch ( input.LA(1) ) {
					case LCURL:
					case SEMICOL:
						{
						alt33=1;
						}
						break;
					case IF:
						{
						alt33=2;
						}
						break;
					case WHILE:
						{
						alt33=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}
					switch (alt33) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:78: codeblock
							{
							pushFollow(FOLLOW_codeblock_in_ifStat554);
							codeblock();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:90: ifStat
							{
							pushFollow(FOLLOW_ifStat_in_ifStat558);
							ifStat();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:99: whileStat
							{
							pushFollow(FOLLOW_whileStat_in_ifStat562);
							whileStat();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStat"



	// $ANTLR start "whileStat"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:1: whileStat : WHILE LPAREN ( identifier compare expression ) RPAREN codeblock ;
	public final void whileStat() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:12: ( WHILE LPAREN ( identifier compare expression ) RPAREN codeblock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:14: WHILE LPAREN ( identifier compare expression ) RPAREN codeblock
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStat586); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat588); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:27: ( identifier compare expression )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:28: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_whileStat591);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_whileStat593);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_whileStat595);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat598); 
			pushFollow(FOLLOW_codeblock_in_whileStat600);
			codeblock();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileStat"



	// $ANTLR start "forStat"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:1: forStat : FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock ;
	public final void forStat() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:11: ( FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:13: FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock
			{
			match(input,FOR,FOLLOW_FOR_in_forStat619); 
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat621); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:24: ( ( type_name )? identifier ASS expression )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:25: ( type_name )? identifier ASS expression
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:25: ( type_name )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= K_CHAR && LA35_0 <= K_INT)) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:25: type_name
					{
					pushFollow(FOLLOW_type_name_in_forStat624);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_forStat627);
			identifier();
			state._fsp--;

			match(input,ASS,FOLLOW_ASS_in_forStat629); 
			pushFollow(FOLLOW_expression_in_forStat631);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat634); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:71: ( identifier compare expression )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:72: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat637);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat639);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat641);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat644); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:111: ( identifier compare expression )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:112: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat647);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat649);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat651);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat654); 
			pushFollow(FOLLOW_codeblock_in_forStat656);
			codeblock();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forStat"



	// $ANTLR start "type_name"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:94:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:94:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( (input.LA(1) >= K_CHAR && input.LA(1) <= K_INT) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_name"



	// $ANTLR start "identifier"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:1: identifier : ( WORD ) ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:13: ( ( WORD ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:15: ( WORD )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:15: ( WORD )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:16: WORD
			{
			match(input,WORD,FOLLOW_WORD_in_identifier701); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier"



	// $ANTLR start "expression"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:1: expression : multiply_exp ( ADD multiply_exp | SUB multiply_exp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:14: ( multiply_exp ( ADD multiply_exp | SUB multiply_exp )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:16: multiply_exp ( ADD multiply_exp | SUB multiply_exp )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression718);
			multiply_exp();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:29: ( ADD multiply_exp | SUB multiply_exp )*
			loop36:
			while (true) {
				int alt36=3;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ADD) ) {
					alt36=1;
				}
				else if ( (LA36_0==SUB) ) {
					alt36=2;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:30: ADD multiply_exp
					{
					match(input,ADD,FOLLOW_ADD_in_expression721); 
					pushFollow(FOLLOW_multiply_exp_in_expression723);
					multiply_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:49: SUB multiply_exp
					{
					match(input,SUB,FOLLOW_SUB_in_expression727); 
					pushFollow(FOLLOW_multiply_exp_in_expression729);
					multiply_exp();
					state._fsp--;

					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "multiply_exp"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:1: multiply_exp : atom_exp ( MULT atom_exp | DIV atom_exp )* ;
	public final void multiply_exp() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:15: ( atom_exp ( MULT atom_exp | DIV atom_exp )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:17: atom_exp ( MULT atom_exp | DIV atom_exp )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp753);
			atom_exp();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:26: ( MULT atom_exp | DIV atom_exp )*
			loop37:
			while (true) {
				int alt37=3;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==MULT) ) {
					alt37=1;
				}
				else if ( (LA37_0==DIV) ) {
					alt37=2;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:27: MULT atom_exp
					{
					match(input,MULT,FOLLOW_MULT_in_multiply_exp756); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp758);
					atom_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:43: DIV atom_exp
					{
					match(input,DIV,FOLLOW_DIV_in_multiply_exp762); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp764);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop37;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiply_exp"



	// $ANTLR start "atom_exp"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:106:1: atom_exp : ( INT | FLOAT | CHAR_QUOTE | ( MULT | AMP )? identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:106:12: ( INT | FLOAT | CHAR_QUOTE | ( MULT | AMP )? identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN )
			int alt40=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt40=1;
				}
				break;
			case FLOAT:
				{
				alt40=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt40=3;
				}
				break;
			case AMP:
			case MULT:
			case WORD:
				{
				alt40=4;
				}
				break;
			case LPAREN:
				{
				alt40=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:106:14: INT
					{
					match(input,INT,FOLLOW_INT_in_atom_exp784); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:107:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp792); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:108:7: CHAR_QUOTE
					{
					match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp802); 
					}
					break;
				case 4 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:109:7: ( MULT | AMP )? identifier ( LBRACK INT RBRACK )?
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:109:7: ( MULT | AMP )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==AMP||LA38_0==MULT) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
							{
							if ( input.LA(1)==AMP||input.LA(1)==MULT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_atom_exp819);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:109:32: ( LBRACK INT RBRACK )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==LBRACK) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:109:33: LBRACK INT RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp822); 
							match(input,INT,FOLLOW_INT_in_atom_exp824); 
							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp826); 
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:110:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp840); 
					pushFollow(FOLLOW_expression_in_atom_exp842);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp844); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atom_exp"



	// $ANTLR start "anything"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:113:1: anything : ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS );
	public final void anything() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:113:11: ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( (input.LA(1) >= ADD && input.LA(1) <= AMP)||(input.LA(1) >= ASS && input.LA(1) <= CHAR)||input.LA(1)==DIV||(input.LA(1) >= FLOAT && input.LA(1) <= FOR)||(input.LA(1) >= HASHTAG && input.LA(1) <= IF)||input.LA(1)==INT||input.LA(1)==MULT||input.LA(1)==PERC||(input.LA(1) >= SPACE && input.LA(1) <= SUB)||(input.LA(1) >= WHILE && input.LA(1) <= WS) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "anything"



	// $ANTLR start "compare"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:1: compare : ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) );
	public final void compare() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:11: ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) )
			int alt42=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt42=1;
				}
				break;
			case NEQ:
				{
				alt42=2;
				}
				break;
			case LT:
				{
				alt42=3;
				}
				break;
			case GT:
				{
				alt42=4;
				}
				break;
			case LE:
				{
				alt42=5;
				}
				break;
			case GE:
				{
				alt42=6;
				}
				break;
			case ADD:
			case ASS:
			case DIV:
			case MULT:
			case SUB:
				{
				alt42=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:13: EQ
					{
					match(input,EQ,FOLLOW_EQ_in_compare945); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:18: NEQ
					{
					match(input,NEQ,FOLLOW_NEQ_in_compare949); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:24: LT
					{
					match(input,LT,FOLLOW_LT_in_compare953); 
					}
					break;
				case 4 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:29: GT
					{
					match(input,GT,FOLLOW_GT_in_compare957); 
					}
					break;
				case 5 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:34: LE
					{
					match(input,LE,FOLLOW_LE_in_compare961); 
					}
					break;
				case 6 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:39: GE
					{
					match(input,GE,FOLLOW_GE_in_compare965); 
					}
					break;
				case 7 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:45: ( ADD | SUB | MULT | DIV )? ASS
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:45: ( ADD | SUB | MULT | DIV )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==ADD||LA41_0==DIV||LA41_0==MULT||LA41_0==SUB) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
							{
							if ( input.LA(1)==ADD||input.LA(1)==DIV||input.LA(1)==MULT||input.LA(1)==SUB ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,ASS,FOLLOW_ASS_in_compare987); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compare"

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_in_start67 = new BitSet(new long[]{0x002800083A000000L});
	public static final BitSet FOLLOW_global_in_start70 = new BitSet(new long[]{0x0028000838000000L});
	public static final BitSet FOLLOW_EOF_in_start73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_global92 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_global94 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_function_in_global96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_global104 = new BitSet(new long[]{0x0020000800000000L});
	public static final BitSet FOLLOW_pointer_in_global109 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_global125 = new BitSet(new long[]{0x0000480A40004490L});
	public static final BitSet FOLLOW_assignment_in_global130 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_global133 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_global135 = new BitSet(new long[]{0x0000480800004490L});
	public static final BitSet FOLLOW_assignment_in_global137 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_vector_in_global142 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_global165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment203 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_assignment205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector228 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_INT_in_vector230 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector233 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector236 = new BitSet(new long[]{0x0020000A84080220L});
	public static final BitSet FOLLOW_LCURL_in_vector240 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_vector242 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector245 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_vector247 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_vector256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_pointer279 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_pointer281 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_pointer284 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_pointer286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function309 = new BitSet(new long[]{0x0000040038000000L});
	public static final BitSet FOLLOW_type_name_in_function312 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_function314 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_function317 = new BitSet(new long[]{0x0000000038000000L});
	public static final BitSet FOLLOW_type_name_in_function319 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_function321 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_function327 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_function329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function344 = new BitSet(new long[]{0x0020040800010000L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function349 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function351 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function354 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_MULT_in_call_function359 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_call_function362 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_call_function366 = new BitSet(new long[]{0x0020000800010000L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function370 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function372 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function375 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_MULT_in_call_function380 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_call_function383 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_call_function390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock409 = new BitSet(new long[]{0x0030030839100000L});
	public static final BitSet FOLLOW_statement_in_codeblock412 = new BitSet(new long[]{0x0030030839100000L});
	public static final BitSet FOLLOW_RCURL_in_codeblock416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement446 = new BitSet(new long[]{0x0020000800000000L});
	public static final BitSet FOLLOW_identifier_in_statement450 = new BitSet(new long[]{0x0000480A40004490L});
	public static final BitSet FOLLOW_assignment_in_statement453 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_statement456 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_statement458 = new BitSet(new long[]{0x0000480800004490L});
	public static final BitSet FOLLOW_assignment_in_statement460 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_call_function_in_statement466 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_vector_in_statement470 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_pointer_in_statement475 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement507 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_atom_exp_in_statement509 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat534 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat536 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_ifStat539 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_ifStat541 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_ifStat543 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat546 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat548 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat551 = new BitSet(new long[]{0x0010080081000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStat558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_ifStat562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat586 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat588 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_whileStat591 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_whileStat593 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_whileStat595 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat598 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_whileStat600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat619 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat621 = new BitSet(new long[]{0x0020000038000000L});
	public static final BitSet FOLLOW_type_name_in_forStat624 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_forStat627 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_forStat629 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_forStat631 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat634 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_forStat637 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat639 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_forStat641 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat644 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifier_in_forStat647 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat649 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_forStat651 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat654 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_forStat656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_identifier701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression718 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_ADD_in_expression721 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_multiply_exp_in_expression723 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_SUB_in_expression727 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_multiply_exp_in_expression729 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp753 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp756 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp758 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp762 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp764 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom_exp819 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp822 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp824 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp840 = new BitSet(new long[]{0x0020000A04080220L});
	public static final BitSet FOLLOW_expression_in_atom_exp842 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_compare945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_compare949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_compare953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_compare957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_compare961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_compare965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_compare987 = new BitSet(new long[]{0x0000000000000002L});
}
