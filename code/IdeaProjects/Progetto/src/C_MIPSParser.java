// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-07 13:46:19

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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:1: variable_ass : ASS ( type_value | AMP identifier ) ;
	public final void variable_ass() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:15: ( ASS ( type_value | AMP identifier ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:17: ASS ( type_value | AMP identifier )
			{
			match(input,ASS,FOLLOW_ASS_in_variable_ass141); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:21: ( type_value | AMP identifier )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:22: type_value
					{
					pushFollow(FOLLOW_type_value_in_variable_ass144);
					type_value();
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:11: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:13: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )?
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:32: ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:33: ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value )
					{
					match(input,ASS,FOLLOW_ASS_in_vector180); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:37: ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:38: ( LCURL type_value ( COMMA type_value )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:38: ( LCURL type_value ( COMMA type_value )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:39: LCURL type_value ( COMMA type_value )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector184); 
							pushFollow(FOLLOW_type_value_in_vector186);
							type_value();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:56: ( COMMA type_value )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==COMMA) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:57: COMMA type_value
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector189); 
									pushFollow(FOLLOW_type_value_in_vector191);
									type_value();
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:85: type_value
							{
							pushFollow(FOLLOW_type_value_in_vector200);
							type_value();
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:1: puntator : MULT identifier ( ASS ( ( AMP identifier ) | ( type_value ) ) )? ;
	public final void puntator() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:11: ( MULT identifier ( ASS ( ( AMP identifier ) | ( type_value ) ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:13: MULT identifier ( ASS ( ( AMP identifier ) | ( type_value ) ) )?
			{
			match(input,MULT,FOLLOW_MULT_in_puntator221); 
			pushFollow(FOLLOW_identifier_in_puntator223);
			identifier();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:29: ( ASS ( ( AMP identifier ) | ( type_value ) ) )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ASS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:30: ASS ( ( AMP identifier ) | ( type_value ) )
					{
					match(input,ASS,FOLLOW_ASS_in_puntator226); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:34: ( ( AMP identifier ) | ( type_value ) )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:54: ( type_value )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:54: ( type_value )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:55: type_value
							{
							pushFollow(FOLLOW_type_value_in_puntator238);
							type_value();
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:1: codeblock : ( LCURL ( statement SEMICOL )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:13: ( LCURL ( statement SEMICOL )* RCURL | SEMICOL )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:15: LCURL ( statement SEMICOL )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock331); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:21: ( statement SEMICOL )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==CHAR||(LA21_0 >= K_CHAR && LA21_0 <= K_INT)||LA21_0==MULT||LA21_0==RETURN||LA21_0==WORD) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:22: statement SEMICOL
							{
							pushFollow(FOLLOW_statement_in_codeblock334);
							statement();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock336); 
							}
							break;

						default :
							break loop21;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock340); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock354); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:1: statement : ( ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) | RETURN value );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:13: ( ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator ) | RETURN value )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==CHAR||(LA26_0 >= K_CHAR && LA26_0 <= K_INT)||LA26_0==MULT||LA26_0==WORD) ) {
				alt26=1;
			}
			else if ( (LA26_0==RETURN) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )? ( identifier ( assignment | call_function | vector ) | puntator )
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
							pushFollow(FOLLOW_type_name_in_statement371);
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
							pushFollow(FOLLOW_identifier_in_statement375);
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
									pushFollow(FOLLOW_assignment_in_statement378);
									assignment();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:52: call_function
									{
									pushFollow(FOLLOW_call_function_in_statement382);
									call_function();
									state._fsp--;

									}
									break;
								case 3 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:68: vector
									{
									pushFollow(FOLLOW_vector_in_statement386);
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
							pushFollow(FOLLOW_puntator_in_statement391);
							puntator();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:9: RETURN value
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement402); 
					pushFollow(FOLLOW_value_in_statement404);
					value();
					state._fsp--;

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



	// $ANTLR start "assignment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS ( type_value | AMP identifier ) )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:13: ( ( ( ADD | SUB | MULT | DIV )? ASS ( type_value | AMP identifier ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:15: ( ( ADD | SUB | MULT | DIV )? ASS ( type_value | AMP identifier ) )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:15: ( ( ADD | SUB | MULT | DIV )? ASS ( type_value | AMP identifier ) )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ADD||LA29_0==ASS||LA29_0==DIV||LA29_0==MULT||LA29_0==SUB) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:16: ( ADD | SUB | MULT | DIV )? ASS ( type_value | AMP identifier )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:16: ( ADD | SUB | MULT | DIV )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ADD||LA27_0==DIV||LA27_0==MULT||LA27_0==SUB) ) {
						alt27=1;
					}
					switch (alt27) {
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

					match(input,ASS,FOLLOW_ASS_in_assignment440); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:46: ( type_value | AMP identifier )
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= CHAR && LA28_0 <= CHAR_QUOTE)||LA28_0==FLOAT||LA28_0==INT||LA28_0==LPAREN||LA28_0==WORD) ) {
						alt28=1;
					}
					else if ( (LA28_0==AMP) ) {
						alt28=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:47: type_value
							{
							pushFollow(FOLLOW_type_value_in_assignment443);
							type_value();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:60: AMP identifier
							{
							match(input,AMP,FOLLOW_AMP_in_assignment447); 
							pushFollow(FOLLOW_identifier_in_assignment449);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:1: identifier : ( WORD | CHAR ) ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:13: ( ( WORD | CHAR ) )
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



	// $ANTLR start "type_value"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:1: type_value : expression ;
	public final void type_value() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:13: ( expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:15: expression
			{
			pushFollow(FOLLOW_expression_in_type_value515);
			expression();
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
	// $ANTLR end "type_value"



	// $ANTLR start "expression"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:1: expression : multiply_exp ( ADD multiply_exp | SUB multiply_exp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:14: ( multiply_exp ( ADD multiply_exp | SUB multiply_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:16: multiply_exp ( ADD multiply_exp | SUB multiply_exp )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression530);
			multiply_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:29: ( ADD multiply_exp | SUB multiply_exp )*
			loop30:
			while (true) {
				int alt30=3;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==ADD) ) {
					alt30=1;
				}
				else if ( (LA30_0==SUB) ) {
					alt30=2;
				}

				switch (alt30) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:30: ADD multiply_exp
					{
					match(input,ADD,FOLLOW_ADD_in_expression533); 
					pushFollow(FOLLOW_multiply_exp_in_expression535);
					multiply_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:49: SUB multiply_exp
					{
					match(input,SUB,FOLLOW_SUB_in_expression539); 
					pushFollow(FOLLOW_multiply_exp_in_expression541);
					multiply_exp();
					state._fsp--;

					}
					break;

				default :
					break loop30;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:1: multiply_exp : atom_exp ( MULT atom_exp | DIV atom_exp )* ;
	public final void multiply_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:15: ( atom_exp ( MULT atom_exp | DIV atom_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:17: atom_exp ( MULT atom_exp | DIV atom_exp )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp565);
			atom_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:26: ( MULT atom_exp | DIV atom_exp )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==MULT) ) {
					alt31=1;
				}
				else if ( (LA31_0==DIV) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:27: MULT atom_exp
					{
					match(input,MULT,FOLLOW_MULT_in_multiply_exp568); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp570);
					atom_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:43: DIV atom_exp
					{
					match(input,DIV,FOLLOW_DIV_in_multiply_exp574); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp576);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop31;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:1: atom_exp : ( INT | FLOAT | CHAR_QUOTE | identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:12: ( INT | FLOAT | CHAR_QUOTE | identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN )
			int alt33=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt33=1;
				}
				break;
			case FLOAT:
				{
				alt33=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt33=3;
				}
				break;
			case CHAR:
			case WORD:
				{
				alt33=4;
				}
				break;
			case LPAREN:
				{
				alt33=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:14: INT
					{
					match(input,INT,FOLLOW_INT_in_atom_exp596); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp604); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:7: CHAR_QUOTE
					{
					match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp614); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:7: identifier ( LBRACK INT RBRACK )?
					{
					pushFollow(FOLLOW_identifier_in_atom_exp622);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:18: ( LBRACK INT RBRACK )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==LBRACK) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:19: LBRACK INT RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp625); 
							match(input,INT,FOLLOW_INT_in_atom_exp627); 
							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp629); 
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:81:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp643); 
					pushFollow(FOLLOW_expression_in_atom_exp645);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp647); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:1: value : ( INT | identifier ) ;
	public final void value() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:10: ( ( INT | identifier ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:12: ( INT | identifier )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:12: ( INT | identifier )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==INT) ) {
				alt34=1;
			}
			else if ( (LA34_0==CHAR||LA34_0==WORD) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:13: INT
					{
					match(input,INT,FOLLOW_INT_in_value667); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:19: identifier
					{
					pushFollow(FOLLOW_identifier_in_value671);
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
	public static final BitSet FOLLOW_type_value_in_variable_ass144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_variable_ass148 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_variable_ass150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector172 = new BitSet(new long[]{0x0000002002000000L});
	public static final BitSet FOLLOW_INT_in_vector174 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector177 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector180 = new BitSet(new long[]{0x0008000142080300L});
	public static final BitSet FOLLOW_LCURL_in_vector184 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_vector186 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector189 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_vector191 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_value_in_vector200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_puntator221 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_puntator223 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_puntator226 = new BitSet(new long[]{0x0008000102080320L});
	public static final BitSet FOLLOW_AMP_in_puntator230 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_puntator232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_value_in_puntator238 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_LCURL_in_codeblock331 = new BitSet(new long[]{0x000800C41C000100L});
	public static final BitSet FOLLOW_statement_in_codeblock334 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock336 = new BitSet(new long[]{0x000800C41C000100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement371 = new BitSet(new long[]{0x0008000400000100L});
	public static final BitSet FOLLOW_identifier_in_statement375 = new BitSet(new long[]{0x0000100520004090L});
	public static final BitSet FOLLOW_assignment_in_statement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_statement382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_statement386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_puntator_in_statement391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement402 = new BitSet(new long[]{0x0008000002000100L});
	public static final BitSet FOLLOW_value_in_statement404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment440 = new BitSet(new long[]{0x0008000102080320L});
	public static final BitSet FOLLOW_type_value_in_assignment443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_assignment447 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_assignment449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_type_value515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression530 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_ADD_in_expression533 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression535 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_SUB_in_expression539 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression541 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp565 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp568 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp570 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp574 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp576 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom_exp622 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp625 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp627 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp643 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_atom_exp645 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_value671 = new BitSet(new long[]{0x0000000000000002L});
}
