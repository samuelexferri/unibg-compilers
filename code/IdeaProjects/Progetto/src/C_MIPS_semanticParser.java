// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g 2020-12-21 18:27:31

	// package myCompiler;

    import util.*;
    import java.util.Hashtable;
    import java.io.FileWriter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPS_semanticParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AMP", "ARROW", "ASS", 
		"BACKSLASH", "CHAR", "CHAR_QUOTE", "COMMA", "COMMENT", "DIGIT", "DIGIT_NO_ZERO", 
		"DIV", "DOT", "D_QUOTE", "ELSE", "EQ", "FLOAT", "FOR", "GE", "GT", "HASHTAG", 
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
	public static final int BACKSLASH=8;
	public static final int CHAR=9;
	public static final int CHAR_QUOTE=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DIGIT_NO_ZERO=14;
	public static final int DIV=15;
	public static final int DOT=16;
	public static final int D_QUOTE=17;
	public static final int ELSE=18;
	public static final int EQ=19;
	public static final int FLOAT=20;
	public static final int FOR=21;
	public static final int GE=22;
	public static final int GT=23;
	public static final int HASHTAG=24;
	public static final int IF=25;
	public static final int INCLUDE=26;
	public static final int INT=27;
	public static final int K_CHAR=28;
	public static final int K_FLOAT=29;
	public static final int K_INT=30;
	public static final int LBRACK=31;
	public static final int LCURL=32;
	public static final int LE=33;
	public static final int LPAREN=34;
	public static final int LT=35;
	public static final int MULT=36;
	public static final int NEQ=37;
	public static final int NEWL=38;
	public static final int PERC=39;
	public static final int RBRACK=40;
	public static final int RCURL=41;
	public static final int RETURN=42;
	public static final int RPAREN=43;
	public static final int SEMICOL=44;
	public static final int SLASHR=45;
	public static final int SPACE=46;
	public static final int SUB=47;
	public static final int S_QUOTE=48;
	public static final int TAB=49;
	public static final int TOKEN_ERROR=50;
	public static final int UNDRSCR=51;
	public static final int VOID=52;
	public static final int WHILE=53;
	public static final int WORD=54;
	public static final int WS=55;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public C_MIPS_semanticParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPS_semanticParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return C_MIPS_semanticParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g"; }


		ParserEnvironment env;

	    void init(FileWriter fOut) {
	    	System.out.println("Inizio l'analisi\n");
	        env = new ParserEnvironment(fOut);
	    }

	    public Hashtable<String, Value> getSymbolTable() {
			return env.symbolTable;
	    }
	    
	    public Hashtable<String, Value> getSymbolTableLocal() {
		    return env.symbolTableLocal;
	    }
	  
		public String getDebug() {
			return env.debug.toString();
		}
		
		public String getTranslation() {
	    	return env.translation.toString();
	    }

	    public ArrayList<String> getErrors() {
	    	return env.errorList;
	  	}

	  	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			  
			Token tk = input.LT(1);
			env.handleError(tokenNames, e, hdr, msg);
	  }



	// $ANTLR start "start"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:1: start : ( include )* ( global )* tk= EOF ;
	public final void start() throws RecognitionException {
		Token tk=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:9: ( ( include )* ( global )* tk= EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:11: ( include )* ( global )* tk= EOF
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:11: ( include )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:11: include
					{
					pushFollow(FOLLOW_include_in_start67);
					include();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:20: ( global )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= K_CHAR && LA2_0 <= K_INT)||LA2_0==MULT||LA2_0==VOID||LA2_0==WORD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:69:20: global
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

			tk=(Token)match(input,EOF,FOLLOW_EOF_in_start75); 
			env.checkMain(tk);
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



	// $ANTLR start "include"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:72:1: include : INCLUDE LT WORD ( DOT WORD )? GT ;
	public final void include() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:72:11: ( INCLUDE LT WORD ( DOT WORD )? GT )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:72:13: INCLUDE LT WORD ( DOT WORD )? GT
			{
			match(input,INCLUDE,FOLLOW_INCLUDE_in_include92); 
			match(input,LT,FOLLOW_LT_in_include94); 
			match(input,WORD,FOLLOW_WORD_in_include96); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:72:29: ( DOT WORD )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DOT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:72:30: DOT WORD
					{
					match(input,DOT,FOLLOW_DOT_in_include99); 
					match(input,WORD,FOLLOW_WORD_in_include101); 
					}
					break;

			}

			match(input,GT,FOLLOW_GT_in_include105); 
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
	// $ANTLR end "include"



	// $ANTLR start "global"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:75:1: global : ( funct_void | (type= type_name )? ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) ) );
	public final void global() throws RecognitionException {
		Token name=null;
		Token type =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:75:10: ( funct_void | (type= type_name )? ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) ) )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:75:12: funct_void
					{
					pushFollow(FOLLOW_funct_void_in_global124);
					funct_void();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:7: (type= type_name )? ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) )
					{
					env.var_type = ValueTypes.UNDEFINED_STR; env.funct_type = ValueTypes.UNDEFINED_STR; env.is_local = false;
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:115: (type= type_name )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= K_CHAR && LA4_0 <= K_INT)) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:116: type= type_name
							{
							pushFollow(FOLLOW_type_name_in_global137);
							type=type_name();
							state._fsp--;

							env.var_type = type.getText();
							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:166: ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:167: pointer SEMICOL
							{
							pushFollow(FOLLOW_pointer_in_global144);
							pointer();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_global146); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:17: name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params )
							{
							name=(Token)match(input,WORD,FOLLOW_WORD_in_global167); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:27: ( ( ass_multiple | vector ) SEMICOL | funct_params )
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:28: ( ass_multiple | vector ) SEMICOL
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:28: ( ass_multiple | vector )
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:29: ass_multiple
											{
											env.var_name = name; env.addNewVariable(env.var_type, name);
											pushFollow(FOLLOW_ass_multiple_in_global173);
											ass_multiple();
											state._fsp--;

											}
											break;
										case 2 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:78:21: vector
											{
											env.var_name = name;
											pushFollow(FOLLOW_vector_in_global197);
											vector();
											state._fsp--;

											}
											break;

									}

									match(input,SEMICOL,FOLLOW_SEMICOL_in_global200); 
									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:79:16: funct_params
									{
									env.var_name = name; env.funct_name = name; env.funct_type = type.getText(); env.addFunction(env.var_type, name);
									pushFollow(FOLLOW_funct_params_in_global219);
									funct_params();
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



	// $ANTLR start "funct_void"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:82:1: funct_void : type= VOID name= WORD funct_params ;
	public final void funct_void() throws RecognitionException {
		Token type=null;
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:82:13: (type= VOID name= WORD funct_params )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:82:15: type= VOID name= WORD funct_params
			{
			type=(Token)match(input,VOID,FOLLOW_VOID_in_funct_void241); 
			env.var_type = type.getText();
			name=(Token)match(input,WORD,FOLLOW_WORD_in_funct_void247); 
			env.is_local = true; env.var_name = name; env.funct_name = name; env.addFunction(env.var_type, name);
			pushFollow(FOLLOW_funct_params_in_funct_void251);
			funct_params();
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
	// $ANTLR end "funct_void"



	// $ANTLR start "funct_params"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:1: funct_params : LPAREN (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )? RPAREN isBlock= codeblock ;
	public final void funct_params() throws RecognitionException {
		Token name=null;
		Token type =null;
		Boolean isBlock =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:15: ( LPAREN (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )? RPAREN isBlock= codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:17: LPAREN (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )? RPAREN isBlock= codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_funct_params270); 
			env.is_local = true; env.var_type = ValueTypes.UNDEFINED_STR;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:88: (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= K_CHAR && LA10_0 <= K_INT)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:89: type= type_name name= WORD ( COMMA type= type_name name= WORD )*
					{
					pushFollow(FOLLOW_type_name_in_funct_params277);
					type=type_name();
					state._fsp--;

					name=(Token)match(input,WORD,FOLLOW_WORD_in_funct_params281); 
					env.var_type = type.getText(); env.var_name = name; env.addNewVariable(env.var_type, name);
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:210: ( COMMA type= type_name name= WORD )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:85:211: COMMA type= type_name name= WORD
							{
							match(input,COMMA,FOLLOW_COMMA_in_funct_params286); 
							pushFollow(FOLLOW_type_name_in_funct_params290);
							type=type_name();
							state._fsp--;

							name=(Token)match(input,WORD,FOLLOW_WORD_in_funct_params294); 
							env.var_type = type.getText(); env.var_name = name; env.addNewVariable(env.var_type, name);
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_funct_params302); 
			pushFollow(FOLLOW_codeblock_in_funct_params306);
			isBlock=codeblock();
			state._fsp--;

			env.is_local = false; env.clearSymbolTableLocal(isBlock);
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
	// $ANTLR end "funct_params"



	// $ANTLR start "assignment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:88:1: assignment : ( ( ADD | SUB | MULT | DIV )? eq= ASS exp= expression[env.var_type] ) ;
	public final void assignment() throws RecognitionException {
		Token eq=null;
		Value exp =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:88:13: ( ( ( ADD | SUB | MULT | DIV )? eq= ASS exp= expression[env.var_type] ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:88:15: ( ( ADD | SUB | MULT | DIV )? eq= ASS exp= expression[env.var_type] )
			{
			env.var_type = env.getVarType(env.var_name); Token var_temp = env.var_name;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:88:92: ( ( ADD | SUB | MULT | DIV )? eq= ASS exp= expression[env.var_type] )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:88:93: ( ADD | SUB | MULT | DIV )? eq= ASS exp= expression[env.var_type]
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:88:93: ( ADD | SUB | MULT | DIV )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ADD||LA11_0==DIV||LA11_0==MULT||LA11_0==SUB) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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

			eq=(Token)match(input,ASS,FOLLOW_ASS_in_assignment348); 
			pushFollow(FOLLOW_expression_in_assignment352);
			exp=expression(env.var_type);
			state._fsp--;

			env.assignValue(var_temp, exp, eq);
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



	// $ANTLR start "ass_multiple"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:1: ass_multiple : ( assignment )? ( COMMA name= WORD ( assignment )? )* ;
	public final void ass_multiple() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:14: ( ( assignment )? ( COMMA name= WORD ( assignment )? )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:16: ( assignment )? ( COMMA name= WORD ( assignment )? )*
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:16: ( assignment )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ADD||LA12_0==ASS||LA12_0==DIV||LA12_0==MULT||LA12_0==SUB) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:16: assignment
					{
					pushFollow(FOLLOW_assignment_in_ass_multiple370);
					assignment();
					state._fsp--;

					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:28: ( COMMA name= WORD ( assignment )? )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:29: COMMA name= WORD ( assignment )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_ass_multiple374); 
					name=(Token)match(input,WORD,FOLLOW_WORD_in_ass_multiple378); 
					env.var_name = name; env.addNewVariable(env.var_type, name);
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:110: ( assignment )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ADD||LA13_0==ASS||LA13_0==DIV||LA13_0==MULT||LA13_0==SUB) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:91:110: assignment
							{
							pushFollow(FOLLOW_assignment_in_ass_multiple382);
							assignment();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop14;
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
	// $ANTLR end "ass_multiple"



	// $ANTLR start "ass_vector"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:94:1: ass_vector[String vect_type] : ASS ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) | expression[vect_type] ) ;
	public final void ass_vector(String vect_type) throws RecognitionException {
		Value e1 =null;
		Value e2 =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:5: ( ASS ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) | expression[vect_type] ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:7: ASS ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) | expression[vect_type] )
			{
			match(input,ASS,FOLLOW_ASS_in_ass_vector413); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:11: ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) | expression[vect_type] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LCURL) ) {
				alt16=1;
			}
			else if ( (LA16_0==AMP||LA16_0==CHAR_QUOTE||LA16_0==FLOAT||LA16_0==INT||LA16_0==LPAREN||LA16_0==MULT||LA16_0==WORD) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:12: ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:12: ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:13: LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_ass_vector417); 
					pushFollow(FOLLOW_expression_in_ass_vector421);
					e1=expression(vect_type);
					state._fsp--;

					env.createVector(e1);
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:68: ( COMMA e2= expression[vect_type] )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:69: COMMA e2= expression[vect_type]
							{
							match(input,COMMA,FOLLOW_COMMA_in_ass_vector427); 
							pushFollow(FOLLOW_expression_in_ass_vector431);
							e2=expression(vect_type);
							state._fsp--;

							env.addValueVector(e2);
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_ass_vector438); 
					}

					env.insertVectorST();
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:7: expression[vect_type]
					{
					pushFollow(FOLLOW_expression_in_ass_vector450);
					expression(vect_type);
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
	// $ANTLR end "ass_vector"



	// $ANTLR start "vector"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:1: vector : LBRACK (size= INT )? RBRACK ( ass_vector[env.var_type] )? ;
	public final void vector() throws RecognitionException {
		Token size=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:11: ( LBRACK (size= INT )? RBRACK ( ass_vector[env.var_type] )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:13: LBRACK (size= INT )? RBRACK ( ass_vector[env.var_type] )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector472); 
			env.vect_size = "0";
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:43: (size= INT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==INT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:44: size= INT
					{
					size=(Token)match(input,INT,FOLLOW_INT_in_vector479); 
					env.vect_size = size.getText();
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector485); 
			env.addNewVector(env.var_type, env.var_name, env.vect_size);
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:160: ( ass_vector[env.var_type] )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ASS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:99:160: ass_vector[env.var_type]
					{
					pushFollow(FOLLOW_ass_vector_in_vector489);
					ass_vector(env.var_type);
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
	// $ANTLR end "vector"



	// $ANTLR start "pointer"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:1: pointer : MULT (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN ) ( assignment )? ;
	public final void pointer() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:11: ( MULT (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN ) ( assignment )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:13: MULT (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN ) ( assignment )?
			{
			match(input,MULT,FOLLOW_MULT_in_pointer510); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:18: (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==WORD) ) {
				alt19=1;
			}
			else if ( (LA19_0==LPAREN) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:19: name= WORD
					{
					name=(Token)match(input,WORD,FOLLOW_WORD_in_pointer515); 
					env.var_name = name; env.addNewVector(env.var_type, env.var_name, "100") /* Per i puntatori size=100 fittizia */;
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:148: LPAREN expression[ValueTypes.INT_STR] RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_pointer521); 
					pushFollow(FOLLOW_expression_in_pointer523);
					expression(ValueTypes.INT_STR);
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_pointer526); 
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:194: ( assignment )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ADD||LA20_0==ASS||LA20_0==DIV||LA20_0==MULT||LA20_0==SUB) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:102:194: assignment
					{
					pushFollow(FOLLOW_assignment_in_pointer529);
					assignment();
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



	// $ANTLR start "call_function"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:1: call_function : LPAREN ( call_args ( COMMA call_args )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:16: ( LPAREN ( call_args ( COMMA call_args )* )? RPAREN )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:18: LPAREN ( call_args ( COMMA call_args )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function550); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:25: ( call_args ( COMMA call_args )* )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==D_QUOTE||LA22_0==MULT||LA22_0==WORD) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:26: call_args ( COMMA call_args )*
					{
					pushFollow(FOLLOW_call_args_in_call_function553);
					call_args();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:36: ( COMMA call_args )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==COMMA) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:105:37: COMMA call_args
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function556); 
							pushFollow(FOLLOW_call_args_in_call_function558);
							call_args();
							state._fsp--;

							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function564); 
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



	// $ANTLR start "call_args"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:108:1: call_args : ( anything | ( MULT )? WORD );
	public final void call_args() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:108:12: ( anything | ( MULT )? WORD )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==D_QUOTE) ) {
				alt24=1;
			}
			else if ( (LA24_0==MULT||LA24_0==WORD) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:108:14: anything
					{
					pushFollow(FOLLOW_anything_in_call_args578);
					anything();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:109:7: ( MULT )? WORD
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:109:7: ( MULT )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==MULT) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:109:7: MULT
							{
							match(input,MULT,FOLLOW_MULT_in_call_args586); 
							}
							break;

					}

					match(input,WORD,FOLLOW_WORD_in_call_args589); 
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
	// $ANTLR end "call_args"



	// $ANTLR start "codeblock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:112:1: codeblock returns [Boolean isBlock = false] : ( LCURL ( statement )* RCURL | SEMICOL );
	public final Boolean codeblock() throws RecognitionException {
		Boolean isBlock =  false;


		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:113:5: ( LCURL ( statement )* RCURL | SEMICOL )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:113:7: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock616); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:113:13: ( statement )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==FOR||LA25_0==IF||(LA25_0 >= K_CHAR && LA25_0 <= K_INT)||LA25_0==LCURL||LA25_0==MULT||LA25_0==RETURN||LA25_0==SEMICOL||(LA25_0 >= WHILE && LA25_0 <= WORD)) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:113:13: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock618);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop25;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock621); 
					isBlock = true;
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:114:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock634); 
					isBlock = false;
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
		return isBlock;
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "statement"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:117:1: statement : ( local | codeblock | ifStat | whileStat | forStat | returnStat );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:117:13: ( local | codeblock | ifStat | whileStat | forStat | returnStat )
			int alt27=6;
			switch ( input.LA(1) ) {
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt27=1;
				}
				break;
			case LCURL:
			case SEMICOL:
				{
				alt27=2;
				}
				break;
			case IF:
				{
				alt27=3;
				}
				break;
			case WHILE:
				{
				alt27=4;
				}
				break;
			case FOR:
				{
				alt27=5;
				}
				break;
			case RETURN:
				{
				alt27=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:117:15: local
					{
					pushFollow(FOLLOW_local_in_statement652);
					local();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:118:7: codeblock
					{
					pushFollow(FOLLOW_codeblock_in_statement660);
					codeblock();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:119:7: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement668);
					ifStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:120:7: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement676);
					whileStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:121:7: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement684);
					forStat();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:122:7: returnStat
					{
					pushFollow(FOLLOW_returnStat_in_statement692);
					returnStat();
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



	// $ANTLR start "local"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:1: local : (type= type_name )? ( pointer |name= WORD ( ass_multiple | vector | call_function ) ) SEMICOL ;
	public final void local() throws RecognitionException {
		Token name=null;
		Token type =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:9: ( (type= type_name )? ( pointer |name= WORD ( ass_multiple | vector | call_function ) ) SEMICOL )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:11: (type= type_name )? ( pointer |name= WORD ( ass_multiple | vector | call_function ) ) SEMICOL
			{
			env.var_type = ValueTypes.UNDEFINED_STR; env.is_local = true;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:75: (type= type_name )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= K_CHAR && LA28_0 <= K_INT)) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:76: type= type_name
					{
					pushFollow(FOLLOW_type_name_in_local712);
					type=type_name();
					state._fsp--;

					env.var_type = type.getText();
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:126: ( pointer |name= WORD ( ass_multiple | vector | call_function ) )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==MULT) ) {
				alt30=1;
			}
			else if ( (LA30_0==WORD) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:125:127: pointer
					{
					pushFollow(FOLLOW_pointer_in_local719);
					pointer();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:126:38: name= WORD ( ass_multiple | vector | call_function )
					{
					name=(Token)match(input,WORD,FOLLOW_WORD_in_local760); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:126:48: ( ass_multiple | vector | call_function )
					int alt29=3;
					switch ( input.LA(1) ) {
					case ADD:
					case ASS:
					case COMMA:
					case DIV:
					case MULT:
					case SEMICOL:
					case SUB:
						{
						alt29=1;
						}
						break;
					case LBRACK:
						{
						alt29=2;
						}
						break;
					case LPAREN:
						{
						alt29=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:126:49: ass_multiple
							{
							env.var_name = name; env.addNewVariable(env.var_type, name);
							pushFollow(FOLLOW_ass_multiple_in_local765);
							ass_multiple();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:48: vector
							{
							env.var_name = name;
							pushFollow(FOLLOW_vector_in_local816);
							vector();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:128:45: call_function
							{
							env.var_name = name; env.checkCallFunction(env.var_type, name);
							pushFollow(FOLLOW_call_function_in_local865);
							call_function();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_local869); 
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
	// $ANTLR end "local"



	// $ANTLR start "ifStat"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:131:1: ifStat : IF LPAREN bool= condition RPAREN codeblock ( ELSE statement )? ;
	public final void ifStat() throws RecognitionException {
		Boolean bool =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:131:10: ( IF LPAREN bool= condition RPAREN codeblock ( ELSE statement )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:131:12: IF LPAREN bool= condition RPAREN codeblock ( ELSE statement )?
			{
			match(input,IF,FOLLOW_IF_in_ifStat890); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat892); 
			pushFollow(FOLLOW_condition_in_ifStat896);
			bool=condition();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat898); 
			pushFollow(FOLLOW_codeblock_in_ifStat900);
			codeblock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:131:54: ( ELSE statement )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ELSE) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:131:55: ELSE statement
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat903); 
					pushFollow(FOLLOW_statement_in_ifStat905);
					statement();
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
	// $ANTLR end "ifStat"



	// $ANTLR start "whileStat"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:134:1: whileStat : WHILE LPAREN bool= condition RPAREN statement ;
	public final void whileStat() throws RecognitionException {
		Boolean bool =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:134:12: ( WHILE LPAREN bool= condition RPAREN statement )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:134:14: WHILE LPAREN bool= condition RPAREN statement
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStat927); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat929); 
			pushFollow(FOLLOW_condition_in_whileStat933);
			bool=condition();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat935); 
			pushFollow(FOLLOW_statement_in_whileStat937);
			statement();
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:137:1: forStat : FOR LPAREN initialization SEMICOL bool= condition SEMICOL increment RPAREN statement ;
	public final void forStat() throws RecognitionException {
		Boolean bool =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:137:11: ( FOR LPAREN initialization SEMICOL bool= condition SEMICOL increment RPAREN statement )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:137:13: FOR LPAREN initialization SEMICOL bool= condition SEMICOL increment RPAREN statement
			{
			match(input,FOR,FOLLOW_FOR_in_forStat956); 
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat958); 
			pushFollow(FOLLOW_initialization_in_forStat960);
			initialization();
			state._fsp--;

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat962); 
			pushFollow(FOLLOW_condition_in_forStat966);
			bool=condition();
			state._fsp--;

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat968); 
			pushFollow(FOLLOW_increment_in_forStat970);
			increment();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat972); 
			pushFollow(FOLLOW_statement_in_forStat974);
			statement();
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



	// $ANTLR start "returnStat"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:140:1: returnStat : RETURN (value= atom_exp[env.funct_type] )? SEMICOL ;
	public final void returnStat() throws RecognitionException {
		Value value =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:140:13: ( RETURN (value= atom_exp[env.funct_type] )? SEMICOL )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:140:15: RETURN (value= atom_exp[env.funct_type] )? SEMICOL
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnStat989); 
			env.var_type = "void";
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:140:47: (value= atom_exp[env.funct_type] )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==AMP||LA32_0==CHAR_QUOTE||LA32_0==FLOAT||LA32_0==INT||LA32_0==LPAREN||LA32_0==MULT||LA32_0==WORD) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:140:48: value= atom_exp[env.funct_type]
					{
					pushFollow(FOLLOW_atom_exp_in_returnStat996);
					value=atom_exp(env.funct_type);
					state._fsp--;

					env.var_type = value.type;
					}
					break;

			}

			env.checkFunctionReturnType(env.var_type, env.funct_type);
			match(input,SEMICOL,FOLLOW_SEMICOL_in_returnStat1005); 
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
	// $ANTLR end "returnStat"



	// $ANTLR start "type_name"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:143:1: type_name returns [Token token] : (tk= K_INT |tk= K_FLOAT |tk= K_CHAR ) ;
	public final Token type_name() throws RecognitionException {
		Token token = null;


		Token tk=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:144:5: ( (tk= K_INT |tk= K_FLOAT |tk= K_CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:144:7: (tk= K_INT |tk= K_FLOAT |tk= K_CHAR )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:144:7: (tk= K_INT |tk= K_FLOAT |tk= K_CHAR )
			int alt33=3;
			switch ( input.LA(1) ) {
			case K_INT:
				{
				alt33=1;
				}
				break;
			case K_FLOAT:
				{
				alt33=2;
				}
				break;
			case K_CHAR:
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:144:8: tk= K_INT
					{
					tk=(Token)match(input,K_INT,FOLLOW_K_INT_in_type_name1031); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:145:7: tk= K_FLOAT
					{
					tk=(Token)match(input,K_FLOAT,FOLLOW_K_FLOAT_in_type_name1041); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:146:7: tk= K_CHAR
					{
					tk=(Token)match(input,K_CHAR,FOLLOW_K_CHAR_in_type_name1052); 
					}
					break;

			}

			token = tk;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return token;
	}
	// $ANTLR end "type_name"



	// $ANTLR start "expression"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:149:1: expression[String type] returns [Value value] : v1= multiply_exp[type] (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )* ;
	public final Value expression(String type) throws RecognitionException {
		Value value = null;


		Token op=null;
		Value v1 =null;
		Value v2 =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:150:5: (v1= multiply_exp[type] (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:150:7: v1= multiply_exp[type] (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression1082);
			v1=multiply_exp(type);
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:150:29: (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )*
			loop34:
			while (true) {
				int alt34=3;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==ADD) ) {
					alt34=1;
				}
				else if ( (LA34_0==SUB) ) {
					alt34=2;
				}

				switch (alt34) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:150:31: op= ADD v2= multiply_exp[type]
					{
					op=(Token)match(input,ADD,FOLLOW_ADD_in_expression1089); 
					pushFollow(FOLLOW_multiply_exp_in_expression1093);
					v2=multiply_exp(type);
					state._fsp--;

					v1 = env.doAdd(op, v1, v2);
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:151:13: op= SUB v2= multiply_exp[type]
					{
					op=(Token)match(input,SUB,FOLLOW_SUB_in_expression1113); 
					pushFollow(FOLLOW_multiply_exp_in_expression1117);
					v2=multiply_exp(type);
					state._fsp--;

					v1 = env.doSub(op, v1, v2);
					}
					break;

				default :
					break loop34;
				}
			}

			value = v1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expression"



	// $ANTLR start "multiply_exp"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:155:1: multiply_exp[String type] returns [Value value] : v1= atom_exp[type] (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )* ;
	public final Value multiply_exp(String type) throws RecognitionException {
		Value value = null;


		Token op=null;
		Value v1 =null;
		Value v2 =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:156:5: (v1= atom_exp[type] (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:156:7: v1= atom_exp[type] (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp1168);
			v1=atom_exp(type);
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:156:25: (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )*
			loop35:
			while (true) {
				int alt35=3;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==MULT) ) {
					alt35=1;
				}
				else if ( (LA35_0==DIV) ) {
					alt35=2;
				}

				switch (alt35) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:156:27: op= MULT v2= atom_exp[type]
					{
					op=(Token)match(input,MULT,FOLLOW_MULT_in_multiply_exp1175); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp1179);
					v2=atom_exp(type);
					state._fsp--;

					v1 = env.doMul(op, v1, v2);
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:157:12: op= DIV v2= atom_exp[type]
					{
					op=(Token)match(input,DIV,FOLLOW_DIV_in_multiply_exp1198); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp1202);
					v2=atom_exp(type);
					state._fsp--;

					v1 = env.doDiv(op, v1, v2);
					}
					break;

				default :
					break loop35;
				}
			}

			value = v1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multiply_exp"



	// $ANTLR start "atom_exp"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:161:1: atom_exp[String type] returns [Value value] : (tk= INT |tk= FLOAT |tk= CHAR_QUOTE |name= WORD ( ( LBRACK (pos= INT )? RBRACK ) | call_function |) | MULT name= WORD | AMP name= WORD | LPAREN v= expression[type] RPAREN );
	public final Value atom_exp(String type) throws RecognitionException {
		Value value = null;


		Token tk=null;
		Token name=null;
		Token pos=null;
		Value v =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:162:5: (tk= INT |tk= FLOAT |tk= CHAR_QUOTE |name= WORD ( ( LBRACK (pos= INT )? RBRACK ) | call_function |) | MULT name= WORD | AMP name= WORD | LPAREN v= expression[type] RPAREN )
			int alt38=7;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt38=1;
				}
				break;
			case FLOAT:
				{
				alt38=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt38=3;
				}
				break;
			case WORD:
				{
				alt38=4;
				}
				break;
			case MULT:
				{
				alt38=5;
				}
				break;
			case AMP:
				{
				alt38=6;
				}
				break;
			case LPAREN:
				{
				alt38=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:162:7: tk= INT
					{
					tk=(Token)match(input,INT,FOLLOW_INT_in_atom_exp1256); 
					value = env.setValue(tk, ValueTypes.INT_STR, type);
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:163:7: tk= FLOAT
					{
					tk=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp1268); 
					value = env.setValue(tk, ValueTypes.FLOAT_STR, type);
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:164:7: tk= CHAR_QUOTE
					{
					tk=(Token)match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp1280); 
					value = env.setValue(tk, ValueTypes.CHAR_STR, type);
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:7: name= WORD ( ( LBRACK (pos= INT )? RBRACK ) | call_function |)
					{
					name=(Token)match(input,WORD,FOLLOW_WORD_in_atom_exp1292); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:17: ( ( LBRACK (pos= INT )? RBRACK ) | call_function |)
					int alt37=3;
					switch ( input.LA(1) ) {
					case LBRACK:
						{
						alt37=1;
						}
						break;
					case LPAREN:
						{
						alt37=2;
						}
						break;
					case ADD:
					case COMMA:
					case DIV:
					case EQ:
					case GE:
					case GT:
					case LE:
					case LT:
					case MULT:
					case NEQ:
					case RCURL:
					case RPAREN:
					case SEMICOL:
					case SUB:
						{
						alt37=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}
					switch (alt37) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:18: ( LBRACK (pos= INT )? RBRACK )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:18: ( LBRACK (pos= INT )? RBRACK )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:19: LBRACK (pos= INT )? RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp1296); 
							env.vect_pos = "0";
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:48: (pos= INT )?
							int alt36=2;
							int LA36_0 = input.LA(1);
							if ( (LA36_0==INT) ) {
								alt36=1;
							}
							switch (alt36) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:49: pos= INT
									{
									pos=(Token)match(input,INT,FOLLOW_INT_in_atom_exp1303); 
									env.vect_pos = pos.getText();
									}
									break;

							}

							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp1309); 
							}

							value = env.getVectorValue(name, type, env.vect_pos);
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:166:13: call_function
							{
							pushFollow(FOLLOW_call_function_in_atom_exp1326);
							call_function();
							state._fsp--;

							env.var_name = name; env.var_type = env.getVarType(name); env.checkCallFunctionReturnType(env.var_type, type); value = env.setValueCallFunction(name, env.var_type, type);
							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:13: 
							{
							value = env.getDeclaredValue(name, type);
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:168:7: MULT name= WORD
					{
					match(input,MULT,FOLLOW_MULT_in_atom_exp1352); 
					name=(Token)match(input,WORD,FOLLOW_WORD_in_atom_exp1356); 
					value = env.getDeclaredValue(name, type);
					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:169:7: AMP name= WORD
					{
					match(input,AMP,FOLLOW_AMP_in_atom_exp1367); 
					env.is_amp_punct = true;
					name=(Token)match(input,WORD,FOLLOW_WORD_in_atom_exp1373); 
					value = env.getDeclaredValue(name, type);
					}
					break;
				case 7 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:170:10: LPAREN v= expression[type] RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp1387); 
					pushFollow(FOLLOW_expression_in_atom_exp1391);
					v=expression(type);
					state._fsp--;

					 value = v;
					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp1396); 
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
		return value;
	}
	// $ANTLR end "atom_exp"



	// $ANTLR start "initialization"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:1: initialization : ( type_name )? name= WORD ( assignment )? ;
	public final void initialization() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:16: ( ( type_name )? name= WORD ( assignment )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:18: ( type_name )? name= WORD ( assignment )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:18: ( type_name )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= K_CHAR && LA39_0 <= K_INT)) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:18: type_name
					{
					pushFollow(FOLLOW_type_name_in_initialization1412);
					type_name();
					state._fsp--;

					}
					break;

			}

			name=(Token)match(input,WORD,FOLLOW_WORD_in_initialization1417); 
			env.var_name = name;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:63: ( assignment )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ADD||LA40_0==ASS||LA40_0==DIV||LA40_0==MULT||LA40_0==SUB) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:173:63: assignment
					{
					pushFollow(FOLLOW_assignment_in_initialization1421);
					assignment();
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
	// $ANTLR end "initialization"



	// $ANTLR start "condition"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:176:1: condition returns [Boolean bool = false] : exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] ;
	public final Boolean condition() throws RecognitionException {
		Boolean bool =  false;


		Value exp1 =null;
		Token comp =null;
		Value exp2 =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:177:5: (exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:177:7: exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR]
			{
			pushFollow(FOLLOW_expression_in_condition1446);
			exp1=expression(ValueTypes.ANYVALUE_STR);
			state._fsp--;

			pushFollow(FOLLOW_compare_in_condition1451);
			comp=compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_condition1455);
			exp2=expression(ValueTypes.ANYVALUE_STR);
			state._fsp--;

			bool = env.compareEvaluator(comp,exp1,exp2);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return bool;
	}
	// $ANTLR end "condition"



	// $ANTLR start "increment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:180:1: increment : name= WORD assignment ;
	public final void increment() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:180:12: (name= WORD assignment )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:180:14: name= WORD assignment
			{
			name=(Token)match(input,WORD,FOLLOW_WORD_in_increment1478); 
			env.var_name = name;
			pushFollow(FOLLOW_assignment_in_increment1482);
			assignment();
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
	// $ANTLR end "increment"



	// $ANTLR start "compare"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:183:1: compare returns [Token tk] : comp= ( EQ | NEQ | LT | GT | LE | GE ) ;
	public final Token compare() throws RecognitionException {
		Token tk = null;


		Token comp=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:184:5: (comp= ( EQ | NEQ | LT | GT | LE | GE ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:184:6: comp= ( EQ | NEQ | LT | GT | LE | GE )
			{
			comp=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NEQ ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			tk = comp;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tk;
	}
	// $ANTLR end "compare"



	// $ANTLR start "anything"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:193:1: anything : D_QUOTE (~ ( D_QUOTE ) )* D_QUOTE ;
	public final void anything() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:193:11: ( D_QUOTE (~ ( D_QUOTE ) )* D_QUOTE )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:193:13: D_QUOTE (~ ( D_QUOTE ) )* D_QUOTE
			{
			match(input,D_QUOTE,FOLLOW_D_QUOTE_in_anything1580); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:193:21: (~ ( D_QUOTE ) )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= ADD && LA41_0 <= DOT)||(LA41_0 >= ELSE && LA41_0 <= WS)) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
					{
					if ( (input.LA(1) >= ADD && input.LA(1) <= DOT)||(input.LA(1) >= ELSE && input.LA(1) <= WS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop41;
				}
			}

			match(input,D_QUOTE,FOLLOW_D_QUOTE_in_anything1588); 
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

	// Delegated rules



	public static final BitSet FOLLOW_include_in_start67 = new BitSet(new long[]{0x0050001074000000L});
	public static final BitSet FOLLOW_global_in_start70 = new BitSet(new long[]{0x0050001070000000L});
	public static final BitSet FOLLOW_EOF_in_start75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include92 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LT_in_include94 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_include96 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_DOT_in_include99 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_include101 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_GT_in_include105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_void_in_global124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_global137 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_pointer_in_global144 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_global167 = new BitSet(new long[]{0x0000901480008890L});
	public static final BitSet FOLLOW_ass_multiple_in_global173 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_vector_in_global197 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_params_in_global219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_funct_void241 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_funct_void247 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_funct_params_in_funct_void251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_funct_params270 = new BitSet(new long[]{0x0000080070000000L});
	public static final BitSet FOLLOW_type_name_in_funct_params277 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_funct_params281 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_COMMA_in_funct_params286 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_type_name_in_funct_params290 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_funct_params294 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RPAREN_in_funct_params302 = new BitSet(new long[]{0x0000100100000000L});
	public static final BitSet FOLLOW_codeblock_in_funct_params306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment348 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_expression_in_assignment352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_ass_multiple370 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_ass_multiple374 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_ass_multiple378 = new BitSet(new long[]{0x0000801000008892L});
	public static final BitSet FOLLOW_assignment_in_ass_multiple382 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASS_in_ass_vector413 = new BitSet(new long[]{0x0040001508100420L});
	public static final BitSet FOLLOW_LCURL_in_ass_vector417 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_expression_in_ass_vector421 = new BitSet(new long[]{0x0000020000000800L});
	public static final BitSet FOLLOW_COMMA_in_ass_vector427 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_expression_in_ass_vector431 = new BitSet(new long[]{0x0000020000000800L});
	public static final BitSet FOLLOW_RCURL_in_ass_vector438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_ass_vector450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector472 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_INT_in_vector479 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector485 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ass_vector_in_vector489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_pointer510 = new BitSet(new long[]{0x0040000400000000L});
	public static final BitSet FOLLOW_WORD_in_pointer515 = new BitSet(new long[]{0x0000801000008092L});
	public static final BitSet FOLLOW_LPAREN_in_pointer521 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_expression_in_pointer523 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_pointer526 = new BitSet(new long[]{0x0000801000008092L});
	public static final BitSet FOLLOW_assignment_in_pointer529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function550 = new BitSet(new long[]{0x0040081000020000L});
	public static final BitSet FOLLOW_call_args_in_call_function553 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_COMMA_in_call_function556 = new BitSet(new long[]{0x0040001000020000L});
	public static final BitSet FOLLOW_call_args_in_call_function558 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RPAREN_in_call_function564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anything_in_call_args578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_call_args586 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_call_args589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock616 = new BitSet(new long[]{0x0060161172200000L});
	public static final BitSet FOLLOW_statement_in_codeblock618 = new BitSet(new long[]{0x0060161172200000L});
	public static final BitSet FOLLOW_RCURL_in_codeblock621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_in_statement652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_statement660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStat_in_statement692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_local712 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_pointer_in_local719 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_WORD_in_local760 = new BitSet(new long[]{0x0000901480008890L});
	public static final BitSet FOLLOW_ass_multiple_in_local765 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_vector_in_local816 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_call_function_in_local865 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_local869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat890 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat892 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_condition_in_ifStat896 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat898 = new BitSet(new long[]{0x0000100100000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat900 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat903 = new BitSet(new long[]{0x0060141172200000L});
	public static final BitSet FOLLOW_statement_in_ifStat905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat927 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat929 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_condition_in_whileStat933 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat935 = new BitSet(new long[]{0x0060141172200000L});
	public static final BitSet FOLLOW_statement_in_whileStat937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat956 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat958 = new BitSet(new long[]{0x0040000070000000L});
	public static final BitSet FOLLOW_initialization_in_forStat960 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat962 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_condition_in_forStat966 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat968 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_increment_in_forStat970 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat972 = new BitSet(new long[]{0x0060141172200000L});
	public static final BitSet FOLLOW_statement_in_forStat974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStat989 = new BitSet(new long[]{0x0040101408100420L});
	public static final BitSet FOLLOW_atom_exp_in_returnStat996 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_returnStat1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_type_name1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_type_name1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CHAR_in_type_name1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression1082 = new BitSet(new long[]{0x0000800000000012L});
	public static final BitSet FOLLOW_ADD_in_expression1089 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_multiply_exp_in_expression1093 = new BitSet(new long[]{0x0000800000000012L});
	public static final BitSet FOLLOW_SUB_in_expression1113 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_multiply_exp_in_expression1117 = new BitSet(new long[]{0x0000800000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp1168 = new BitSet(new long[]{0x0000001000008002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp1175 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp1179 = new BitSet(new long[]{0x0000001000008002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp1198 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp1202 = new BitSet(new long[]{0x0000001000008002L});
	public static final BitSet FOLLOW_INT_in_atom_exp1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_atom_exp1292 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp1296 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp1303 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_atom_exp1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_atom_exp1352 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_atom_exp1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_atom_exp1367 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_atom_exp1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp1387 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_expression_in_atom_exp1391 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_initialization1412 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_WORD_in_initialization1417 = new BitSet(new long[]{0x0000801000008092L});
	public static final BitSet FOLLOW_assignment_in_initialization1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_condition1446 = new BitSet(new long[]{0x0000002A00C80000L});
	public static final BitSet FOLLOW_compare_in_condition1451 = new BitSet(new long[]{0x0040001408100420L});
	public static final BitSet FOLLOW_expression_in_condition1455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_increment1478 = new BitSet(new long[]{0x0000801000008090L});
	public static final BitSet FOLLOW_assignment_in_increment1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_compare1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_D_QUOTE_in_anything1580 = new BitSet(new long[]{0x00FFFFFFFFFFFFF0L});
	public static final BitSet FOLLOW_D_QUOTE_in_anything1588 = new BitSet(new long[]{0x0000000000000002L});
}
