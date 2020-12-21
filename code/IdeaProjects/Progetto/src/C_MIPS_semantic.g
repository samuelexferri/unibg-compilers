grammar C_MIPS_semantic;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	// package myCompiler;
}

@lexer::members {
	int nErrori = 0;
	
	void printMsg() {
		nErrori++;
		System.out.println("\n*********************************************\n" + "*****\tLexing completato con " + nErrori + " errori\t*****" + "\n*********************************************");
	}
}

@header {
	// package myCompiler;

    import util.*;
    import java.util.Hashtable;
    import java.io.FileWriter;
}

@members {
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
}



// PARSER
start			: include* global* tk=EOF {env.checkMain(tk);}
				;

include			: INCLUDE LT WORD (DOT WORD)? GT
				;
				
global			: funct_void
				| {env.var_type = ValueTypes.UNDEFINED_STR; env.funct_type = ValueTypes.UNDEFINED_STR; env.is_local = false;} (type=type_name {env.var_type = type.getText();})? (pointer SEMICOL 
				     		 		| name=WORD (({env.var_name = $name; env.addNewVariable(env.var_type, $name);} ass_multiple
				     		 		 			| {env.var_name = $name;} vector) SEMICOL
									 			| {env.var_name = $name; env.funct_name = $name; env.funct_type = type.getText(); env.addFunction(env.var_type, $name);} funct_params))
				;
				
funct_void		: type=VOID {env.var_type = type.getText();} name=WORD {env.is_local = true; env.var_name = $name; env.funct_name = $name; env.addFunction(env.var_type, $name);} funct_params 
				;
				
funct_params 	: LPAREN {env.is_local = true; env.var_type = ValueTypes.UNDEFINED_STR;} (type=type_name name=WORD {env.var_type = type.getText(); env.var_name = $name; env.addNewVariable(env.var_type, $name);} (COMMA type=type_name name=WORD {env.var_type = type.getText(); env.var_name = $name; env.addNewVariable(env.var_type, $name);})*)? RPAREN isBlock=codeblock {env.is_local = false; env.clearSymbolTableLocal(isBlock);}
				; 
				
assignment		: {env.var_type = env.getVarType(env.var_name); Token var_temp = env.var_name;}((ADD | SUB | MULT | DIV)? eq=ASS exp=expression[env.var_type]  {env.assignValue(var_temp, exp, eq);})
				;

ass_multiple	: assignment? (COMMA name=WORD {env.var_name = $name; env.addNewVariable(env.var_type, $name);} assignment?)* // Assegnamento multiplo: int a, b=2, c...
				;
							
ass_vector		[String vect_type]
				: ASS ((LCURL e1=expression[vect_type] {env.createVector(e1);} (COMMA e2=expression[vect_type] {env.addValueVector(e2);})* RCURL) {env.insertVectorST();} 
				| expression[vect_type])
				;
				
vector 			: LBRACK {env.vect_size = "0";} (size=INT {env.vect_size = $size.getText();})? RBRACK {env.addNewVector(env.var_type, env.var_name, env.vect_size);} ass_vector[env.var_type]?
				;
				
pointer			: MULT (name=WORD {env.var_name = $name; env.addNewVector(env.var_type, env.var_name, "100") /* Per i puntatori size=100 fittizia */;} | LPAREN expression[ValueTypes.INT_STR] RPAREN) assignment? // Puntatori: *p o *(p+1)
				;
					
call_function 	: LPAREN (call_args (COMMA call_args)*)? RPAREN
				;

call_args		: anything
				| MULT? WORD
				;
				
codeblock 		returns [Boolean isBlock = false]
				: LCURL statement* RCURL {isBlock = true;}
	    		| SEMICOL {isBlock = false;} // SEMICOL di function	
				;

statement 		: local
				| codeblock
				| ifStat
				| whileStat
				| forStat
				| returnStat
				;

local			: {env.var_type = ValueTypes.UNDEFINED_STR; env.is_local = true;} (type=type_name {env.var_type = type.getText();})? (pointer
													     		 												  | name=WORD ({env.var_name = $name; env.addNewVariable(env.var_type, $name);} ass_multiple
																									     		 		 	  						| {env.var_name = $name;} vector 
																														      						| {env.var_name = $name; env.var_type = env.getVarType($name); env.checkCallFunction(env.var_type, $name);} call_function)) SEMICOL
				;
			  	
ifStat			: IF LPAREN bool=condition RPAREN codeblock (ELSE statement)?
				;
						
whileStat		: WHILE LPAREN bool=condition RPAREN statement
				;
				
forStat			: FOR LPAREN initialization SEMICOL bool=condition SEMICOL increment RPAREN statement 
				;

returnStat		: RETURN {env.var_type = "void";} (value=atom_exp[env.funct_type] {env.var_type = value.type;})? {env.checkFunctionReturnType(env.var_type, env.funct_type);} SEMICOL 
				;

type_name		returns [Token token]
				: (tk=K_INT
				| tk=K_FLOAT 
				| tk=K_CHAR) {token = tk;}
				;

expression 		[String type] returns [Value value]
				: v1=multiply_exp[type] ( op=ADD v2=multiply_exp[type] {v1 = env.doAdd($op, v1, v2);} 
										| op=SUB v2=multiply_exp[type] {v1 = env.doSub($op, v1, v2);})* 
										{value = v1;}
    			;
    
multiply_exp 	[String type] returns [Value value]
				: v1=atom_exp[type] ( op=MULT v2=atom_exp[type] {v1 = env.doMul($op, v1, v2);} 
									| op=DIV v2=atom_exp[type] {v1 = env.doDiv($op, v1, v2);})* 
									{value = v1;}
    			;
    			
atom_exp 		[String type] returns [Value value]
				: tk=INT {value = env.setValue($tk, ValueTypes.INT_STR, type);}
				| tk=FLOAT {value = env.setValue($tk, ValueTypes.FLOAT_STR, type);}
				| tk=CHAR_QUOTE {value = env.setValue($tk, ValueTypes.CHAR_STR, type);}
				| name=WORD ((LBRACK pos=INT? RBRACK) {value = env.getVectorValue($name, type, $pos);}
					   | call_function {env.var_name = $name; env.var_type = env.getVarType($name); env.checkCallFunctionReturnType(env.var_type, type); value = env.setValueCallFunction($name, env.var_type, type);}
					   | {value = env.getDeclaredValue($name, type);}) // Variabile o Vettore
				| MULT name=WORD {value = env.getDeclaredValue($name, type);} // Puntatore
				| AMP {env.is_amp_punct = true;} name=WORD {value = env.getDeclaredValue($name, type);} // Indirizzo (da estrarre)
    			| LPAREN v=expression[type] {{ value = v;}} RPAREN// Parentesi
    			;

initialization	: type_name? name=WORD {env.var_name = $name;} assignment?
				;

condition		returns [Boolean bool = false]
				: exp1=expression[ValueTypes.ANYVALUE_STR] comp=compare exp2=expression[ValueTypes.ANYVALUE_STR] {bool = env.compareEvaluator(comp,exp1,exp2);}
				;
				
increment		: name=WORD {env.var_name = $name;} assignment
				;

compare			returns [Token tk]
				:comp=
				( EQ 
				| NEQ 
				| LT 
				| GT 
				| LE 
				| GE ) {tk = comp;}
				;
				
anything		: D_QUOTE ~(D_QUOTE)* D_QUOTE // Qualsiasi cosa all'interno delle doppie virgolette
				;



// LEXER
fragment DIGIT			: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR	: '_' ;
fragment SPACE		: ' ' ;
fragment TAB		: '\t';
fragment NEWL   	: '\n';
fragment SLASHR 	: '\r';
fragment CHAR 		: ('a'..'z' | 'A'..'Z') ;
fragment BACKSLASH 	: '\\';

WS 	: ( SPACE 
	| TAB 
	| NEWL 
	| SLASHR 
	){$channel=HIDDEN;}
	;

INCLUDE		: '#include';

K_INT		: 'int' ;
K_FLOAT		: 'float' ;
K_CHAR		: 'char' ;

VOID 		: 'void' ;
WHILE 	 	: 'while' ;
FOR 		: 'for' ;
IF 			: 'if' ;
ELSE 		: 'else' ;
RETURN 		: 'return' ;

EQ 			: '==' ;
NEQ			: '!=' ;
GT 			: '>' ;
LT 			: '<' ;
GE			: '>=' ;
LE 			: '<=' ;

ASS 		: '=' ;

ADD 		: '+' ;
SUB 		: '-' ;
MULT 		: '*' ;
DIV 		: '/' ;
LPAREN    	: '(' ;
RPAREN 		: ')' ;
LBRACK 		: '[' ;
RBRACK   	: ']' ;
LCURL 		: '{' ;
RCURL 		: '}' ;
SEMICOL		: ';' ;
DOT 		: '.' ; // Float
ARROW 		: '->' ; // TODO: Arrow
S_QUOTE 	: '\'' ;
D_QUOTE 	: '"' ;
COMMA		: ',' ;
AMP      	: '&' ;
PERC		: '%' ;
HASHTAG		: '#' ;

INT			: DIGIT_NO_ZERO DIGIT* 
			| '0' ;
FLOAT		: DIGIT+ DOT DIGIT+ ;
CHAR_QUOTE	: S_QUOTE (DIGIT 
					  | CHAR 
					  | BACKSLASH ('0' | 'n')) S_QUOTE ;

WORD 		: CHAR (CHAR | UNDRSCR | DIGIT)* ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;