// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-07 11:49:39

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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:1: start : ( INCLUDE )? ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL ) | function ) )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( ( INCLUDE )? ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL ) | function ) )* EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: ( INCLUDE )? ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL ) | function ) )* EOF
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

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:20: ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL ) | function ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==VOID) ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= K_CHAR && LA7_0 <= K_INT)) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:21: VOID identifier function
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:48: type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL ) | function )
					{
					pushFollow(FOLLOW_type_name_in_start80);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_start82);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:69: ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL ) | function )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASS||LA6_0==COMMA||LA6_0==LBRACK||LA6_0==SEMICOL) ) {
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:70: ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:70: ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:71: ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector ) SEMICOL
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:71: ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | global_vector )
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ASS||LA5_0==COMMA||LA5_0==SEMICOL) ) {
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:72: ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:72: ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:73: ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )*
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:73: ( global_var_ass )?
									int alt2=2;
									int LA2_0 = input.LA(1);
									if ( (LA2_0==ASS) ) {
										alt2=1;
									}
									switch (alt2) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:73: global_var_ass
											{
											pushFollow(FOLLOW_global_var_ass_in_start88);
											global_var_ass();
											state._fsp--;

											}
											break;

									}

									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:89: ( COMMA identifier ( global_var_ass )? )*
									loop4:
									while (true) {
										int alt4=2;
										int LA4_0 = input.LA(1);
										if ( (LA4_0==COMMA) ) {
											alt4=1;
										}

										switch (alt4) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:90: COMMA identifier ( global_var_ass )?
											{
											match(input,COMMA,FOLLOW_COMMA_in_start92); 
											pushFollow(FOLLOW_identifier_in_start94);
											identifier();
											state._fsp--;

											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:107: ( global_var_ass )?
											int alt3=2;
											int LA3_0 = input.LA(1);
											if ( (LA3_0==ASS) ) {
												alt3=1;
											}
											switch (alt3) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:107: global_var_ass
													{
													pushFollow(FOLLOW_global_var_ass_in_start96);
													global_var_ass();
													state._fsp--;

													}
													break;

											}

											}
											break;

										default :
											break loop4;
										}
									}

									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:128: global_vector
									{
									pushFollow(FOLLOW_global_vector_in_start104);
									global_vector();
									state._fsp--;

									}
									break;

							}

							match(input,SEMICOL,FOLLOW_SEMICOL_in_start107); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:154: function
							{
							pushFollow(FOLLOW_function_in_start112);
							function();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start117); 
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



	// $ANTLR start "global_var_ass"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:1: global_var_ass : ASS type_value ;
	public final void global_var_ass() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:17: ( ASS type_value )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:19: ASS type_value
			{
			match(input,ASS,FOLLOW_ASS_in_global_var_ass131); 
			pushFollow(FOLLOW_type_value_in_global_var_ass133);
			type_value();
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
	// $ANTLR end "global_var_ass"



	// $ANTLR start "global_vector"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:1: global_vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )? ;
	public final void global_vector() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:16: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:18: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_global_vector151); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:25: ( INT )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==INT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:25: INT
					{
					match(input,INT,FOLLOW_INT_in_global_vector153); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_global_vector156); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:37: ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:38: ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value )
					{
					match(input,ASS,FOLLOW_ASS_in_global_vector159); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:42: ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==LCURL) ) {
						alt10=1;
					}
					else if ( ((LA10_0 >= CHAR && LA10_0 <= CHAR_QUOTE)||LA10_0==FLOAT||LA10_0==INT||LA10_0==LPAREN||LA10_0==WORD) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:43: ( LCURL type_value ( COMMA type_value )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:43: ( LCURL type_value ( COMMA type_value )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:44: LCURL type_value ( COMMA type_value )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_global_vector163); 
							pushFollow(FOLLOW_type_value_in_global_vector165);
							type_value();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:61: ( COMMA type_value )*
							loop9:
							while (true) {
								int alt9=2;
								int LA9_0 = input.LA(1);
								if ( (LA9_0==COMMA) ) {
									alt9=1;
								}

								switch (alt9) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:62: COMMA type_value
									{
									match(input,COMMA,FOLLOW_COMMA_in_global_vector168); 
									pushFollow(FOLLOW_type_value_in_global_vector170);
									type_value();
									state._fsp--;

									}
									break;

								default :
									break loop9;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_global_vector174); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:90: type_value
							{
							pushFollow(FOLLOW_type_value_in_global_vector179);
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
	// $ANTLR end "global_vector"



	// $ANTLR start "vector"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:11: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:13: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector202); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:20: ( INT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:20: INT
					{
					match(input,INT,FOLLOW_INT_in_vector204); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector207); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:32: ( ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value ) )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ASS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:33: ASS ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value )
					{
					match(input,ASS,FOLLOW_ASS_in_vector210); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:37: ( ( LCURL type_value ( COMMA type_value )* RCURL ) | type_value )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==LCURL) ) {
						alt14=1;
					}
					else if ( ((LA14_0 >= CHAR && LA14_0 <= CHAR_QUOTE)||LA14_0==FLOAT||LA14_0==INT||LA14_0==LPAREN||LA14_0==WORD) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:38: ( LCURL type_value ( COMMA type_value )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:38: ( LCURL type_value ( COMMA type_value )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:39: LCURL type_value ( COMMA type_value )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector214); 
							pushFollow(FOLLOW_type_value_in_vector216);
							type_value();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:56: ( COMMA type_value )*
							loop13:
							while (true) {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( (LA13_0==COMMA) ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:57: COMMA type_value
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector219); 
									pushFollow(FOLLOW_type_value_in_vector221);
									type_value();
									state._fsp--;

									}
									break;

								default :
									break loop13;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector225); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:85: type_value
							{
							pushFollow(FOLLOW_type_value_in_vector230);
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



	// $ANTLR start "function"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:12: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:14: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function253); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:21: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= K_CHAR && LA17_0 <= K_INT)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:22: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function256);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function258);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:43: ( COMMA type_name identifier )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:44: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function261); 
							pushFollow(FOLLOW_type_name_in_function263);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function265);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_function271); 
			pushFollow(FOLLOW_codeblock_in_function273);
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
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function287); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:25: ( identifier ( COMMA identifier )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CHAR||LA19_0==WORD) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:26: identifier ( COMMA identifier )*
					{
					pushFollow(FOLLOW_identifier_in_call_function290);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:37: ( COMMA identifier )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==COMMA) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:38: COMMA identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function293); 
							pushFollow(FOLLOW_identifier_in_call_function296);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function302); 
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
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LCURL) ) {
				alt21=1;
			}
			else if ( (LA21_0==SEMICOL) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:15: LCURL ( statement SEMICOL )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock321); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:21: ( statement SEMICOL )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CHAR||(LA20_0 >= K_CHAR && LA20_0 <= K_INT)||LA20_0==RETURN||LA20_0==WORD) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:22: statement SEMICOL
							{
							pushFollow(FOLLOW_statement_in_codeblock324);
							statement();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock326); 
							}
							break;

						default :
							break loop20;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock330); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock344); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:1: statement : ( ( type_name )? identifier ( assignment | call_function | vector ) | RETURN value );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:13: ( ( type_name )? identifier ( assignment | call_function | vector ) | RETURN value )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CHAR||(LA24_0 >= K_CHAR && LA24_0 <= K_INT)||LA24_0==WORD) ) {
				alt24=1;
			}
			else if ( (LA24_0==RETURN) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )? identifier ( assignment | call_function | vector )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= K_CHAR && LA22_0 <= K_INT)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement361);
							type_name();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_statement364);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:37: ( assignment | call_function | vector )
					int alt23=3;
					switch ( input.LA(1) ) {
					case ADD:
					case ASS:
					case DIV:
					case MULT:
					case SEMICOL:
					case SUB:
						{
						alt23=1;
						}
						break;
					case LPAREN:
						{
						alt23=2;
						}
						break;
					case LBRACK:
						{
						alt23=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:38: assignment
							{
							pushFollow(FOLLOW_assignment_in_statement367);
							assignment();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:51: call_function
							{
							pushFollow(FOLLOW_call_function_in_statement371);
							call_function();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:67: vector
							{
							pushFollow(FOLLOW_vector_in_statement375);
							vector();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:9: RETURN value
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement386); 
					pushFollow(FOLLOW_value_in_statement388);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS type_value )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:13: ( ( ( ADD | SUB | MULT | DIV )? ASS type_value )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:15: ( ( ADD | SUB | MULT | DIV )? ASS type_value )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:15: ( ( ADD | SUB | MULT | DIV )? ASS type_value )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ADD||LA26_0==ASS||LA26_0==DIV||LA26_0==MULT||LA26_0==SUB) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:16: ( ADD | SUB | MULT | DIV )? ASS type_value
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:16: ( ADD | SUB | MULT | DIV )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ADD||LA25_0==DIV||LA25_0==MULT||LA25_0==SUB) ) {
						alt25=1;
					}
					switch (alt25) {
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

					match(input,ASS,FOLLOW_ASS_in_assignment424); 
					pushFollow(FOLLOW_type_value_in_assignment426);
					type_value();
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
			pushFollow(FOLLOW_expression_in_type_value492);
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
			pushFollow(FOLLOW_multiply_exp_in_expression507);
			multiply_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:29: ( ADD multiply_exp | SUB multiply_exp )*
			loop27:
			while (true) {
				int alt27=3;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==ADD) ) {
					alt27=1;
				}
				else if ( (LA27_0==SUB) ) {
					alt27=2;
				}

				switch (alt27) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:30: ADD multiply_exp
					{
					match(input,ADD,FOLLOW_ADD_in_expression510); 
					pushFollow(FOLLOW_multiply_exp_in_expression512);
					multiply_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:49: SUB multiply_exp
					{
					match(input,SUB,FOLLOW_SUB_in_expression516); 
					pushFollow(FOLLOW_multiply_exp_in_expression518);
					multiply_exp();
					state._fsp--;

					}
					break;

				default :
					break loop27;
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
			pushFollow(FOLLOW_atom_exp_in_multiply_exp542);
			atom_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:26: ( MULT atom_exp | DIV atom_exp )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==MULT) ) {
					alt28=1;
				}
				else if ( (LA28_0==DIV) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:27: MULT atom_exp
					{
					match(input,MULT,FOLLOW_MULT_in_multiply_exp545); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp547);
					atom_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:43: DIV atom_exp
					{
					match(input,DIV,FOLLOW_DIV_in_multiply_exp551); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp553);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop28;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:1: atom_exp : ( INT | FLOAT | CHAR_QUOTE | identifier | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:12: ( INT | FLOAT | CHAR_QUOTE | identifier | LPAREN expression RPAREN )
			int alt29=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt29=1;
				}
				break;
			case FLOAT:
				{
				alt29=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt29=3;
				}
				break;
			case CHAR:
			case WORD:
				{
				alt29=4;
				}
				break;
			case LPAREN:
				{
				alt29=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:14: INT
					{
					match(input,INT,FOLLOW_INT_in_atom_exp573); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp581); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:7: CHAR_QUOTE
					{
					match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp591); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:10: identifier
					{
					pushFollow(FOLLOW_identifier_in_atom_exp602);
					identifier();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:81:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp618); 
					pushFollow(FOLLOW_expression_in_atom_exp620);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp622); 
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
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==INT) ) {
				alt30=1;
			}
			else if ( (LA30_0==CHAR||LA30_0==WORD) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:13: INT
					{
					match(input,INT,FOLLOW_INT_in_value642); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:19: identifier
					{
					pushFollow(FOLLOW_identifier_in_value646);
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



	public static final BitSet FOLLOW_INCLUDE_in_start68 = new BitSet(new long[]{0x000200001C000000L});
	public static final BitSet FOLLOW_VOID_in_start72 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_start74 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_function_in_start76 = new BitSet(new long[]{0x000200001C000000L});
	public static final BitSet FOLLOW_type_name_in_start80 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_start82 = new BitSet(new long[]{0x0000020120000480L});
	public static final BitSet FOLLOW_global_var_ass_in_start88 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_COMMA_in_start92 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_start94 = new BitSet(new long[]{0x0000020000000480L});
	public static final BitSet FOLLOW_global_var_ass_in_start96 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_global_vector_in_start104 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start107 = new BitSet(new long[]{0x000200001C000000L});
	public static final BitSet FOLLOW_function_in_start112 = new BitSet(new long[]{0x000200001C000000L});
	public static final BitSet FOLLOW_EOF_in_start117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_global_var_ass131 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_global_var_ass133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_global_vector151 = new BitSet(new long[]{0x0000002002000000L});
	public static final BitSet FOLLOW_INT_in_global_vector153 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RBRACK_in_global_vector156 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_global_vector159 = new BitSet(new long[]{0x0008000142080300L});
	public static final BitSet FOLLOW_LCURL_in_global_vector163 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_global_vector165 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_global_vector168 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_global_vector170 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_RCURL_in_global_vector174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_value_in_global_vector179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector202 = new BitSet(new long[]{0x0000002002000000L});
	public static final BitSet FOLLOW_INT_in_vector204 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector207 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector210 = new BitSet(new long[]{0x0008000142080300L});
	public static final BitSet FOLLOW_LCURL_in_vector214 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_vector216 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector219 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_vector221 = new BitSet(new long[]{0x0000004000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_value_in_vector230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function253 = new BitSet(new long[]{0x000001001C000000L});
	public static final BitSet FOLLOW_type_name_in_function256 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_function258 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_function261 = new BitSet(new long[]{0x000000001C000000L});
	public static final BitSet FOLLOW_type_name_in_function263 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_function265 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RPAREN_in_function271 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_codeblock_in_function273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function287 = new BitSet(new long[]{0x0008010000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function290 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_call_function293 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function296 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RPAREN_in_call_function302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock321 = new BitSet(new long[]{0x000800C01C000100L});
	public static final BitSet FOLLOW_statement_in_codeblock324 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock326 = new BitSet(new long[]{0x000800C01C000100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement361 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_identifier_in_statement364 = new BitSet(new long[]{0x0000100520004090L});
	public static final BitSet FOLLOW_assignment_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_statement371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_statement375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement386 = new BitSet(new long[]{0x0008000002000100L});
	public static final BitSet FOLLOW_value_in_statement388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment424 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_type_value_in_assignment426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_type_value492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression507 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_ADD_in_expression510 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression512 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_SUB_in_expression516 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_multiply_exp_in_expression518 = new BitSet(new long[]{0x0000100000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp542 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp545 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp547 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp551 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp553 = new BitSet(new long[]{0x0000000400004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom_exp602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp618 = new BitSet(new long[]{0x0008000102080300L});
	public static final BitSet FOLLOW_expression_in_atom_exp620 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_value646 = new BitSet(new long[]{0x0000000000000002L});
}
