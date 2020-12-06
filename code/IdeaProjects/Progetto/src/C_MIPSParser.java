// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-06 22:45:15

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMP", "ARROW", "ASS", "COMMA", 
		"DIGIT", "DIGIT_NO_ZERO", "DIV", "D_QUOTE", "ELSE", "EQ", "FLOAT", "FOR", 
		"GE", "GT", "IF", "INCLUDE", "INT", "K_CHAR", "K_FLOAT", "K_INT", "LBRACK", 
		"LCURL", "LE", "LPAREN", "LT", "MIN", "MULT", "NEQ", "NEWL", "PLUS", "RBRACK", 
		"RCURL", "RETURN", "RPAREN", "SEMICOL", "SLASHR", "SPACE", "S_QUOTE", 
		"TAB", "TOKEN_ERROR", "UNDRSCR", "VOID", "WHILE", "WORD", "WS"
	};
	public static final int EOF=-1;
	public static final int AMP=4;
	public static final int ARROW=5;
	public static final int ASS=6;
	public static final int COMMA=7;
	public static final int DIGIT=8;
	public static final int DIGIT_NO_ZERO=9;
	public static final int DIV=10;
	public static final int D_QUOTE=11;
	public static final int ELSE=12;
	public static final int EQ=13;
	public static final int FLOAT=14;
	public static final int FOR=15;
	public static final int GE=16;
	public static final int GT=17;
	public static final int IF=18;
	public static final int INCLUDE=19;
	public static final int INT=20;
	public static final int K_CHAR=21;
	public static final int K_FLOAT=22;
	public static final int K_INT=23;
	public static final int LBRACK=24;
	public static final int LCURL=25;
	public static final int LE=26;
	public static final int LPAREN=27;
	public static final int LT=28;
	public static final int MIN=29;
	public static final int MULT=30;
	public static final int NEQ=31;
	public static final int NEWL=32;
	public static final int PLUS=33;
	public static final int RBRACK=34;
	public static final int RCURL=35;
	public static final int RETURN=36;
	public static final int RPAREN=37;
	public static final int SEMICOL=38;
	public static final int SLASHR=39;
	public static final int SPACE=40;
	public static final int S_QUOTE=41;
	public static final int TAB=42;
	public static final int TOKEN_ERROR=43;
	public static final int UNDRSCR=44;
	public static final int VOID=45;
	public static final int WHILE=46;
	public static final int WORD=47;
	public static final int WS=48;

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


		// int test;



	// $ANTLR start "start"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:1: start : ( INCLUDE )? ( type_name identifier ( ( ( global_var )? SEMICOL ) | function ) )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:7: ( ( INCLUDE )? ( type_name identifier ( ( ( global_var )? SEMICOL ) | function ) )* EOF )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( INCLUDE )? ( type_name identifier ( ( ( global_var )? SEMICOL ) | function ) )* EOF
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( INCLUDE )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INCLUDE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_start66); 
					}
					break;

			}

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:18: ( type_name identifier ( ( ( global_var )? SEMICOL ) | function ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= K_CHAR && LA4_0 <= K_INT)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:19: type_name identifier ( ( ( global_var )? SEMICOL ) | function )
					{
					pushFollow(FOLLOW_type_name_in_start70);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_start72);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:40: ( ( ( global_var )? SEMICOL ) | function )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ASS||LA3_0==SEMICOL) ) {
						alt3=1;
					}
					else if ( (LA3_0==LPAREN) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:41: ( ( global_var )? SEMICOL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:41: ( ( global_var )? SEMICOL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:42: ( global_var )? SEMICOL
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:42: ( global_var )?
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==ASS) ) {
								alt2=1;
							}
							switch (alt2) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:42: global_var
									{
									pushFollow(FOLLOW_global_var_in_start76);
									global_var();
									state._fsp--;

									}
									break;

							}

							match(input,SEMICOL,FOLLOW_SEMICOL_in_start79); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:65: function
							{
							pushFollow(FOLLOW_function_in_start84);
							function();
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

			match(input,EOF,FOLLOW_EOF_in_start90); 
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



	// $ANTLR start "global_var"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:1: global_var : ( ASS type_value ) ;
	public final void global_var() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:12: ( ( ASS type_value ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:14: ( ASS type_value )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:14: ( ASS type_value )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:15: ASS type_value
			{
			match(input,ASS,FOLLOW_ASS_in_global_var104); 
			pushFollow(FOLLOW_type_value_in_global_var106);
			type_value();
			state._fsp--;

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
	// $ANTLR end "global_var"



	// $ANTLR start "function"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:10: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:12: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function125); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:19: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= K_CHAR && LA6_0 <= K_INT)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:20: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function128);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function130);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:41: ( COMMA type_name identifier )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:42: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function133); 
							pushFollow(FOLLOW_type_name_in_function135);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function137);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function143); 
			pushFollow(FOLLOW_codeblock_in_function145);
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



	// $ANTLR start "codeblock"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:1: codeblock : ( LCURL ( assignment SEMICOL )* RETURN valore SEMICOL RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:11: ( LCURL ( assignment SEMICOL )* RETURN valore SEMICOL RCURL | SEMICOL )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LCURL) ) {
				alt8=1;
			}
			else if ( (LA8_0==SEMICOL) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:13: LCURL ( assignment SEMICOL )* RETURN valore SEMICOL RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock162); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:19: ( assignment SEMICOL )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= K_CHAR && LA7_0 <= K_INT)||LA7_0==WORD) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:20: assignment SEMICOL
							{
							pushFollow(FOLLOW_assignment_in_codeblock165);
							assignment();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock167); 
							}
							break;

						default :
							break loop7;
						}
					}

					match(input,RETURN,FOLLOW_RETURN_in_codeblock171); 
					pushFollow(FOLLOW_valore_in_codeblock173);
					valore();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock175); 
					match(input,RCURL,FOLLOW_RCURL_in_codeblock177); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:8: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock189); 
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



	// $ANTLR start "assignment"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:1: assignment : ( type_name )? identifier ( MIN | PLUS | MULT | DIV )? ( ASS type_value )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:13: ( ( type_name )? identifier ( MIN | PLUS | MULT | DIV )? ( ASS type_value )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:15: ( type_name )? identifier ( MIN | PLUS | MULT | DIV )? ( ASS type_value )?
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:15: ( type_name )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= K_CHAR && LA9_0 <= K_INT)) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:15: type_name
					{
					pushFollow(FOLLOW_type_name_in_assignment215);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_assignment218);
			identifier();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:37: ( MIN | PLUS | MULT | DIV )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DIV||(LA10_0 >= MIN && LA10_0 <= MULT)||LA10_0==PLUS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
					{
					if ( input.LA(1)==DIV||(input.LA(1) >= MIN && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
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

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:64: ( ASS type_value )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:65: ASS type_value
					{
					match(input,ASS,FOLLOW_ASS_in_assignment238); 
					pushFollow(FOLLOW_type_value_in_assignment240);
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:1: identifier : WORD ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:13: ( WORD )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:15: WORD
			{
			match(input,WORD,FOLLOW_WORD_in_identifier283); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:1: type_value : ( INT | FLOAT ) ;
	public final void type_value() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:13: ( ( INT | FLOAT ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
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
	// $ANTLR end "type_value"



	// $ANTLR start "valore"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:1: valore : ( INT | identifier ) ;
	public final void valore() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:9: ( ( INT | identifier ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:12: ( INT | identifier )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:12: ( INT | identifier )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT) ) {
				alt12=1;
			}
			else if ( (LA12_0==WORD) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:13: INT
					{
					match(input,INT,FOLLOW_INT_in_valore320); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:19: identifier
					{
					pushFollow(FOLLOW_identifier_in_valore324);
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
	// $ANTLR end "valore"

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_in_start66 = new BitSet(new long[]{0x0000000000E00000L});
	public static final BitSet FOLLOW_type_name_in_start70 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_identifier_in_start72 = new BitSet(new long[]{0x0000004008000040L});
	public static final BitSet FOLLOW_global_var_in_start76 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start79 = new BitSet(new long[]{0x0000000000E00000L});
	public static final BitSet FOLLOW_function_in_start84 = new BitSet(new long[]{0x0000000000E00000L});
	public static final BitSet FOLLOW_EOF_in_start90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_global_var104 = new BitSet(new long[]{0x0000000000104000L});
	public static final BitSet FOLLOW_type_value_in_global_var106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function125 = new BitSet(new long[]{0x0000002000E00000L});
	public static final BitSet FOLLOW_type_name_in_function128 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_identifier_in_function130 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_COMMA_in_function133 = new BitSet(new long[]{0x0000000000E00000L});
	public static final BitSet FOLLOW_type_name_in_function135 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_identifier_in_function137 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_RPAREN_in_function143 = new BitSet(new long[]{0x0000004002000000L});
	public static final BitSet FOLLOW_codeblock_in_function145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock162 = new BitSet(new long[]{0x0000801000E00000L});
	public static final BitSet FOLLOW_assignment_in_codeblock165 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock167 = new BitSet(new long[]{0x0000801000E00000L});
	public static final BitSet FOLLOW_RETURN_in_codeblock171 = new BitSet(new long[]{0x0000800000100000L});
	public static final BitSet FOLLOW_valore_in_codeblock173 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock175 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RCURL_in_codeblock177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_assignment215 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_identifier_in_assignment218 = new BitSet(new long[]{0x0000000260000442L});
	public static final BitSet FOLLOW_ASS_in_assignment238 = new BitSet(new long[]{0x0000000000104000L});
	public static final BitSet FOLLOW_type_value_in_assignment240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_identifier283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valore320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_valore324 = new BitSet(new long[]{0x0000000000000002L});
}
