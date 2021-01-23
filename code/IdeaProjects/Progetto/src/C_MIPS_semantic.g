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
}



// PARSER
start			: include* global* tk=EOF {env.checkMain(tk);}
				;

include			: INCLUDE LT WORD (DOT WORD)? GT
				;
				
global			: funct_void
				| {env.var_type = ValueTypes.UNDEFINED_STR; env.funct_type = ValueTypes.UNDEFINED_STR; env.is_local = false;} (type=type_name {env.var_type = type.getText();})? (pointer SEMICOL 
				     		 		| name=WORD (({env.var_name = $name; env.addNewVariable(env.var_type, $name, false);} ass_multiple
				     		 		 			| {env.var_name = $name;} vector) SEMICOL
									 			| {env.var_name = $name; env.funct_name = $name; env.funct_type = type.getText(); env.addFunction(env.var_type, $name); env.tra.traAddNewFunction();} funct_params))
				;
				
funct_void		: type=VOID {env.var_type = type.getText();} name=WORD {env.is_local = true; env.var_name = $name; env.funct_name = $name; env.addFunction(env.var_type, $name); env.tra.traAddNewFunction(); } funct_params {env.tra.traReturnVoid();}
				;
				
funct_params 	: LPAREN {env.is_local = true; env.var_type = ValueTypes.UNDEFINED_STR;} (type=type_name name=WORD {env.var_type = type.getText(); env.var_name = $name; env.addNewVariable(env.var_type, $name, true);} (COMMA type=type_name name=WORD {env.var_type = type.getText(); env.var_name = $name; env.addNewVariable(env.var_type, $name, true);})*)? RPAREN isBlock=codeblock {env.is_local = false; env.clearSymbolTableLocal(isBlock);}
				; 
				
assignment		: {env.var_type = env.getVarType(env.var_name); Token var_temp = env.var_name;}((eq=ADD ASS | eq=SUB ASS | eq=MULT ASS | eq=DIV ASS | eq=ASS) {env.tra.traAssignmentBefore(eq);} exp=expression[env.var_type] {env.assignValue(var_temp, exp, eq); env.tra.traAssignmentAfter(exp);})
				;

ass_multiple	: assignment? (COMMA name=WORD {env.var_name = $name; env.addNewVariable(env.var_type, $name, false);} assignment?)* // Assegnamento multiplo: int a, b=2, c...
				;
							
ass_vector		[String vect_type]
				: ASS ((LCURL e1=expression[vect_type] {env.createVector(e1);} (COMMA e2=expression[vect_type] {env.addValueVector(e2);})* RCURL) {env.insertVectorST();} 
					  | exp=expression[vect_type] {env.assignVectorValue(env.var_name, env.vect_size, exp);})
				;
				
vector 			: LBRACK {env.vect_size = "0";} (size=INT {env.vect_size = $size.getText();})? RBRACK {env.addNewVector(env.var_type, env.var_name, env.vect_size);} {env.var_type = env.getVarType(env.var_name);} ass_vector[env.var_type]?
				;
				
pointer			: MULT (name=WORD {env.var_name = $name; env.addNewVector(env.var_type, env.var_name, "100") /* Per i puntatori size=100 fittizia */;} | LPAREN expression[ValueTypes.INT_STR] RPAREN) assignment? // Puntatori: *p o *(p+1)
				;
					
call_function 	: LPAREN (call_args (COMMA call_args)*)? RPAREN
				;

call_args		: stringquote
				| MULT WORD
				| WORD ((LBRACK INT RBRACK)? | call_function)
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
													     		 												  					 | name=WORD ({env.var_name = $name; env.addNewVariable(env.var_type, $name, false);} ass_multiple
																									     		 		 	  					 | {env.var_name = $name;} vector 
																														      					 | {env.var_name = $name; env.checkCallFunction(env.var_type, $name);} call_function)) SEMICOL
				;

returnStat		: tk=RETURN {env.var_type = "void";} (value=atom_exp[env.funct_type] {env.var_type = value.type;})? {env.checkFunctionReturnType(tk, value, env.var_type, env.funct_type); env.tra.traReturn(value);} SEMICOL 
				;

type_name		returns [Token token]
				: (tk=K_INT
				| tk=K_FLOAT 
				| tk=K_CHAR) {token = tk;}
				;

expression 		[String type] returns [Value value]
				: v1=multiply_exp[type] {if(v1==null) {v1 = new Value(type, null, false);} env.baddorsub = false; env.bmulordiv1 = env.bmulordiv;} 
										( op=ADD v2=multiply_exp[type] {if(v2==null) {v2 = new Value(type, null, false);} env.bmulordiv2 = env.bmulordiv;} {env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv1 || env.baddorsub); env.tra.traSetValueConst(new Value(type, v2.value, false), env.bmulordiv2); v1 = env.doAdd($op, v1, v2); env.baddorsub = true;} 
										| op=SUB v2=multiply_exp[type] {if(v2==null) {v2 = new Value(type, null, false);} env.bmulordiv2 = env.bmulordiv;} {env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv1 || env.baddorsub); env.tra.traSetValueConst(new Value(type, v2.value, false), env.bmulordiv2); v1 = env.doSub($op, v1, v2); env.baddorsub = true;} )* 
										{value = v1; env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv1 || env.baddorsub);}
    			;
    
multiply_exp 	[String type] returns [Value value]
				: {env.bmulordiv = false;} v1=atom_exp[type] {if(v1==null) {v1 = new Value(type, null, false);}} 
									( op=MULT v2=atom_exp[type] {env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv); env.tra.traSetValueConst(new Value(type, v2.value, false), false); v1 = env.doMul($op, v1, v2); env.bmulordiv = true;} 
									| op=DIV v2=atom_exp[type] {env.tra.traSetValueConst(new Value(type, v1.value, false), env.bmulordiv); env.tra.traSetValueConst(new Value(type, v2.value, false), false); v1 = env.doDiv($op, v1, v2); env.bmulordiv = true;} )*
									{value = v1;}
    			;
    			
atom_exp 		[String type] returns [Value value]
				: tk=INT {value = env.setValue($tk, ValueTypes.INT_STR, type);}
				| tk=FLOAT {value = env.setValue($tk, ValueTypes.FLOAT_STR, type);}
				| tk=CHAR_QUOTE {value = env.setValue($tk, ValueTypes.CHAR_STR, type);}
				| name=WORD ((LBRACK {env.vect_pos = "0";} (pos=INT {env.vect_pos = $pos.getText();})? RBRACK) {value = env.getVectorValue($name, type, env.vect_pos);}
					   		| call_function {env.var_name = $name; env.var_type = env.getVarType($name); env.checkCallFunctionReturnType(name, env.var_type, type); value = env.setValueCallFunction($name, env.var_type, type);}
					   		| {value = env.getDeclaredValue($name, type); env.tra.traSetValueVar(name); env.bmulordiv = true;}) // Variabile o Vettore
				| MULT name=WORD {value = env.getDeclaredValue($name, type);} // Puntatore
				| AMP {env.is_amp_punct = true;} name=WORD {value = env.getDeclaredValue($name, type);} // Indirizzo (da estrarre)
    			| LPAREN v=expression[type] {{ value = v;}} RPAREN // Parentesi
    			;
    			
ifStat			: IF LPAREN {env.tra.traIfStart(); env.stat = 1;} bool=condition[env.stat] RPAREN codeblock {env.tra.traElseStart();} (ELSE statement)? {env.tra.traIfEnd();}
				;
						
whileStat		: WHILE LPAREN {env.tra.traWhileStart(); env.stat = 2;} bool=condition[env.stat] RPAREN statement {env.tra.traWhileEnd();}
				;
				
forStat			: FOR LPAREN {env.tra.traForStart();} initialization SEMICOL {env.stat = 3;} bool=condition[env.stat] SEMICOL {env.tra.traIncrStart();} increment {env.tra.traIncrEnd();} RPAREN statement {env.tra.traForEnd();}
				;

initialization	: {env.var_type = ValueTypes.UNDEFINED_STR;} (type=type_name {env.var_type = type.getText();})? name=WORD {env.var_name = $name; env.addNewVariable(env.var_type, $name, false);} assignment?
				;

condition		[Integer stat] returns [Boolean bool = false]
				: exp1=expression[ValueTypes.ANYVALUE_STR] comp=compare exp2=expression[ValueTypes.ANYVALUE_STR] {env.tra.traCompare(exp1,exp2,comp,stat); bool = env.compareEvaluator(comp,exp1,exp2);} 
				  (op=operator exp1=expression[ValueTypes.ANYVALUE_STR] comp=compare exp2=expression[ValueTypes.ANYVALUE_STR] { bool = env.compareEvaluatorSeries(bool, op, env.compareEvaluator(comp,exp1,exp2));})*
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
				
operator		returns [Token tk]
				:
				( op=AMP AMP
				| op=OR OR
				)
				;
				
stringquote		: D_QUOTE ~(D_QUOTE)* D_QUOTE
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

BACKSLASH 	: '\\';

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
ARROW 		: '->' ;
S_QUOTE 	: '\'' ;
D_QUOTE 	: '"' ;
COMMA		: ',' ;
AMP      	: '&' ;
PERC		: '%' ;
HASHTAG		: '#' ;
OR			: '|' ;

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