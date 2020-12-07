// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-07 14:14:56

	// package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AMP", "ARROW", "ASS", 
		"CHAR", "CHAR_QUOTE", "COMMA", "COMMENT", "DIGIT", "DIGIT_NO_ZERO", "DIV", 
		"DOT", "D_QUOTE", "ELSE", "EQ", "FLOAT", "FOR", "GE", "GT", "IF", "INCLUDE", 
		"INT", "K_CHAR", "K_FLOAT", "K_INT", "LBRACK", "LCURL", "LE", "LPAREN", 
		"LT", "MULT", "NEQ", "NEWL", "RBRACK", "RCURL", "RETURN", "RPAREN", "SEMICOL", 
		"SLASHR", "SPACE", "SUB", "S_QUOTE", "TAB", "TOKEN_ERROR", "UNDRSCR", 
		"VOID", "WHILE", "WORD", "WS"
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
	public static final int IF=23;
	public static final int INCLUDE=24;
	public static final int INT=25;
	public static final int K_CHAR=26;
	public static final int K_FLOAT=27;
	public static final int K_INT=28;
	public static final int LBRACK=29;
	public static final int LCURL=30;
	public static final int LE=31;
	public static final int LPAREN=32;
	public static final int LT=33;
	public static final int MULT=34;
	public static final int NEQ=35;
	public static final int NEWL=36;
	public static final int RBRACK=37;
	public static final int RCURL=38;
	public static final int RETURN=39;
	public static final int RPAREN=40;
	public static final int SEMICOL=41;
	public static final int SLASHR=42;
	public static final int SPACE=43;
	public static final int SUB=44;
	public static final int S_QUOTE=45;
	public static final int TAB=46;
	public static final int TOKEN_ERROR=47;
	public static final int UNDRSCR=48;
	public static final int VOID=49;
	public static final int WHILE=50;
	public static final int WORD=51;
	public static final int WS=52;

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
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g"; }


		// int test;



	// $ANTLR start "start"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:1: start : ( INCLUDE )? ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( ( INCLUDE )? ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )* EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: ( INCLUDE )? ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )* EOF
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: ( INCLUDE )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INCLUDE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_start68); 
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:20: ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==VOID) ) {
					alt9=1;
				}
				else if ( (LA9_0==CHAR||(LA9_0 >= K_CHAR && LA9_0 <= K_INT)||LA9_0==MULT||LA9_0==WORD) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:22: VOID identifier function
					{
					match(input,VOID,FOLLOW_VOID_in_start73); 
					pushFollow(FOLLOW_identifier_in_start75);
					identifier();
					state._fsp--;

					pushFollow(FOLLOW_function_in_start77);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:49: ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:49: ( type_name )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( ((LA2_0 >= K_CHAR && LA2_0 <= K_INT)) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:49: type_name
							{
							pushFollow(FOLLOW_type_name_in_start81);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:60: ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==MULT) ) {
						alt8=1;
					}
					else if ( (LA8_0==CHAR||LA8_0==WORD) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:61: puntator SEMICOL
							{
							pushFollow(FOLLOW_puntator_in_start85);
							puntator();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_start87); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:80: identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function )
							{
							pushFollow(FOLLOW_identifier_in_start91);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:91: ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function )
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==ASS||LA7_0==COMMA||LA7_0==LBRACK||LA7_0==SEMICOL) ) {
								alt7=1;
							}
							else if ( (LA7_0==LPAREN) ) {
								alt7=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 7, 0, input);
								throw nvae;
							}

							switch (alt7) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:92: ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:92: ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:93: ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:93: ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector )
									int alt6=2;
									int LA6_0 = input.LA(1);
									if ( (LA6_0==ASS||LA6_0==COMMA||LA6_0==SEMICOL) ) {
										alt6=1;
									}
									else if ( (LA6_0==LBRACK) ) {
										alt6=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 6, 0, input);
										throw nvae;
									}

									switch (alt6) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:94: ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* )
											{
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:94: ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* )
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:95: ( variable_ass )? ( COMMA identifier ( variable_ass )? )*
											{
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:95: ( variable_ass )?
											int alt3=2;
											int LA3_0 = input.LA(1);
											if ( (LA3_0==ASS) ) {
												alt3=1;
											}
											switch (alt3) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:95: variable_ass
													{
													pushFollow(FOLLOW_variable_ass_in_start97);
													variable_ass();
													state._fsp--;

													}
													break;

											}

											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:109: ( COMMA identifier ( variable_ass )? )*
											loop5:
											while (true) {
												int alt5=2;
												int LA5_0 = input.LA(1);
												if ( (LA5_0==COMMA) ) {
													alt5=1;
												}

												switch (alt5) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:110: COMMA identifier ( variable_ass )?
													{
													match(input,COMMA,FOLLOW_COMMA_in_start101); 
													pushFollow(FOLLOW_identifier_in_start103);
													identifier();
													state._fsp--;

													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:127: ( variable_ass )?
													int alt4=2;
													int LA4_0 = input.LA(1);
													if ( (LA4_0==ASS) ) {
														alt4=1;
													}
													switch (alt4) {
														case 1 :
															// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:127: variable_ass
															{
															pushFollow(FOLLOW_variable_ass_in_start105);
															variable_ass();
															state._fsp--;

															}
															break;

													}

													}
													break;

												default :
													break loop5;
												}
											}

											}

											}
											break;
										case 2 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:146: vector
											{
											pushFollow(FOLLOW_vector_in_start113);
											vector();
											state._fsp--;

											}
											break;

									}

									match(input,SEMICOL,FOLLOW_SEMICOL_in_start116); 
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:165: function
									{
									pushFollow(FOLLOW_function_in_start121);
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

				default :
					break loop9;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start127); 
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



	// $ANTLR start "variable_ass"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:1: variable_ass : ASS ( expression | AMP identifier ) ;
	public final void variable_ass() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:15: ( ASS ( expression | AMP identifier ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:17: ASS ( expression | AMP identifier )
			{
			match(input,ASS,FOLLOW_ASS_in_variable_ass141); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:21: ( expression | AMP identifier )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= CHAR && LA10_0 <= CHAR_QUOTE)||LA10_0==FLOAT||LA10_0==INT||LA10_0==LPAREN||LA10_0==WORD) ) {
				alt10=1;
			}
			else if ( (LA10_0==AMP) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:22: expression
					{
					pushFollow(FOLLOW_expression_in_variable_ass144);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:35: AMP identifier
					{
					match(input,AMP,FOLLOW_AMP_in_variable_ass148); 
					pushFollow(FOLLOW_identifier_in_variable_ass150);
					identifier();
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
	// $ANTLR end "variable_ass"



	// $ANTLR start "vector"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:11: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:13: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector172); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:20: ( INT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:20: INT
					{
					match(input,INT,FOLLOW_INT_in_vector174); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector177); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:32: ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:33: ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					{
					match(input,ASS,FOLLOW_ASS_in_vector180); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:37: ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==LCURL) ) {
						alt13=1;
					}
					else if ( ((LA13_0 >= CHAR && LA13_0 <= CHAR_QUOTE)||LA13_0==FLOAT||LA13_0==INT||LA13_0==LPAREN||LA13_0==WORD) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:38: ( LCURL expression ( COMMA expression )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:38: ( LCURL expression ( COMMA expression )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:39: LCURL expression ( COMMA expression )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector184); 
							pushFollow(FOLLOW_expression_in_vector186);
							expression();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:56: ( COMMA expression )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==COMMA) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:57: COMMA expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector189); 
									pushFollow(FOLLOW_expression_in_vector191);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop12;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector195); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:85: expression
							{
							pushFollow(FOLLOW_expression_in_vector200);
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



	// $ANTLR start "puntator"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:1: puntator : MULT identifier ( ASS ( ( AMP identifier ) | ( expression ) ) )? ;
	public final void puntator() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:11: ( MULT identifier ( ASS ( ( AMP identifier ) | ( expression ) ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:13: MULT identifier ( ASS ( ( AMP identifier ) | ( expression ) ) )?
			{
			match(input,MULT,FOLLOW_MULT_in_puntator221); 
			pushFollow(FOLLOW_identifier_in_puntator223);
			identifier();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:29: ( ASS ( ( AMP identifier ) | ( expression ) ) )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ASS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:30: ASS ( ( AMP identifier ) | ( expression ) )
					{
					match(input,ASS,FOLLOW_ASS_in_puntator226); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:34: ( ( AMP identifier ) | ( expression ) )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==AMP) ) {
						alt15=1;
					}
					else if ( ((LA15_0 >= CHAR && LA15_0 <= CHAR_QUOTE)||LA15_0==FLOAT||LA15_0==INT||LA15_0==LPAREN||LA15_0==WORD) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:35: ( AMP identifier )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:35: ( AMP identifier )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:36: AMP identifier
							{
							match(input,AMP,FOLLOW_AMP_in_puntator230); 
							pushFollow(FOLLOW_identifier_in_puntator232);
							identifier();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:54: ( expression )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:54: ( expression )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:55: expression
							{
							pushFollow(FOLLOW_expression_in_puntator238);
							expression();
							state._fsp--;

							}

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
	// $ANTLR end "puntator"



	// $ANTLR start "function"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:12: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:14: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function263); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:21: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= K_CHAR && LA18_0 <= K_INT)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:22: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function266);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function268);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:43: ( COMMA type_name identifier )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:44: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function271); 
							pushFollow(FOLLOW_type_name_in_function273);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function275);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function281); 
			pushFollow(FOLLOW_codeblock_in_function283);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:1: call_function : LPAREN ( identifier ( COMMA identifier )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:16: ( LPAREN ( identifier ( COMMA identifier )* )? RPAREN )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:18: LPAREN ( identifier ( COMMA identifier )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function297); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:25: ( identifier ( COMMA identifier )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CHAR||LA20_0==WORD) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:26: identifier ( COMMA identifier )*
					{
					pushFollow(FOLLOW_identifier_in_call_function300);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:37: ( COMMA identifier )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==COMMA) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:38: COMMA identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function303); 
							pushFollow(FOLLOW_identifier_in_call_function306);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function312); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:1: codeblock : ( LCURL ( statement )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:13: ( LCURL ( statement )* RCURL | SEMICOL )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LCURL) ) {
				alt22=1;
			}
			else if ( (LA22_0==SEMICOL) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:15: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock331); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:21: ( statement )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==CHAR||LA21_0==FOR||LA21_0==IF||(LA21_0 >= K_CHAR && LA21_0 <= K_INT)||LA21_0==MULT||LA21_0==RETURN||(LA21_0 >= WHILE && LA21_0 <= WORD)) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:22: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock334);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop21;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock338); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock352); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:1: statement : ( ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) SEMICOL | ifStat | whileStat | forStat | RETURN value SEMICOL );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:13: ( ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) SEMICOL | ifStat | whileStat | forStat | RETURN value SEMICOL )
			int alt26=5;
			switch ( input.LA(1) ) {
			case CHAR:
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt26=1;
				}
				break;
			case IF:
				{
				alt26=2;
				}
				break;
			case WHILE:
				{
				alt26=3;
				}
				break;
			case FOR:
				{
				alt26=4;
				}
				break;
			case RETURN:
				{
				alt26=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) SEMICOL
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= K_CHAR && LA23_0 <= K_INT)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement368);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:26: ( identifier ( assignment | call_function | vector ) | puntator )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==CHAR||LA25_0==WORD) ) {
						alt25=1;
					}
					else if ( (LA25_0==MULT) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:27: identifier ( assignment | call_function | vector )
							{
							pushFollow(FOLLOW_identifier_in_statement372);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:38: ( assignment | call_function | vector )
							int alt24=3;
							switch ( input.LA(1) ) {
							case ADD:
							case ASS:
							case DIV:
							case MULT:
							case SEMICOL:
							case SUB:
								{
								alt24=1;
								}
								break;
							case LPAREN:
								{
								alt24=2;
								}
								break;
							case LBRACK:
								{
								alt24=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 24, 0, input);
								throw nvae;
							}
							switch (alt24) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:39: assignment
									{
									pushFollow(FOLLOW_assignment_in_statement375);
									assignment();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:52: call_function
									{
									pushFollow(FOLLOW_call_function_in_statement379);
									call_function();
									state._fsp--;

									}
									break;
								case 3 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:68: vector
									{
									pushFollow(FOLLOW_vector_in_statement383);
									vector();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:78: puntator
							{
							pushFollow(FOLLOW_puntator_in_statement388);
							puntator();
							state._fsp--;

							}
							break;

					}

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement391); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:7: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement399);
					ifStat();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:7: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement407);
					whileStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:58:7: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement415);
					forStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:9: RETURN value SEMICOL
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement425); 
					pushFollow(FOLLOW_value_in_statement427);
					value();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement429); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:1: ifStat : IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? ;
	public final void ifStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:10: ( IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:12: IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )?
			{
			match(input,IF,FOLLOW_IF_in_ifStat453); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat455); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:22: ( expression compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:23: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_ifStat458);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_ifStat460);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_ifStat462);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat465); 
			pushFollow(FOLLOW_codeblock_in_ifStat467);
			codeblock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:71: ( ELSE ( codeblock | ifStat | whileStat ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ELSE) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:72: ELSE ( codeblock | ifStat | whileStat )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat470); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:77: ( codeblock | ifStat | whileStat )
					int alt27=3;
					switch ( input.LA(1) ) {
					case LCURL:
					case SEMICOL:
						{
						alt27=1;
						}
						break;
					case IF:
						{
						alt27=2;
						}
						break;
					case WHILE:
						{
						alt27=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}
					switch (alt27) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:78: codeblock
							{
							pushFollow(FOLLOW_codeblock_in_ifStat473);
							codeblock();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:90: ifStat
							{
							pushFollow(FOLLOW_ifStat_in_ifStat477);
							ifStat();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:99: whileStat
							{
							pushFollow(FOLLOW_whileStat_in_ifStat481);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:1: whileStat : WHILE LPAREN ( expression compare expression ) RPAREN codeblock ;
	public final void whileStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:12: ( WHILE LPAREN ( expression compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:14: WHILE LPAREN ( expression compare expression ) RPAREN codeblock
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStat503); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat505); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:27: ( expression compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:28: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_whileStat508);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_whileStat510);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_whileStat512);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat515); 
			pushFollow(FOLLOW_codeblock_in_whileStat517);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:1: forStat : FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock ;
	public final void forStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:11: ( FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:13: FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock
			{
			match(input,FOR,FOLLOW_FOR_in_forStat536); 
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat538); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:24: ( ( type_name )? identifier ASS expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:25: ( type_name )? identifier ASS expression
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:25: ( type_name )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= K_CHAR && LA29_0 <= K_INT)) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:25: type_name
					{
					pushFollow(FOLLOW_type_name_in_forStat541);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_forStat544);
			identifier();
			state._fsp--;

			match(input,ASS,FOLLOW_ASS_in_forStat546); 
			pushFollow(FOLLOW_expression_in_forStat548);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat551); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:71: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:72: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat554);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat556);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat558);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat561); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:111: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:112: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat564);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat566);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat568);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat571); 
			pushFollow(FOLLOW_codeblock_in_forStat573);
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



	// $ANTLR start "assignment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:13: ( ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:15: ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:15: ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ADD||LA32_0==ASS||LA32_0==DIV||LA32_0==MULT||LA32_0==SUB) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:16: ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:16: ( ADD | SUB | MULT | DIV )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ADD||LA30_0==DIV||LA30_0==MULT||LA30_0==SUB) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

					match(input,ASS,FOLLOW_ASS_in_assignment610); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:46: ( expression | AMP identifier )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( ((LA31_0 >= CHAR && LA31_0 <= CHAR_QUOTE)||LA31_0==FLOAT||LA31_0==INT||LA31_0==LPAREN||LA31_0==WORD) ) {
						alt31=1;
					}
					else if ( (LA31_0==AMP) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:47: expression
							{
							pushFollow(FOLLOW_expression_in_assignment613);
							expression();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:60: AMP identifier
							{
							match(input,AMP,FOLLOW_AMP_in_assignment617); 
							pushFollow(FOLLOW_identifier_in_assignment619);
							identifier();
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
	// $ANTLR end "assignment"



	// $ANTLR start "type_name"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:1: identifier : ( WORD | CHAR ) ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:13: ( ( WORD | CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( input.LA(1)==CHAR||input.LA(1)==WORD ) {
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
	// $ANTLR end "identifier"



	// $ANTLR start "expression"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:1: expression : multiply_exp ( ADD multiply_exp | SUB multiply_exp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:14: ( multiply_exp ( ADD multiply_exp | SUB multiply_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:16: multiply_exp ( ADD multiply_exp | SUB multiply_exp )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression686);
			multiply_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:29: ( ADD multiply_exp | SUB multiply_exp )*
			loop33:
			while (true) {
				int alt33=3;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==ADD) ) {
					alt33=1;
				}
				else if ( (LA33_0==SUB) ) {
					alt33=2;
				}

				switch (alt33) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:30: ADD multiply_exp
					{
					match(input,ADD,FOLLOW_ADD_in_expression689); 
					pushFollow(FOLLOW_multiply_exp_in_expression691);
					multiply_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:49: SUB multiply_exp
					{
					match(input,SUB,FOLLOW_SUB_in_expression695); 
					pushFollow(FOLLOW_multiply_exp_in_expression697);
					multiply_exp();
					state._fsp--;

					}
					break;

				default :
					break loop33;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:1: multiply_exp : atom_exp ( MULT atom_exp | DIV atom_exp )* ;
	public final void multiply_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:15: ( atom_exp ( MULT atom_exp | DIV atom_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:17: atom_exp ( MULT atom_exp | DIV atom_exp )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp721);
			atom_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:26: ( MULT atom_exp | DIV atom_exp )*
			loop34:
			while (true) {
				int alt34=3;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==MULT) ) {
					alt34=1;
				}
				else if ( (LA34_0==DIV) ) {
					alt34=2;
				}

				switch (alt34) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:27: MULT atom_exp
					{
					match(input,MULT,FOLLOW_MULT_in_multiply_exp724); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp726);
					atom_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:43: DIV atom_exp
					{
					match(input,DIV,FOLLOW_DIV_in_multiply_exp730); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp732);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop34;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:1: atom_exp : ( INT | FLOAT | CHAR_QUOTE | identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:12: ( INT | FLOAT | CHAR_QUOTE | identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN )
			int alt36=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt36=1;
				}
				break;
			case FLOAT:
				{
				alt36=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt36=3;
				}
				break;
			case CHAR:
			case WORD:
				{
				alt36=4;
				}
				break;
			case LPAREN:
				{
				alt36=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:14: INT
					{
					match(input,INT,FOLLOW_INT_in_atom_exp752); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:87:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp760); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:7: CHAR_QUOTE
					{
					match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp770); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:7: identifier ( LBRACK INT RBRACK )?
					{
					pushFollow(FOLLOW_identifier_in_atom_exp778);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:18: ( LBRACK INT RBRACK )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==LBRACK) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:19: LBRACK INT RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp781); 
							match(input,INT,FOLLOW_INT_in_atom_exp783); 
							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp785); 
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp799); 
					pushFollow(FOLLOW_expression_in_atom_exp801);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp803); 
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



	// $ANTLR start "value"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:1: value : ( INT | identifier ) ;
	public final void value() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:10: ( ( INT | identifier ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:12: ( INT | identifier )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:12: ( INT | identifier )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==INT) ) {
				alt37=1;
			}
			else if ( (LA37_0==CHAR||LA37_0==WORD) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:13: INT
					{
					match(input,INT,FOLLOW_INT_in_value823); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:19: identifier
					{
					pushFollow(FOLLOW_identifier_in_value827);
					identifier();
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
	// $ANTLR end "value"



	// $ANTLR start "compare"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:1: compare : ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) );
	public final void compare() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:11: ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) )
			int alt39=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt39=1;
				}
				break;
			case NEQ:
				{
				alt39=2;
				}
				break;
			case LT:
				{
				alt39=3;
				}
				break;
			case GT:
				{
				alt39=4;
				}
				break;
			case LE:
				{
				alt39=5;
				}
				break;
			case GE:
				{
				alt39=6;
				}
				break;
			case ADD:
			case ASS:
			case DIV:
			case MULT:
			case SUB:
				{
				alt39=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:13: EQ
					{
					match(input,EQ,FOLLOW_EQ_in_compare844); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:18: NEQ
					{
					match(input,NEQ,FOLLOW_NEQ_in_compare848); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:24: LT
					{
					match(input,LT,FOLLOW_LT_in_compare852); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:29: GT
					{
					match(input,GT,FOLLOW_GT_in_compare856); 
					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:34: LE
					{
					match(input,LE,FOLLOW_LE_in_compare860); 
					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:39: GE
					{
					match(input,GE,FOLLOW_GE_in_compare864); 
					}
					break;
				case 7 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:45: ( ADD | SUB | MULT | DIV )? ASS
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:45: ( ADD | SUB | MULT | DIV )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==ADD||LA38_0==DIV||LA38_0==MULT||LA38_0==SUB) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

					match(input,ASS,FOLLOW_ASS_in_compare886); 
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



	public static final BitSet FOLLOW_INCLUDE_in_start68 = new BitSet(new long[]{0x000A00041C000100L});
	public static final BitSet FOLLOW_VOID_in_start73 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_start75 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_function_in_start77 = new BitSet(new long[]{0x000A00041C000100L});
	public static final BitSet FOLLOW_type_name_in_start81 = new BitSet(new long[]{0x0008000400000100L});
	public static final BitSet FOLLOW_puntator_in_start85 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start87 = new BitSet(new long[]{0x000A00041C000100L});
	public static final BitSet FOLLOW_identifier_in_start91 = new BitSet(new long[]{0x0000020120000480L});
	public static final BitSet FOLLOW_variable_ass_in_start97 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_COMMA_in_start101 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_start103 = new BitSet(new long[]{0x0000020000000480L});
	public static final BitSet FOLLOW_variable_ass_in_start105 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_vector_in_start113 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start116 = new BitSet(new long[]{0x000A00041C000100L});
	public static final BitSet FOLLOW_function_in_start121 = new BitSet(new long[]{0x000A00041C000100L});
	public static final BitSet FOLLOW_EOF_in_start127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_variable_ass141 = new BitSet(new long[]{0x0008000102080320L});
	public static final BitSet FOLLOW_expression_in_variable_ass144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_variable_ass148 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_variable_ass150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector172 = new BitSet(new long[]{0x0000002002000000L});
	public static final BitSet FOLLOW_INT_in_vector174 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector177 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector180 = new BitSet(new long[]{0x0008000142080300L});
	public static final BitSet FOLLOW_LCURL_in_vector184 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_vector186 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector189 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_vector191 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_vector200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_puntator221 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_puntator223 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_puntator226 = new BitSet(new long[]{0x0008000102080320L});
	public static final BitSet FOLLOW_AMP_in_puntator230 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_puntator232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_puntator238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function263 = new BitSet(new long[]{0x000001001C000000L});
	public static final BitSet FOLLOW_type_name_in_function266 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_function268 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_function271 = new BitSet(new long[]{0x000000001C000000L});
	public static final BitSet FOLLOW_type_name_in_function273 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_function275 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RPAREN_in_function281 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_codeblock_in_function283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function297 = new BitSet(new long[]{0x0008010000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function300 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_call_function303 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function306 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RPAREN_in_call_function312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock331 = new BitSet(new long[]{0x000C00C41C900100L});
	public static final BitSet FOLLOW_statement_in_codeblock334 = new BitSet(new long[]{0x000C00C41C900100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement368 = new BitSet(new long[]{0x0008000400000100L});
	public static final BitSet FOLLOW_identifier_in_statement372 = new BitSet(new long[]{0x0000120520004090L});
	public static final BitSet FOLLOW_assignment_in_statement375 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_call_function_in_statement379 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_vector_in_statement383 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_puntator_in_statement388 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement425 = new BitSet(new long[]{0x0008000002000100L});
	public static final BitSet FOLLOW_value_in_statement427 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat453 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat455 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_ifStat458 = new BitSet(new long[]{0x0000100E80644090L});
	public static final BitSet FOLLOW_compare_in_ifStat460 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_ifStat462 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat465 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat467 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat470 = new BitSet(new long[]{0x0004020040800000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStat477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_ifStat481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat503 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat505 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_whileStat508 = new BitSet(new long[]{0x0000100E80644090L});
	public static final BitSet FOLLOW_compare_in_whileStat510 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_whileStat512 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat515 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_codeblock_in_whileStat517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat536 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat538 = new BitSet(new long[]{0x000800001C000100L});
	public static final BitSet FOLLOW_type_name_in_forStat541 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat544 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_forStat546 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_forStat548 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat551 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat554 = new BitSet(new long[]{0x0000100E80644090L});
	public static final BitSet FOLLOW_compare_in_forStat556 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_forStat558 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat561 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat564 = new BitSet(new long[]{0x0000100E80644090L});
	public static final BitSet FOLLOW_compare_in_forStat566 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_forStat568 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat571 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_codeblock_in_forStat573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment610 = new BitSet(new long[]{0x0008000102080320L});
	public static final BitSet FOLLOW_expression_in_assignment613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_assignment617 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_assignment619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression686 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_ADD_in_expression689 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression691 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_SUB_in_expression695 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression697 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp721 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp724 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp726 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp730 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp732 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom_exp778 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp781 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp783 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp799 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_atom_exp801 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_value827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_compare844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_compare848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_compare852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_compare856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_compare860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_compare864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_compare886 = new BitSet(new long[]{0x0000000000000002L});
}
