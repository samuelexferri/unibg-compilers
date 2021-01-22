// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g 2021-01-22 16:50:13

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
		"LE", "LPAREN", "LT", "MULT", "NEQ", "NEWL", "OR", "PERC", "RBRACK", "RCURL", 
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
	public static final int OR=39;
	public static final int PERC=40;
	public static final int RBRACK=41;
	public static final int RCURL=42;
	public static final int RETURN=43;
	public static final int RPAREN=44;
	public static final int SEMICOL=45;
	public static final int SLASHR=46;
	public static final int SPACE=47;
	public static final int SUB=48;
	public static final int S_QUOTE=49;
	public static final int TAB=50;
	public static final int TOKEN_ERROR=51;
	public static final int UNDRSCR=52;
	public static final int VOID=53;
	public static final int WHILE=54;
	public static final int WORD=55;
	public static final int WS=56;

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
		Translation tra;

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
	    	return env.tra.translation.toString();
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:1: start : ( include )* ( global )* tk= EOF ;
	public final void start() throws RecognitionException {
		Token tk=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:9: ( ( include )* ( global )* tk= EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:11: ( include )* ( global )* tk= EOF
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:11: ( include )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:11: include
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

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:20: ( global )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= K_CHAR && LA2_0 <= K_INT)||LA2_0==MULT||LA2_0==VOID||LA2_0==WORD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:70:20: global
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:73:1: include : INCLUDE LT WORD ( DOT WORD )? GT ;
	public final void include() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:73:11: ( INCLUDE LT WORD ( DOT WORD )? GT )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:73:13: INCLUDE LT WORD ( DOT WORD )? GT
			{
			match(input,INCLUDE,FOLLOW_INCLUDE_in_include92); 
			match(input,LT,FOLLOW_LT_in_include94); 
			match(input,WORD,FOLLOW_WORD_in_include96); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:73:29: ( DOT WORD )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DOT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:73:30: DOT WORD
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:1: global : ( funct_void | (type= type_name )? ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) ) );
	public final void global() throws RecognitionException {
		Token name=null;
		Token type =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:10: ( funct_void | (type= type_name )? ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) ) )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:76:12: funct_void
					{
					pushFollow(FOLLOW_funct_void_in_global124);
					funct_void();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:7: (type= type_name )? ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) )
					{
					env.var_type = ValueTypes.UNDEFINED_STR; env.funct_type = ValueTypes.UNDEFINED_STR; env.is_local = false;
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:115: (type= type_name )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= K_CHAR && LA4_0 <= K_INT)) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:116: type= type_name
							{
							pushFollow(FOLLOW_type_name_in_global137);
							type=type_name();
							state._fsp--;

							env.var_type = type.getText();
							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:166: ( pointer SEMICOL |name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params ) )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:77:167: pointer SEMICOL
							{
							pushFollow(FOLLOW_pointer_in_global144);
							pointer();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_global146); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:78:17: name= WORD ( ( ass_multiple | vector ) SEMICOL | funct_params )
							{
							name=(Token)match(input,WORD,FOLLOW_WORD_in_global167); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:78:27: ( ( ass_multiple | vector ) SEMICOL | funct_params )
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:78:28: ( ass_multiple | vector ) SEMICOL
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:78:28: ( ass_multiple | vector )
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:78:29: ass_multiple
											{
											env.var_name = name; env.addNewVariable(env.var_type, name, false);
											pushFollow(FOLLOW_ass_multiple_in_global173);
											ass_multiple();
											state._fsp--;

											}
											break;
										case 2 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:79:21: vector
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:80:16: funct_params
									{
									env.var_name = name; env.funct_name = name; env.funct_type = type.getText(); env.addFunction(env.var_type, name); env.tra.traAddNewFunction();
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:83:1: funct_void : type= VOID name= WORD funct_params ;
	public final void funct_void() throws RecognitionException {
		Token type=null;
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:83:13: (type= VOID name= WORD funct_params )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:83:15: type= VOID name= WORD funct_params
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:1: funct_params : LPAREN (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )? RPAREN isBlock= codeblock ;
	public final void funct_params() throws RecognitionException {
		Token name=null;
		Token type =null;
		Boolean isBlock =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:15: ( LPAREN (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )? RPAREN isBlock= codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:17: LPAREN (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )? RPAREN isBlock= codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_funct_params270); 
			env.is_local = true; env.var_type = ValueTypes.UNDEFINED_STR;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:88: (type= type_name name= WORD ( COMMA type= type_name name= WORD )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= K_CHAR && LA10_0 <= K_INT)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:89: type= type_name name= WORD ( COMMA type= type_name name= WORD )*
					{
					pushFollow(FOLLOW_type_name_in_funct_params277);
					type=type_name();
					state._fsp--;

					name=(Token)match(input,WORD,FOLLOW_WORD_in_funct_params281); 
					env.var_type = type.getText(); env.var_name = name; env.addNewVariable(env.var_type, name, true);
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:216: ( COMMA type= type_name name= WORD )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:86:217: COMMA type= type_name name= WORD
							{
							match(input,COMMA,FOLLOW_COMMA_in_funct_params286); 
							pushFollow(FOLLOW_type_name_in_funct_params290);
							type=type_name();
							state._fsp--;

							name=(Token)match(input,WORD,FOLLOW_WORD_in_funct_params294); 
							env.var_type = type.getText(); env.var_name = name; env.addNewVariable(env.var_type, name, true);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:1: assignment : ( (eq= ADD ASS |eq= SUB ASS |eq= MULT ASS |eq= DIV ASS |eq= ASS ) exp= expression[env.var_type] ) ;
	public final void assignment() throws RecognitionException {
		Token eq=null;
		Value exp =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:13: ( ( (eq= ADD ASS |eq= SUB ASS |eq= MULT ASS |eq= DIV ASS |eq= ASS ) exp= expression[env.var_type] ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:15: ( (eq= ADD ASS |eq= SUB ASS |eq= MULT ASS |eq= DIV ASS |eq= ASS ) exp= expression[env.var_type] )
			{
			env.var_type = env.getVarType(env.var_name); Token var_temp = env.var_name; env.tra.traAssignmentBefore();
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:123: ( (eq= ADD ASS |eq= SUB ASS |eq= MULT ASS |eq= DIV ASS |eq= ASS ) exp= expression[env.var_type] )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:124: (eq= ADD ASS |eq= SUB ASS |eq= MULT ASS |eq= DIV ASS |eq= ASS ) exp= expression[env.var_type]
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:124: (eq= ADD ASS |eq= SUB ASS |eq= MULT ASS |eq= DIV ASS |eq= ASS )
			int alt11=5;
			switch ( input.LA(1) ) {
			case ADD:
				{
				alt11=1;
				}
				break;
			case SUB:
				{
				alt11=2;
				}
				break;
			case MULT:
				{
				alt11=3;
				}
				break;
			case DIV:
				{
				alt11=4;
				}
				break;
			case ASS:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:125: eq= ADD ASS
					{
					eq=(Token)match(input,ADD,FOLLOW_ADD_in_assignment332); 
					match(input,ASS,FOLLOW_ASS_in_assignment334); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:138: eq= SUB ASS
					{
					eq=(Token)match(input,SUB,FOLLOW_SUB_in_assignment340); 
					match(input,ASS,FOLLOW_ASS_in_assignment342); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:151: eq= MULT ASS
					{
					eq=(Token)match(input,MULT,FOLLOW_MULT_in_assignment348); 
					match(input,ASS,FOLLOW_ASS_in_assignment350); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:165: eq= DIV ASS
					{
					eq=(Token)match(input,DIV,FOLLOW_DIV_in_assignment356); 
					match(input,ASS,FOLLOW_ASS_in_assignment358); 
					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:89:178: eq= ASS
					{
					eq=(Token)match(input,ASS,FOLLOW_ASS_in_assignment364); 
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_assignment369);
			exp=expression(env.var_type);
			state._fsp--;

			env.assignValue(var_temp, exp, eq); env.tra.traAssignmentAfter(exp);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:1: ass_multiple : ( assignment )? ( COMMA name= WORD ( assignment )? )* ;
	public final void ass_multiple() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:14: ( ( assignment )? ( COMMA name= WORD ( assignment )? )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:16: ( assignment )? ( COMMA name= WORD ( assignment )? )*
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:16: ( assignment )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ADD||LA12_0==ASS||LA12_0==DIV||LA12_0==MULT||LA12_0==SUB) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:16: assignment
					{
					pushFollow(FOLLOW_assignment_in_ass_multiple386);
					assignment();
					state._fsp--;

					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:28: ( COMMA name= WORD ( assignment )? )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:29: COMMA name= WORD ( assignment )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_ass_multiple390); 
					name=(Token)match(input,WORD,FOLLOW_WORD_in_ass_multiple394); 
					env.var_name = name; env.addNewVariable(env.var_type, name, false);
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:117: ( assignment )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ADD||LA13_0==ASS||LA13_0==DIV||LA13_0==MULT||LA13_0==SUB) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:92:117: assignment
							{
							pushFollow(FOLLOW_assignment_in_ass_multiple398);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:95:1: ass_vector[String vect_type] : ASS ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) |exp= expression[vect_type] ) ;
	public final void ass_vector(String vect_type) throws RecognitionException {
		Value e1 =null;
		Value e2 =null;
		Value exp =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:5: ( ASS ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) |exp= expression[vect_type] ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:7: ASS ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) |exp= expression[vect_type] )
			{
			match(input,ASS,FOLLOW_ASS_in_ass_vector429); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:11: ( ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL ) |exp= expression[vect_type] )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:12: ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:12: ( LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:13: LCURL e1= expression[vect_type] ( COMMA e2= expression[vect_type] )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_ass_vector433); 
					pushFollow(FOLLOW_expression_in_ass_vector437);
					e1=expression(vect_type);
					state._fsp--;

					env.createVector(e1);
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:68: ( COMMA e2= expression[vect_type] )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:96:69: COMMA e2= expression[vect_type]
							{
							match(input,COMMA,FOLLOW_COMMA_in_ass_vector443); 
							pushFollow(FOLLOW_expression_in_ass_vector447);
							e2=expression(vect_type);
							state._fsp--;

							env.addValueVector(e2);
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_ass_vector454); 
					}

					env.insertVectorST();
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:97:10: exp= expression[vect_type]
					{
					pushFollow(FOLLOW_expression_in_ass_vector471);
					exp=expression(vect_type);
					state._fsp--;

					env.assignVectorValue(env.var_name, env.vect_size, exp);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:1: vector : LBRACK (size= INT )? RBRACK ( ass_vector[env.var_type] )? ;
	public final void vector() throws RecognitionException {
		Token size=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:11: ( LBRACK (size= INT )? RBRACK ( ass_vector[env.var_type] )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:13: LBRACK (size= INT )? RBRACK ( ass_vector[env.var_type] )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector495); 
			env.vect_size = "0";
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:43: (size= INT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==INT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:44: size= INT
					{
					size=(Token)match(input,INT,FOLLOW_INT_in_vector502); 
					env.vect_size = size.getText();
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector508); 
			env.addNewVector(env.var_type, env.var_name, env.vect_size);
			env.var_type = env.getVarType(env.var_name);
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:207: ( ass_vector[env.var_type] )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ASS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:100:207: ass_vector[env.var_type]
					{
					pushFollow(FOLLOW_ass_vector_in_vector514);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:1: pointer : MULT (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN ) ( assignment )? ;
	public final void pointer() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:11: ( MULT (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN ) ( assignment )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:13: MULT (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN ) ( assignment )?
			{
			match(input,MULT,FOLLOW_MULT_in_pointer535); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:18: (name= WORD | LPAREN expression[ValueTypes.INT_STR] RPAREN )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:19: name= WORD
					{
					name=(Token)match(input,WORD,FOLLOW_WORD_in_pointer540); 
					env.var_name = name; env.addNewVector(env.var_type, env.var_name, "100") /* Per i puntatori size=100 fittizia */;
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:148: LPAREN expression[ValueTypes.INT_STR] RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_pointer546); 
					pushFollow(FOLLOW_expression_in_pointer548);
					expression(ValueTypes.INT_STR);
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_pointer551); 
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:194: ( assignment )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ADD||LA20_0==ASS||LA20_0==DIV||LA20_0==MULT||LA20_0==SUB) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:103:194: assignment
					{
					pushFollow(FOLLOW_assignment_in_pointer554);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:1: call_function : LPAREN ( call_args ( COMMA call_args )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:16: ( LPAREN ( call_args ( COMMA call_args )* )? RPAREN )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:18: LPAREN ( call_args ( COMMA call_args )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function575); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:25: ( call_args ( COMMA call_args )* )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==D_QUOTE||LA22_0==MULT||LA22_0==WORD) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:26: call_args ( COMMA call_args )*
					{
					pushFollow(FOLLOW_call_args_in_call_function578);
					call_args();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:36: ( COMMA call_args )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==COMMA) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:106:37: COMMA call_args
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function581); 
							pushFollow(FOLLOW_call_args_in_call_function583);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function589); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:109:1: call_args : ( stringquote | MULT WORD | WORD ( ( LBRACK INT RBRACK )? | call_function ) );
	public final void call_args() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:109:12: ( stringquote | MULT WORD | WORD ( ( LBRACK INT RBRACK )? | call_function ) )
			int alt25=3;
			switch ( input.LA(1) ) {
			case D_QUOTE:
				{
				alt25=1;
				}
				break;
			case MULT:
				{
				alt25=2;
				}
				break;
			case WORD:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:109:14: stringquote
					{
					pushFollow(FOLLOW_stringquote_in_call_args603);
					stringquote();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:110:7: MULT WORD
					{
					match(input,MULT,FOLLOW_MULT_in_call_args611); 
					match(input,WORD,FOLLOW_WORD_in_call_args613); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:111:7: WORD ( ( LBRACK INT RBRACK )? | call_function )
					{
					match(input,WORD,FOLLOW_WORD_in_call_args621); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:111:12: ( ( LBRACK INT RBRACK )? | call_function )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==COMMA||LA24_0==LBRACK||LA24_0==RPAREN) ) {
						alt24=1;
					}
					else if ( (LA24_0==LPAREN) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:111:13: ( LBRACK INT RBRACK )?
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:111:13: ( LBRACK INT RBRACK )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==LBRACK) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:111:14: LBRACK INT RBRACK
									{
									match(input,LBRACK,FOLLOW_LBRACK_in_call_args625); 
									match(input,INT,FOLLOW_INT_in_call_args627); 
									match(input,RBRACK,FOLLOW_RBRACK_in_call_args629); 
									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:111:36: call_function
							{
							pushFollow(FOLLOW_call_function_in_call_args635);
							call_function();
							state._fsp--;

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
	// $ANTLR end "call_args"



	// $ANTLR start "codeblock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:114:1: codeblock returns [Boolean isBlock = false] : ( LCURL ( statement )* RCURL | SEMICOL );
	public final Boolean codeblock() throws RecognitionException {
		Boolean isBlock =  false;


		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:115:5: ( LCURL ( statement )* RCURL | SEMICOL )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:115:7: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock663); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:115:13: ( statement )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==FOR||LA26_0==IF||(LA26_0 >= K_CHAR && LA26_0 <= K_INT)||LA26_0==LCURL||LA26_0==MULT||LA26_0==RETURN||LA26_0==SEMICOL||(LA26_0 >= WHILE && LA26_0 <= WORD)) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:115:13: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock665);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop26;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock668); 
					isBlock = true;
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:116:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock681); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:119:1: statement : ( local | codeblock | ifStat | whileStat | forStat | returnStat );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:119:13: ( local | codeblock | ifStat | whileStat | forStat | returnStat )
			int alt28=6;
			switch ( input.LA(1) ) {
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt28=1;
				}
				break;
			case LCURL:
			case SEMICOL:
				{
				alt28=2;
				}
				break;
			case IF:
				{
				alt28=3;
				}
				break;
			case WHILE:
				{
				alt28=4;
				}
				break;
			case FOR:
				{
				alt28=5;
				}
				break;
			case RETURN:
				{
				alt28=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:119:15: local
					{
					pushFollow(FOLLOW_local_in_statement699);
					local();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:120:7: codeblock
					{
					pushFollow(FOLLOW_codeblock_in_statement707);
					codeblock();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:121:7: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement715);
					ifStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:122:7: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement723);
					whileStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:123:7: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement731);
					forStat();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:124:7: returnStat
					{
					pushFollow(FOLLOW_returnStat_in_statement739);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:1: local : (type= type_name )? ( pointer |name= WORD ( ass_multiple | vector | call_function ) ) SEMICOL ;
	public final void local() throws RecognitionException {
		Token name=null;
		Token type =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:9: ( (type= type_name )? ( pointer |name= WORD ( ass_multiple | vector | call_function ) ) SEMICOL )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:11: (type= type_name )? ( pointer |name= WORD ( ass_multiple | vector | call_function ) ) SEMICOL
			{
			env.var_type = ValueTypes.UNDEFINED_STR; env.is_local = true;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:75: (type= type_name )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= K_CHAR && LA29_0 <= K_INT)) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:76: type= type_name
					{
					pushFollow(FOLLOW_type_name_in_local759);
					type=type_name();
					state._fsp--;

					env.var_type = type.getText();
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:126: ( pointer |name= WORD ( ass_multiple | vector | call_function ) )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==MULT) ) {
				alt31=1;
			}
			else if ( (LA31_0==WORD) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:127:127: pointer
					{
					pushFollow(FOLLOW_pointer_in_local766);
					pointer();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:128:44: name= WORD ( ass_multiple | vector | call_function )
					{
					name=(Token)match(input,WORD,FOLLOW_WORD_in_local813); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:128:54: ( ass_multiple | vector | call_function )
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
					case LBRACK:
						{
						alt30=2;
						}
						break;
					case LPAREN:
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:128:55: ass_multiple
							{
							env.var_name = name; env.addNewVariable(env.var_type, name, false);
							pushFollow(FOLLOW_ass_multiple_in_local818);
							ass_multiple();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:129:48: vector
							{
							env.var_name = name;
							pushFollow(FOLLOW_vector_in_local869);
							vector();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:130:45: call_function
							{
							env.var_name = name; env.checkCallFunction(env.var_type, name);
							pushFollow(FOLLOW_call_function_in_local918);
							call_function();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_local922); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:133:1: ifStat : IF LPAREN bool= condition RPAREN codeblock ( ELSE statement )? ;
	public final void ifStat() throws RecognitionException {
		Boolean bool =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:133:10: ( IF LPAREN bool= condition RPAREN codeblock ( ELSE statement )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:133:12: IF LPAREN bool= condition RPAREN codeblock ( ELSE statement )?
			{
			match(input,IF,FOLLOW_IF_in_ifStat943); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat945); 
			pushFollow(FOLLOW_condition_in_ifStat949);
			bool=condition();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat951); 
			pushFollow(FOLLOW_codeblock_in_ifStat953);
			codeblock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:133:54: ( ELSE statement )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ELSE) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:133:55: ELSE statement
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat956); 
					pushFollow(FOLLOW_statement_in_ifStat958);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:136:1: whileStat : WHILE LPAREN bool= condition RPAREN statement ;
	public final void whileStat() throws RecognitionException {
		Boolean bool =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:136:12: ( WHILE LPAREN bool= condition RPAREN statement )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:136:14: WHILE LPAREN bool= condition RPAREN statement
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStat980); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat982); 
			pushFollow(FOLLOW_condition_in_whileStat986);
			bool=condition();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat988); 
			pushFollow(FOLLOW_statement_in_whileStat990);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:139:1: forStat : FOR LPAREN initialization SEMICOL bool= condition SEMICOL increment RPAREN statement ;
	public final void forStat() throws RecognitionException {
		Boolean bool =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:139:11: ( FOR LPAREN initialization SEMICOL bool= condition SEMICOL increment RPAREN statement )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:139:13: FOR LPAREN initialization SEMICOL bool= condition SEMICOL increment RPAREN statement
			{
			match(input,FOR,FOLLOW_FOR_in_forStat1009); 
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat1011); 
			pushFollow(FOLLOW_initialization_in_forStat1013);
			initialization();
			state._fsp--;

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat1015); 
			pushFollow(FOLLOW_condition_in_forStat1019);
			bool=condition();
			state._fsp--;

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat1021); 
			pushFollow(FOLLOW_increment_in_forStat1023);
			increment();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat1025); 
			pushFollow(FOLLOW_statement_in_forStat1027);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:142:1: returnStat : tk= RETURN (value= atom_exp[env.funct_type] )? SEMICOL ;
	public final void returnStat() throws RecognitionException {
		Token tk=null;
		Value value =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:142:13: (tk= RETURN (value= atom_exp[env.funct_type] )? SEMICOL )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:142:15: tk= RETURN (value= atom_exp[env.funct_type] )? SEMICOL
			{
			tk=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStat1044); 
			env.var_type = "void";
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:142:50: (value= atom_exp[env.funct_type] )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==AMP||LA33_0==CHAR_QUOTE||LA33_0==FLOAT||LA33_0==INT||LA33_0==LPAREN||LA33_0==MULT||LA33_0==WORD) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:142:51: value= atom_exp[env.funct_type]
					{
					pushFollow(FOLLOW_atom_exp_in_returnStat1051);
					value=atom_exp(env.funct_type);
					state._fsp--;

					env.var_type = value.type;
					}
					break;

			}

			env.checkFunctionReturnType(tk, value, env.var_type, env.funct_type);
			match(input,SEMICOL,FOLLOW_SEMICOL_in_returnStat1060); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:145:1: type_name returns [Token token] : (tk= K_INT |tk= K_FLOAT |tk= K_CHAR ) ;
	public final Token type_name() throws RecognitionException {
		Token token = null;


		Token tk=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:146:5: ( (tk= K_INT |tk= K_FLOAT |tk= K_CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:146:7: (tk= K_INT |tk= K_FLOAT |tk= K_CHAR )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:146:7: (tk= K_INT |tk= K_FLOAT |tk= K_CHAR )
			int alt34=3;
			switch ( input.LA(1) ) {
			case K_INT:
				{
				alt34=1;
				}
				break;
			case K_FLOAT:
				{
				alt34=2;
				}
				break;
			case K_CHAR:
				{
				alt34=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:146:8: tk= K_INT
					{
					tk=(Token)match(input,K_INT,FOLLOW_K_INT_in_type_name1086); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:147:7: tk= K_FLOAT
					{
					tk=(Token)match(input,K_FLOAT,FOLLOW_K_FLOAT_in_type_name1096); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:148:7: tk= K_CHAR
					{
					tk=(Token)match(input,K_CHAR,FOLLOW_K_CHAR_in_type_name1107); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:151:1: expression[String type] returns [Value value] : v1= multiply_exp[type] (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )* ;
	public final Value expression(String type) throws RecognitionException {
		Value value = null;


		Token op=null;
		Value v1 =null;
		Value v2 =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:152:5: (v1= multiply_exp[type] (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:152:7: v1= multiply_exp[type] (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression1137);
			v1=multiply_exp(type);
			state._fsp--;

			env.baddorsub = false; env.bmulordiv1 = env.bmulordiv;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:152:86: (op= ADD v2= multiply_exp[type] |op= SUB v2= multiply_exp[type] )*
			loop35:
			while (true) {
				int alt35=3;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==ADD) ) {
					alt35=1;
				}
				else if ( (LA35_0==SUB) ) {
					alt35=2;
				}

				switch (alt35) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:152:88: op= ADD v2= multiply_exp[type]
					{
					op=(Token)match(input,ADD,FOLLOW_ADD_in_expression1146); 
					pushFollow(FOLLOW_multiply_exp_in_expression1150);
					v2=multiply_exp(type);
					state._fsp--;

					env.bmulordiv2 = env.bmulordiv;
					env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv1 || env.baddorsub); env.tra.traSetValueConst(new Value(type, v2.value, false), env.bmulordiv2); v1 = env.doAdd(op, v1, v2); env.baddorsub = true;
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:153:20: op= SUB v2= multiply_exp[type]
					{
					op=(Token)match(input,SUB,FOLLOW_SUB_in_expression1179); 
					pushFollow(FOLLOW_multiply_exp_in_expression1183);
					v2=multiply_exp(type);
					state._fsp--;

					env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv1 || env.baddorsub); env.tra.traSetValueConst(new Value(type, v2.value, false), env.bmulordiv2); v1 = env.doSub(op, v1, v2); env.baddorsub = true;
					}
					break;

				default :
					break loop35;
				}
			}

			value = v1; env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv1 || env.baddorsub);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:157:1: multiply_exp[String type] returns [Value value] : v1= atom_exp[type] (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )* ;
	public final Value multiply_exp(String type) throws RecognitionException {
		Value value = null;


		Token op=null;
		Value v1 =null;
		Value v2 =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:158:5: (v1= atom_exp[type] (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:158:7: v1= atom_exp[type] (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp1242);
			v1=atom_exp(type);
			state._fsp--;

			env.bmulordiv = false;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:158:50: (op= MULT v2= atom_exp[type] |op= DIV v2= atom_exp[type] )*
			loop36:
			while (true) {
				int alt36=3;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==MULT) ) {
					alt36=1;
				}
				else if ( (LA36_0==DIV) ) {
					alt36=2;
				}

				switch (alt36) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:158:52: op= MULT v2= atom_exp[type]
					{
					op=(Token)match(input,MULT,FOLLOW_MULT_in_multiply_exp1251); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp1255);
					v2=atom_exp(type);
					state._fsp--;

					env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv); env.tra.traSetValueConst(new Value(type, v2.value, false), false); v1 = env.doMul(op, v1, v2); env.bmulordiv = true;
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:159:19: op= DIV v2= atom_exp[type]
					{
					op=(Token)match(input,DIV,FOLLOW_DIV_in_multiply_exp1281); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp1285);
					v2=atom_exp(type);
					state._fsp--;

					env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv); env.tra.traSetValueConst(new Value(type, v2.value, false), false); v1 = env.doDiv(op, v1, v2); env.bmulordiv = true;
					}
					break;

				default :
					break loop36;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:163:1: atom_exp[String type] returns [Value value] : (tk= INT |tk= FLOAT |tk= CHAR_QUOTE |name= WORD ( ( LBRACK (pos= INT )? RBRACK ) | call_function |) | MULT name= WORD | AMP name= WORD | LPAREN v= expression[type] RPAREN );
	public final Value atom_exp(String type) throws RecognitionException {
		Value value = null;


		Token tk=null;
		Token name=null;
		Token pos=null;
		Value v =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:164:5: (tk= INT |tk= FLOAT |tk= CHAR_QUOTE |name= WORD ( ( LBRACK (pos= INT )? RBRACK ) | call_function |) | MULT name= WORD | AMP name= WORD | LPAREN v= expression[type] RPAREN )
			int alt39=7;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt39=1;
				}
				break;
			case FLOAT:
				{
				alt39=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt39=3;
				}
				break;
			case WORD:
				{
				alt39=4;
				}
				break;
			case MULT:
				{
				alt39=5;
				}
				break;
			case AMP:
				{
				alt39=6;
				}
				break;
			case LPAREN:
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:164:7: tk= INT
					{
					tk=(Token)match(input,INT,FOLLOW_INT_in_atom_exp1346); 
					value = env.setValue(tk, ValueTypes.INT_STR, type);
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:165:7: tk= FLOAT
					{
					tk=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp1358); 
					value = env.setValue(tk, ValueTypes.FLOAT_STR, type);
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:166:7: tk= CHAR_QUOTE
					{
					tk=(Token)match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp1370); 
					value = env.setValue(tk, ValueTypes.CHAR_STR, type);
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:7: name= WORD ( ( LBRACK (pos= INT )? RBRACK ) | call_function |)
					{
					name=(Token)match(input,WORD,FOLLOW_WORD_in_atom_exp1382); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:17: ( ( LBRACK (pos= INT )? RBRACK ) | call_function |)
					int alt38=3;
					switch ( input.LA(1) ) {
					case LBRACK:
						{
						alt38=1;
						}
						break;
					case LPAREN:
						{
						alt38=2;
						}
						break;
					case ADD:
					case AMP:
					case COMMA:
					case DIV:
					case EQ:
					case GE:
					case GT:
					case LE:
					case LT:
					case MULT:
					case NEQ:
					case OR:
					case RCURL:
					case RPAREN:
					case SEMICOL:
					case SUB:
						{
						alt38=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}
					switch (alt38) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:18: ( LBRACK (pos= INT )? RBRACK )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:18: ( LBRACK (pos= INT )? RBRACK )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:19: LBRACK (pos= INT )? RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp1386); 
							env.vect_pos = "0";
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:48: (pos= INT )?
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==INT) ) {
								alt37=1;
							}
							switch (alt37) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:167:49: pos= INT
									{
									pos=(Token)match(input,INT,FOLLOW_INT_in_atom_exp1393); 
									env.vect_pos = pos.getText();
									}
									break;

							}

							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp1399); 
							}

							value = env.getVectorValue(name, type, env.vect_pos);
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:168:13: call_function
							{
							pushFollow(FOLLOW_call_function_in_atom_exp1416);
							call_function();
							state._fsp--;

							env.var_name = name; env.var_type = env.getVarType(name); env.checkCallFunctionReturnType(name, env.var_type, type); value = env.setValueCallFunction(name, env.var_type, type);
							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:169:13: 
							{
							value = env.getDeclaredValue(name, type); env.tra.traSetValueVar(name);
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:170:7: MULT name= WORD
					{
					match(input,MULT,FOLLOW_MULT_in_atom_exp1442); 
					name=(Token)match(input,WORD,FOLLOW_WORD_in_atom_exp1446); 
					value = env.getDeclaredValue(name, type);
					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:171:7: AMP name= WORD
					{
					match(input,AMP,FOLLOW_AMP_in_atom_exp1457); 
					env.is_amp_punct = true;
					name=(Token)match(input,WORD,FOLLOW_WORD_in_atom_exp1463); 
					value = env.getDeclaredValue(name, type);
					}
					break;
				case 7 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:172:10: LPAREN v= expression[type] RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp1477); 
					pushFollow(FOLLOW_expression_in_atom_exp1481);
					v=expression(type);
					state._fsp--;

					 value = v;
					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp1486); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:1: initialization : (type= type_name )? name= WORD ( assignment )? ;
	public final void initialization() throws RecognitionException {
		Token name=null;
		Token type =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:16: ( (type= type_name )? name= WORD ( assignment )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:18: (type= type_name )? name= WORD ( assignment )?
			{
			env.var_type = ValueTypes.UNDEFINED_STR;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:61: (type= type_name )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= K_CHAR && LA40_0 <= K_INT)) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:62: type= type_name
					{
					pushFollow(FOLLOW_type_name_in_initialization1508);
					type=type_name();
					state._fsp--;

					env.var_type = type.getText();
					}
					break;

			}

			name=(Token)match(input,WORD,FOLLOW_WORD_in_initialization1516); 
			env.var_name = name; env.addNewVariable(env.var_type, name, false);
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:194: ( assignment )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==ADD||LA41_0==ASS||LA41_0==DIV||LA41_0==MULT||LA41_0==SUB) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:175:194: assignment
					{
					pushFollow(FOLLOW_assignment_in_initialization1520);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:178:1: condition returns [Boolean bool = false] : exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] (op= operator exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] )* ;
	public final Boolean condition() throws RecognitionException {
		Boolean bool =  false;


		Value exp1 =null;
		Token comp =null;
		Value exp2 =null;
		Token op =null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:179:5: (exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] (op= operator exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:179:7: exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] (op= operator exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] )*
			{
			pushFollow(FOLLOW_expression_in_condition1545);
			exp1=expression(ValueTypes.ANYVALUE_STR);
			state._fsp--;

			pushFollow(FOLLOW_compare_in_condition1550);
			comp=compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_condition1554);
			exp2=expression(ValueTypes.ANYVALUE_STR);
			state._fsp--;

			bool = env.compareEvaluator(comp,exp1,exp2);
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:180:7: (op= operator exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR] )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==AMP||LA42_0==OR) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:180:8: op= operator exp1= expression[ValueTypes.ANYVALUE_STR] comp= compare exp2= expression[ValueTypes.ANYVALUE_STR]
					{
					pushFollow(FOLLOW_operator_in_condition1569);
					op=operator();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_condition1573);
					exp1=expression(ValueTypes.ANYVALUE_STR);
					state._fsp--;

					pushFollow(FOLLOW_compare_in_condition1578);
					comp=compare();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_condition1582);
					exp2=expression(ValueTypes.ANYVALUE_STR);
					state._fsp--;

					 bool = env.compareEvaluatorSeries(bool, op, env.compareEvaluator(comp,exp1,exp2));
					}
					break;

				default :
					break loop42;
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
		return bool;
	}
	// $ANTLR end "condition"



	// $ANTLR start "increment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:183:1: increment : name= WORD assignment ;
	public final void increment() throws RecognitionException {
		Token name=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:183:12: (name= WORD assignment )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:183:14: name= WORD assignment
			{
			name=(Token)match(input,WORD,FOLLOW_WORD_in_increment1607); 
			env.var_name = name;
			pushFollow(FOLLOW_assignment_in_increment1611);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:186:1: compare returns [Token tk] : comp= ( EQ | NEQ | LT | GT | LE | GE ) ;
	public final Token compare() throws RecognitionException {
		Token tk = null;


		Token comp=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:187:5: (comp= ( EQ | NEQ | LT | GT | LE | GE ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:187:6: comp= ( EQ | NEQ | LT | GT | LE | GE )
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



	// $ANTLR start "operator"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:196:1: operator returns [Token tk] : (op= AMP AMP |op= OR OR ) ;
	public final Token operator() throws RecognitionException {
		Token tk = null;


		Token op=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:197:5: ( (op= AMP AMP |op= OR OR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:198:5: (op= AMP AMP |op= OR OR )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:198:5: (op= AMP AMP |op= OR OR )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==AMP) ) {
				alt43=1;
			}
			else if ( (LA43_0==OR) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:198:7: op= AMP AMP
					{
					op=(Token)match(input,AMP,FOLLOW_AMP_in_operator1725); 
					match(input,AMP,FOLLOW_AMP_in_operator1727); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:199:7: op= OR OR
					{
					op=(Token)match(input,OR,FOLLOW_OR_in_operator1737); 
					match(input,OR,FOLLOW_OR_in_operator1739); 
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
		return tk;
	}
	// $ANTLR end "operator"



	// $ANTLR start "stringquote"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:203:1: stringquote : D_QUOTE (~ ( D_QUOTE ) )* D_QUOTE ;
	public final void stringquote() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:203:14: ( D_QUOTE (~ ( D_QUOTE ) )* D_QUOTE )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:203:16: D_QUOTE (~ ( D_QUOTE ) )* D_QUOTE
			{
			match(input,D_QUOTE,FOLLOW_D_QUOTE_in_stringquote1763); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:203:24: (~ ( D_QUOTE ) )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( ((LA44_0 >= ADD && LA44_0 <= DOT)||(LA44_0 >= ELSE && LA44_0 <= WS)) ) {
					alt44=1;
				}

				switch (alt44) {
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
					break loop44;
				}
			}

			match(input,D_QUOTE,FOLLOW_D_QUOTE_in_stringquote1771); 
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
	// $ANTLR end "stringquote"

	// Delegated rules



	public static final BitSet FOLLOW_include_in_start67 = new BitSet(new long[]{0x00A0001074000000L});
	public static final BitSet FOLLOW_global_in_start70 = new BitSet(new long[]{0x00A0001070000000L});
	public static final BitSet FOLLOW_EOF_in_start75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include92 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LT_in_include94 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_include96 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_DOT_in_include99 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_include101 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_GT_in_include105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_void_in_global124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_global137 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_pointer_in_global144 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_global167 = new BitSet(new long[]{0x0001201480008890L});
	public static final BitSet FOLLOW_ass_multiple_in_global173 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_vector_in_global197 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_params_in_global219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_funct_void241 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_funct_void247 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_funct_params_in_funct_void251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_funct_params270 = new BitSet(new long[]{0x0000100070000000L});
	public static final BitSet FOLLOW_type_name_in_funct_params277 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_funct_params281 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_COMMA_in_funct_params286 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_type_name_in_funct_params290 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_funct_params294 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RPAREN_in_funct_params302 = new BitSet(new long[]{0x0000200100000000L});
	public static final BitSet FOLLOW_codeblock_in_funct_params306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_assignment332 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_assignment334 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_SUB_in_assignment340 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_assignment342 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_MULT_in_assignment348 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_assignment350 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_DIV_in_assignment356 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_assignment358 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_ASS_in_assignment364 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_assignment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_ass_multiple386 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_ass_multiple390 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_ass_multiple394 = new BitSet(new long[]{0x0001001000008892L});
	public static final BitSet FOLLOW_assignment_in_ass_multiple398 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASS_in_ass_vector429 = new BitSet(new long[]{0x0080001508100420L});
	public static final BitSet FOLLOW_LCURL_in_ass_vector433 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_ass_vector437 = new BitSet(new long[]{0x0000040000000800L});
	public static final BitSet FOLLOW_COMMA_in_ass_vector443 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_ass_vector447 = new BitSet(new long[]{0x0000040000000800L});
	public static final BitSet FOLLOW_RCURL_in_ass_vector454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_ass_vector471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector495 = new BitSet(new long[]{0x0000020008000000L});
	public static final BitSet FOLLOW_INT_in_vector502 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector508 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ass_vector_in_vector514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_pointer535 = new BitSet(new long[]{0x0080000400000000L});
	public static final BitSet FOLLOW_WORD_in_pointer540 = new BitSet(new long[]{0x0001001000008092L});
	public static final BitSet FOLLOW_LPAREN_in_pointer546 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_pointer548 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_pointer551 = new BitSet(new long[]{0x0001001000008092L});
	public static final BitSet FOLLOW_assignment_in_pointer554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function575 = new BitSet(new long[]{0x0080101000020000L});
	public static final BitSet FOLLOW_call_args_in_call_function578 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_COMMA_in_call_function581 = new BitSet(new long[]{0x0080001000020000L});
	public static final BitSet FOLLOW_call_args_in_call_function583 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RPAREN_in_call_function589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringquote_in_call_args603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_call_args611 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_call_args613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_call_args621 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_LBRACK_in_call_args625 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_INT_in_call_args627 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACK_in_call_args629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_call_args635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock663 = new BitSet(new long[]{0x00C02C1172200000L});
	public static final BitSet FOLLOW_statement_in_codeblock665 = new BitSet(new long[]{0x00C02C1172200000L});
	public static final BitSet FOLLOW_RCURL_in_codeblock668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_in_statement699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_statement707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStat_in_statement739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_local759 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_pointer_in_local766 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_WORD_in_local813 = new BitSet(new long[]{0x0001201480008890L});
	public static final BitSet FOLLOW_ass_multiple_in_local818 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_vector_in_local869 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_call_function_in_local918 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_local922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat943 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat945 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_condition_in_ifStat949 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat951 = new BitSet(new long[]{0x0000200100000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat953 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat956 = new BitSet(new long[]{0x00C0281172200000L});
	public static final BitSet FOLLOW_statement_in_ifStat958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat980 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat982 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_condition_in_whileStat986 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat988 = new BitSet(new long[]{0x00C0281172200000L});
	public static final BitSet FOLLOW_statement_in_whileStat990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat1009 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat1011 = new BitSet(new long[]{0x0080000070000000L});
	public static final BitSet FOLLOW_initialization_in_forStat1013 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat1015 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_condition_in_forStat1019 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat1021 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_increment_in_forStat1023 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat1025 = new BitSet(new long[]{0x00C0281172200000L});
	public static final BitSet FOLLOW_statement_in_forStat1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStat1044 = new BitSet(new long[]{0x0080201408100420L});
	public static final BitSet FOLLOW_atom_exp_in_returnStat1051 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_returnStat1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_type_name1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_type_name1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CHAR_in_type_name1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression1137 = new BitSet(new long[]{0x0001000000000012L});
	public static final BitSet FOLLOW_ADD_in_expression1146 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_multiply_exp_in_expression1150 = new BitSet(new long[]{0x0001000000000012L});
	public static final BitSet FOLLOW_SUB_in_expression1179 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_multiply_exp_in_expression1183 = new BitSet(new long[]{0x0001000000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp1242 = new BitSet(new long[]{0x0000001000008002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp1251 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp1255 = new BitSet(new long[]{0x0000001000008002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp1281 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp1285 = new BitSet(new long[]{0x0000001000008002L});
	public static final BitSet FOLLOW_INT_in_atom_exp1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_atom_exp1382 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp1386 = new BitSet(new long[]{0x0000020008000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp1393 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_atom_exp1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_atom_exp1442 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_atom_exp1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_atom_exp1457 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_atom_exp1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp1477 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_atom_exp1481 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_initialization1508 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_initialization1516 = new BitSet(new long[]{0x0001001000008092L});
	public static final BitSet FOLLOW_assignment_in_initialization1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_condition1545 = new BitSet(new long[]{0x0000002A00C80000L});
	public static final BitSet FOLLOW_compare_in_condition1550 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_condition1554 = new BitSet(new long[]{0x0000008000000022L});
	public static final BitSet FOLLOW_operator_in_condition1569 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_condition1573 = new BitSet(new long[]{0x0000002A00C80000L});
	public static final BitSet FOLLOW_compare_in_condition1578 = new BitSet(new long[]{0x0080001408100420L});
	public static final BitSet FOLLOW_expression_in_condition1582 = new BitSet(new long[]{0x0000008000000022L});
	public static final BitSet FOLLOW_WORD_in_increment1607 = new BitSet(new long[]{0x0001001000008090L});
	public static final BitSet FOLLOW_assignment_in_increment1611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_compare1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMP_in_operator1725 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AMP_in_operator1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_operator1737 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_OR_in_operator1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_D_QUOTE_in_stringquote1763 = new BitSet(new long[]{0x01FFFFFFFFFFFFF0L});
	public static final BitSet FOLLOW_D_QUOTE_in_stringquote1771 = new BitSet(new long[]{0x0000000000000002L});
}
