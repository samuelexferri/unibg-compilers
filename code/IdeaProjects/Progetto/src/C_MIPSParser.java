// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-07 14:47:41

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
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g"; }


		// int test;



	// $ANTLR start "start"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:1: start : ( INCLUDE )? ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:9: ( ( INCLUDE )? ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )* EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:11: ( INCLUDE )? ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )* EOF
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:11: ( INCLUDE )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INCLUDE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:11: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_start67); 
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:20: ( VOID identifier function | ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) ) )*
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:22: VOID identifier function
					{
					match(input,VOID,FOLLOW_VOID_in_start72); 
					pushFollow(FOLLOW_identifier_in_start74);
					identifier();
					state._fsp--;

					pushFollow(FOLLOW_function_in_start76);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:49: ( type_name )? ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:49: ( type_name )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( ((LA2_0 >= K_CHAR && LA2_0 <= K_INT)) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:49: type_name
							{
							pushFollow(FOLLOW_type_name_in_start80);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:60: ( puntator SEMICOL | identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function ) )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:61: puntator SEMICOL
							{
							pushFollow(FOLLOW_puntator_in_start84);
							puntator();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_start86); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:80: identifier ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function )
							{
							pushFollow(FOLLOW_identifier_in_start90);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:91: ( ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL ) | function )
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:92: ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:92: ( ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:93: ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector ) SEMICOL
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:93: ( ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* ) | vector )
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:94: ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* )
											{
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:94: ( ( variable_ass )? ( COMMA identifier ( variable_ass )? )* )
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:95: ( variable_ass )? ( COMMA identifier ( variable_ass )? )*
											{
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:95: ( variable_ass )?
											int alt3=2;
											int LA3_0 = input.LA(1);
											if ( (LA3_0==ASS) ) {
												alt3=1;
											}
											switch (alt3) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:95: variable_ass
													{
													pushFollow(FOLLOW_variable_ass_in_start96);
													variable_ass();
													state._fsp--;

													}
													break;

											}

											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:109: ( COMMA identifier ( variable_ass )? )*
											loop5:
											while (true) {
												int alt5=2;
												int LA5_0 = input.LA(1);
												if ( (LA5_0==COMMA) ) {
													alt5=1;
												}

												switch (alt5) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:110: COMMA identifier ( variable_ass )?
													{
													match(input,COMMA,FOLLOW_COMMA_in_start100); 
													pushFollow(FOLLOW_identifier_in_start102);
													identifier();
													state._fsp--;

													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:127: ( variable_ass )?
													int alt4=2;
													int LA4_0 = input.LA(1);
													if ( (LA4_0==ASS) ) {
														alt4=1;
													}
													switch (alt4) {
														case 1 :
															// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:127: variable_ass
															{
															pushFollow(FOLLOW_variable_ass_in_start104);
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:146: vector
											{
											pushFollow(FOLLOW_vector_in_start112);
											vector();
											state._fsp--;

											}
											break;

									}

									match(input,SEMICOL,FOLLOW_SEMICOL_in_start115); 
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:165: function
									{
									pushFollow(FOLLOW_function_in_start120);
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

			match(input,EOF,FOLLOW_EOF_in_start126); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:1: variable_ass : ASS ( expression | AMP identifier ) ;
	public final void variable_ass() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:15: ( ASS ( expression | AMP identifier ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:17: ASS ( expression | AMP identifier )
			{
			match(input,ASS,FOLLOW_ASS_in_variable_ass140); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:21: ( expression | AMP identifier )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:22: expression
					{
					pushFollow(FOLLOW_expression_in_variable_ass143);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:35: AMP identifier
					{
					match(input,AMP,FOLLOW_AMP_in_variable_ass147); 
					pushFollow(FOLLOW_identifier_in_variable_ass149);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:11: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:13: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector171); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:20: ( INT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:20: INT
					{
					match(input,INT,FOLLOW_INT_in_vector173); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector176); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:32: ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:33: ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					{
					match(input,ASS,FOLLOW_ASS_in_vector179); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:37: ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:38: ( LCURL expression ( COMMA expression )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:38: ( LCURL expression ( COMMA expression )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:39: LCURL expression ( COMMA expression )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector183); 
							pushFollow(FOLLOW_expression_in_vector185);
							expression();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:56: ( COMMA expression )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==COMMA) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:57: COMMA expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector188); 
									pushFollow(FOLLOW_expression_in_vector190);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop12;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector194); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:85: expression
							{
							pushFollow(FOLLOW_expression_in_vector199);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:1: puntator : MULT identifier ( ASS ( ( AMP identifier ) | ( expression ) ) )? ;
	public final void puntator() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:11: ( MULT identifier ( ASS ( ( AMP identifier ) | ( expression ) ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:13: MULT identifier ( ASS ( ( AMP identifier ) | ( expression ) ) )?
			{
			match(input,MULT,FOLLOW_MULT_in_puntator220); 
			pushFollow(FOLLOW_identifier_in_puntator222);
			identifier();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:29: ( ASS ( ( AMP identifier ) | ( expression ) ) )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ASS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:30: ASS ( ( AMP identifier ) | ( expression ) )
					{
					match(input,ASS,FOLLOW_ASS_in_puntator225); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:34: ( ( AMP identifier ) | ( expression ) )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:35: ( AMP identifier )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:35: ( AMP identifier )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:36: AMP identifier
							{
							match(input,AMP,FOLLOW_AMP_in_puntator229); 
							pushFollow(FOLLOW_identifier_in_puntator231);
							identifier();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:54: ( expression )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:54: ( expression )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:55: expression
							{
							pushFollow(FOLLOW_expression_in_puntator237);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:12: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:14: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function262); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:21: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= K_CHAR && LA18_0 <= K_INT)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:22: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function265);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function267);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:43: ( COMMA type_name identifier )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:44: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function270); 
							pushFollow(FOLLOW_type_name_in_function272);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function274);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_function280); 
			pushFollow(FOLLOW_codeblock_in_function282);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:1: call_function : LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:16: ( LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )? RPAREN )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:18: LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function296); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:25: ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CHAR||LA24_0==D_QUOTE||LA24_0==WORD) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:26: ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )*
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:26: ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==D_QUOTE) ) {
						alt20=1;
					}
					else if ( (LA20_0==CHAR||LA20_0==WORD) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:27: ( D_QUOTE ( anything )* D_QUOTE )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:27: ( D_QUOTE ( anything )* D_QUOTE )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:28: D_QUOTE ( anything )* D_QUOTE
							{
							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function301); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:36: ( anything )*
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( ((LA19_0 >= ADD && LA19_0 <= AMP)||(LA19_0 >= ASS && LA19_0 <= CHAR)||LA19_0==DIV||(LA19_0 >= FLOAT && LA19_0 <= FOR)||(LA19_0 >= HASHTAG && LA19_0 <= IF)||LA19_0==INT||LA19_0==MULT||LA19_0==PERC||(LA19_0 >= SPACE && LA19_0 <= SUB)||(LA19_0 >= WHILE && LA19_0 <= WS)) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:36: anything
									{
									pushFollow(FOLLOW_anything_in_call_function303);
									anything();
									state._fsp--;

									}
									break;

								default :
									break loop19;
								}
							}

							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function306); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:57: identifier
							{
							pushFollow(FOLLOW_identifier_in_call_function311);
							identifier();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:69: ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==COMMA) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:70: COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier )
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function315); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:76: ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier )
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==D_QUOTE) ) {
								alt22=1;
							}
							else if ( (LA22_0==CHAR||LA22_0==WORD) ) {
								alt22=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 22, 0, input);
								throw nvae;
							}

							switch (alt22) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:77: ( D_QUOTE ( anything )* D_QUOTE )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:77: ( D_QUOTE ( anything )* D_QUOTE )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:78: D_QUOTE ( anything )* D_QUOTE
									{
									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function319); 
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:86: ( anything )*
									loop21:
									while (true) {
										int alt21=2;
										int LA21_0 = input.LA(1);
										if ( ((LA21_0 >= ADD && LA21_0 <= AMP)||(LA21_0 >= ASS && LA21_0 <= CHAR)||LA21_0==DIV||(LA21_0 >= FLOAT && LA21_0 <= FOR)||(LA21_0 >= HASHTAG && LA21_0 <= IF)||LA21_0==INT||LA21_0==MULT||LA21_0==PERC||(LA21_0 >= SPACE && LA21_0 <= SUB)||(LA21_0 >= WHILE && LA21_0 <= WS)) ) {
											alt21=1;
										}

										switch (alt21) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:86: anything
											{
											pushFollow(FOLLOW_anything_in_call_function321);
											anything();
											state._fsp--;

											}
											break;

										default :
											break loop21;
										}
									}

									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function324); 
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:107: identifier
									{
									pushFollow(FOLLOW_identifier_in_call_function329);
									identifier();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function336); 
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



	// $ANTLR start "anything"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:1: anything : ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS );
	public final void anything() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:11: ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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



	// $ANTLR start "codeblock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:1: codeblock : ( LCURL ( statement )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:13: ( LCURL ( statement )* RCURL | SEMICOL )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LCURL) ) {
				alt26=1;
			}
			else if ( (LA26_0==SEMICOL) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:15: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock438); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:21: ( statement )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==CHAR||LA25_0==FOR||LA25_0==IF||(LA25_0 >= K_CHAR && LA25_0 <= K_INT)||LA25_0==MULT||LA25_0==RETURN||(LA25_0 >= WHILE && LA25_0 <= WORD)) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:22: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock441);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop25;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock445); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:54:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock459); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:1: statement : ( ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) SEMICOL | ifStat | whileStat | forStat | RETURN value SEMICOL );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:13: ( ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) SEMICOL | ifStat | whileStat | forStat | RETURN value SEMICOL )
			int alt30=5;
			switch ( input.LA(1) ) {
			case CHAR:
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt30=1;
				}
				break;
			case IF:
				{
				alt30=2;
				}
				break;
			case WHILE:
				{
				alt30=3;
				}
				break;
			case FOR:
				{
				alt30=4;
				}
				break;
			case RETURN:
				{
				alt30=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:15: ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) SEMICOL
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:15: ( type_name )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= K_CHAR && LA27_0 <= K_INT)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement475);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:26: ( identifier ( assignment | call_function | vector ) | puntator )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==CHAR||LA29_0==WORD) ) {
						alt29=1;
					}
					else if ( (LA29_0==MULT) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:27: identifier ( assignment | call_function | vector )
							{
							pushFollow(FOLLOW_identifier_in_statement479);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:38: ( assignment | call_function | vector )
							int alt28=3;
							switch ( input.LA(1) ) {
							case ADD:
							case ASS:
							case DIV:
							case MULT:
							case SEMICOL:
							case SUB:
								{
								alt28=1;
								}
								break;
							case LPAREN:
								{
								alt28=2;
								}
								break;
							case LBRACK:
								{
								alt28=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 28, 0, input);
								throw nvae;
							}
							switch (alt28) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:39: assignment
									{
									pushFollow(FOLLOW_assignment_in_statement482);
									assignment();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:52: call_function
									{
									pushFollow(FOLLOW_call_function_in_statement486);
									call_function();
									state._fsp--;

									}
									break;
								case 3 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:68: vector
									{
									pushFollow(FOLLOW_vector_in_statement490);
									vector();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:78: puntator
							{
							pushFollow(FOLLOW_puntator_in_statement495);
							puntator();
							state._fsp--;

							}
							break;

					}

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement498); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:58:7: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement506);
					ifStat();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:7: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement514);
					whileStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:7: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement522);
					forStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:9: RETURN value SEMICOL
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement532); 
					pushFollow(FOLLOW_value_in_statement534);
					value();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement536); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:1: ifStat : IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? ;
	public final void ifStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:10: ( IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:12: IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )?
			{
			match(input,IF,FOLLOW_IF_in_ifStat560); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat562); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:22: ( expression compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:23: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_ifStat565);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_ifStat567);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_ifStat569);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat572); 
			pushFollow(FOLLOW_codeblock_in_ifStat574);
			codeblock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:71: ( ELSE ( codeblock | ifStat | whileStat ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ELSE) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:72: ELSE ( codeblock | ifStat | whileStat )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat577); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:77: ( codeblock | ifStat | whileStat )
					int alt31=3;
					switch ( input.LA(1) ) {
					case LCURL:
					case SEMICOL:
						{
						alt31=1;
						}
						break;
					case IF:
						{
						alt31=2;
						}
						break;
					case WHILE:
						{
						alt31=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}
					switch (alt31) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:78: codeblock
							{
							pushFollow(FOLLOW_codeblock_in_ifStat580);
							codeblock();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:90: ifStat
							{
							pushFollow(FOLLOW_ifStat_in_ifStat584);
							ifStat();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:99: whileStat
							{
							pushFollow(FOLLOW_whileStat_in_ifStat588);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:1: whileStat : WHILE LPAREN ( expression compare expression ) RPAREN codeblock ;
	public final void whileStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:12: ( WHILE LPAREN ( expression compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:14: WHILE LPAREN ( expression compare expression ) RPAREN codeblock
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStat610); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat612); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:27: ( expression compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:28: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_whileStat615);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_whileStat617);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_whileStat619);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat622); 
			pushFollow(FOLLOW_codeblock_in_whileStat624);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:1: forStat : FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock ;
	public final void forStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:11: ( FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:13: FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock
			{
			match(input,FOR,FOLLOW_FOR_in_forStat643); 
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat645); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:24: ( ( type_name )? identifier ASS expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:25: ( type_name )? identifier ASS expression
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:25: ( type_name )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( ((LA33_0 >= K_CHAR && LA33_0 <= K_INT)) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:25: type_name
					{
					pushFollow(FOLLOW_type_name_in_forStat648);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_forStat651);
			identifier();
			state._fsp--;

			match(input,ASS,FOLLOW_ASS_in_forStat653); 
			pushFollow(FOLLOW_expression_in_forStat655);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat658); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:71: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:72: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat661);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat663);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat665);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat668); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:111: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:112: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat671);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat673);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat675);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat678); 
			pushFollow(FOLLOW_codeblock_in_forStat680);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:13: ( ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:15: ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:15: ( ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier ) )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==ADD||LA36_0==ASS||LA36_0==DIV||LA36_0==MULT||LA36_0==SUB) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:16: ( ADD | SUB | MULT | DIV )? ASS ( expression | AMP identifier )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:16: ( ADD | SUB | MULT | DIV )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ADD||LA34_0==DIV||LA34_0==MULT||LA34_0==SUB) ) {
						alt34=1;
					}
					switch (alt34) {
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

					match(input,ASS,FOLLOW_ASS_in_assignment717); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:46: ( expression | AMP identifier )
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( ((LA35_0 >= CHAR && LA35_0 <= CHAR_QUOTE)||LA35_0==FLOAT||LA35_0==INT||LA35_0==LPAREN||LA35_0==WORD) ) {
						alt35=1;
					}
					else if ( (LA35_0==AMP) ) {
						alt35=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}

					switch (alt35) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:47: expression
							{
							pushFollow(FOLLOW_expression_in_assignment720);
							expression();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:60: AMP identifier
							{
							match(input,AMP,FOLLOW_AMP_in_assignment724); 
							pushFollow(FOLLOW_identifier_in_assignment726);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:76:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:76:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:1: identifier : ( WORD | CHAR ) ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:13: ( ( WORD | CHAR ) )
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:1: expression : multiply_exp ( ADD multiply_exp | SUB multiply_exp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:14: ( multiply_exp ( ADD multiply_exp | SUB multiply_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:16: multiply_exp ( ADD multiply_exp | SUB multiply_exp )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression793);
			multiply_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:29: ( ADD multiply_exp | SUB multiply_exp )*
			loop37:
			while (true) {
				int alt37=3;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ADD) ) {
					alt37=1;
				}
				else if ( (LA37_0==SUB) ) {
					alt37=2;
				}

				switch (alt37) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:30: ADD multiply_exp
					{
					match(input,ADD,FOLLOW_ADD_in_expression796); 
					pushFollow(FOLLOW_multiply_exp_in_expression798);
					multiply_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:49: SUB multiply_exp
					{
					match(input,SUB,FOLLOW_SUB_in_expression802); 
					pushFollow(FOLLOW_multiply_exp_in_expression804);
					multiply_exp();
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
	// $ANTLR end "expression"



	// $ANTLR start "multiply_exp"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:1: multiply_exp : atom_exp ( MULT atom_exp | DIV atom_exp )* ;
	public final void multiply_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:15: ( atom_exp ( MULT atom_exp | DIV atom_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:17: atom_exp ( MULT atom_exp | DIV atom_exp )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp828);
			atom_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:26: ( MULT atom_exp | DIV atom_exp )*
			loop38:
			while (true) {
				int alt38=3;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==MULT) ) {
					alt38=1;
				}
				else if ( (LA38_0==DIV) ) {
					alt38=2;
				}

				switch (alt38) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:27: MULT atom_exp
					{
					match(input,MULT,FOLLOW_MULT_in_multiply_exp831); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp833);
					atom_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:43: DIV atom_exp
					{
					match(input,DIV,FOLLOW_DIV_in_multiply_exp837); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp839);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop38;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:1: atom_exp : ( INT | FLOAT | CHAR_QUOTE | identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:12: ( INT | FLOAT | CHAR_QUOTE | identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN )
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
			case CHAR:
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:14: INT
					{
					match(input,INT,FOLLOW_INT_in_atom_exp859); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp867); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:7: CHAR_QUOTE
					{
					match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp877); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:7: identifier ( LBRACK INT RBRACK )?
					{
					pushFollow(FOLLOW_identifier_in_atom_exp885);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:18: ( LBRACK INT RBRACK )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==LBRACK) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:19: LBRACK INT RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp888); 
							match(input,INT,FOLLOW_INT_in_atom_exp890); 
							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp892); 
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp906); 
					pushFollow(FOLLOW_expression_in_atom_exp908);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp910); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:1: value : ( INT | ( MULT | AMP )? identifier ) ;
	public final void value() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:10: ( ( INT | ( MULT | AMP )? identifier ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:12: ( INT | ( MULT | AMP )? identifier )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:12: ( INT | ( MULT | AMP )? identifier )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==INT) ) {
				alt42=1;
			}
			else if ( (LA42_0==AMP||LA42_0==CHAR||LA42_0==MULT||LA42_0==WORD) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:13: INT
					{
					match(input,INT,FOLLOW_INT_in_value930); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:19: ( MULT | AMP )? identifier
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:19: ( MULT | AMP )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==AMP||LA41_0==MULT) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

					pushFollow(FOLLOW_identifier_in_value943);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:1: compare : ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) );
	public final void compare() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:11: ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) )
			int alt44=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt44=1;
				}
				break;
			case NEQ:
				{
				alt44=2;
				}
				break;
			case LT:
				{
				alt44=3;
				}
				break;
			case GT:
				{
				alt44=4;
				}
				break;
			case LE:
				{
				alt44=5;
				}
				break;
			case GE:
				{
				alt44=6;
				}
				break;
			case ADD:
			case ASS:
			case DIV:
			case MULT:
			case SUB:
				{
				alt44=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:13: EQ
					{
					match(input,EQ,FOLLOW_EQ_in_compare959); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:18: NEQ
					{
					match(input,NEQ,FOLLOW_NEQ_in_compare963); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:24: LT
					{
					match(input,LT,FOLLOW_LT_in_compare967); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:29: GT
					{
					match(input,GT,FOLLOW_GT_in_compare971); 
					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:34: LE
					{
					match(input,LE,FOLLOW_LE_in_compare975); 
					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:39: GE
					{
					match(input,GE,FOLLOW_GE_in_compare979); 
					}
					break;
				case 7 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:45: ( ADD | SUB | MULT | DIV )? ASS
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:45: ( ADD | SUB | MULT | DIV )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==ADD||LA43_0==DIV||LA43_0==MULT||LA43_0==SUB) ) {
						alt43=1;
					}
					switch (alt43) {
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

					match(input,ASS,FOLLOW_ASS_in_compare1001); 
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



	public static final BitSet FOLLOW_INCLUDE_in_start67 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_VOID_in_start72 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_start74 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_function_in_start76 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_type_name_in_start80 = new BitSet(new long[]{0x0020000800000100L});
	public static final BitSet FOLLOW_puntator_in_start84 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start86 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_identifier_in_start90 = new BitSet(new long[]{0x0000080240000480L});
	public static final BitSet FOLLOW_variable_ass_in_start96 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_start100 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_start102 = new BitSet(new long[]{0x0000080000000480L});
	public static final BitSet FOLLOW_variable_ass_in_start104 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_vector_in_start112 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start115 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_function_in_start120 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_EOF_in_start126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_variable_ass140 = new BitSet(new long[]{0x0020000204080320L});
	public static final BitSet FOLLOW_expression_in_variable_ass143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_variable_ass147 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_variable_ass149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector171 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_INT_in_vector173 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector176 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector179 = new BitSet(new long[]{0x0020000284080300L});
	public static final BitSet FOLLOW_LCURL_in_vector183 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_vector185 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector188 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_vector190 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_vector199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_puntator220 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_puntator222 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_puntator225 = new BitSet(new long[]{0x0020000204080320L});
	public static final BitSet FOLLOW_AMP_in_puntator229 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_puntator231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_puntator237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function262 = new BitSet(new long[]{0x0000040038000000L});
	public static final BitSet FOLLOW_type_name_in_function265 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_function267 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_function270 = new BitSet(new long[]{0x0000000038000000L});
	public static final BitSet FOLLOW_type_name_in_function272 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_function274 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_function280 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_function282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function296 = new BitSet(new long[]{0x0020040000010100L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function301 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function303 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function306 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_identifier_in_call_function311 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_call_function315 = new BitSet(new long[]{0x0020000000010100L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function319 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function321 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function324 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_identifier_in_call_function329 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_call_function336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock438 = new BitSet(new long[]{0x0030030839100100L});
	public static final BitSet FOLLOW_statement_in_codeblock441 = new BitSet(new long[]{0x0030030839100100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement475 = new BitSet(new long[]{0x0020000800000100L});
	public static final BitSet FOLLOW_identifier_in_statement479 = new BitSet(new long[]{0x0000480A40004090L});
	public static final BitSet FOLLOW_assignment_in_statement482 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_call_function_in_statement486 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_vector_in_statement490 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_puntator_in_statement495 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement532 = new BitSet(new long[]{0x0020000804000120L});
	public static final BitSet FOLLOW_value_in_statement534 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat560 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat562 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_ifStat565 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_ifStat567 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_ifStat569 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat572 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat574 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat577 = new BitSet(new long[]{0x0010080081000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStat584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_ifStat588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat610 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat612 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_whileStat615 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_whileStat617 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_whileStat619 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat622 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_whileStat624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat643 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat645 = new BitSet(new long[]{0x0020000038000100L});
	public static final BitSet FOLLOW_type_name_in_forStat648 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat651 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_forStat653 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_forStat655 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat658 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat661 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat663 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_forStat665 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat668 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat671 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat673 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_forStat675 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat678 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_forStat680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment717 = new BitSet(new long[]{0x0020000204080320L});
	public static final BitSet FOLLOW_expression_in_assignment720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_assignment724 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_assignment726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression793 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_ADD_in_expression796 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression798 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_SUB_in_expression802 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression804 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp828 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp831 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp833 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp837 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp839 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom_exp885 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp888 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp890 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp906 = new BitSet(new long[]{0x0020000204080300L});
	public static final BitSet FOLLOW_expression_in_atom_exp908 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_value943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_compare959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_compare963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_compare967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_compare971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_compare975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_compare979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_compare1001 = new BitSet(new long[]{0x0000000000000002L});
}
