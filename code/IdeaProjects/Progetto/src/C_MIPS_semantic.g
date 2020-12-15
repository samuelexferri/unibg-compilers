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
	
	void printMsg () {
		nErrori++;
		System.out.println("Numero errori Trovati: \t" + nErrori);
	}
}

@header {
	// package myCompiler;

    import util.*;
    import java.util.Hashtable;
}

@members {
	  ParserEnvironment env;
      ParserSemantic sem;

      void init () {
        System.out.println("Inizio l'analisi\n");
        env = new ParserEnvironment();
        sem = new ParserSemantic(env);
      }

      public String getTranslation () {
        return env.translation.toString();
      }

      public Hashtable<String, Object> getSymbolTable() {
        return env.symbolTable;
      }
      
      public Hashtable<String, Object> getSymbolTableLocal() {
        return sem.symbolTableLocal;
      }
}



// PARSER
start			: include* global* EOF
				;

include			: INCLUDE LT WORD (DOT WORD)? GT
				;
				
global			: {sem.is_global = true;} funct_void
				| {sem.is_global = true; sem.type_bool=false;} (type_name {sem.type_bool=true;})? ( pointer SEMICOL 
				     		 | var_name=WORD {sem.var_name = $var_name;} ((ass_multiple
				     		 		 | vector) SEMICOL
									 | funct_params))
				;
				
funct_void		: VOID WORD funct_params 
				;
				
funct_params 	: {sem.is_global = false;} LPAREN ({sem.clearParamsList();} type_name p=WORD {sem.addParamsList($p);} (COMMA type_name p=WORD {sem.addParamsList($p);})*)? RPAREN {sem.newFunction();} codeblock
				;
				
assignment		: ((ADD | SUB | MULT | DIV)? ASS exp=expression {sem.exp = $exp.value;})
				;

ass_multiple	: {sem.exp = null;} assignment? {sem.registerVar(sem.is_global, sem.var_name, sem.exp, sem.type_bool);} (COMMA var_name=WORD {sem.var_name = $var_name; sem.exp = null;} assignment? {sem.registerVar(sem.is_global, sem.var_name, sem.exp, sem.type_bool);})* // Assegnamento multiplo: int a, b=2, c...
				;
				
ass_vector		: ASS ((LCURL expression (COMMA expression)* RCURL) 
				| expression)
				;
				
vector 			: LBRACK INT? RBRACK ass_vector?
				;
				
pointer			: MULT (WORD | LPAREN expression RPAREN) assignment? // Puntatori: *p o *(p+1)
				;
					
call_function 	: LPAREN (call_args (COMMA call_args)*)? RPAREN
				;

call_args		: D_QUOTE anything* D_QUOTE
				| MULT? WORD
				;
				
codeblock 		: LCURL statement* RCURL 
	    		| SEMICOL // SEMICOL di function	
				;

statement 		: local
				| codeblock
				| ifStat
				| whileStat
				| forStat
				| returnStat
				;

local			: {sem.type_bool=false;} (type_name {sem.type_bool=true;})? ( pointer
				     		 | var_name=WORD {sem.var_name = $var_name;} (ass_multiple
				     		 		 | vector 
									 | call_function)) SEMICOL
				;
			  	
ifStat			: IF LPAREN condition RPAREN codeblock (ELSE statement)? // TODO: Codeblock, Operatori logici
				;
						
whileStat		: WHILE LPAREN condition RPAREN statement
				;
				
forStat			: FOR LPAREN initialization SEMICOL condition SEMICOL increment RPAREN statement 
				;

returnStat		: RETURN atom_exp SEMICOL 
				;

type_name		: K_INT 
				| K_FLOAT 
				| K_CHAR
				; 

expression 		returns [double value]
				: v1=multiply_exp {$value=$v1.value;} (ADD v2=multiply_exp {$value=sem.doAdd($value, $v2.value);} | SUB v2=multiply_exp {$value=sem.doSub($value, $v2.value);})*
    			;
    
multiply_exp 	returns [double value]
				: v1=atom_exp {$value=$v1.value;} (MULT v2=atom_exp {$value=sem.doMul($value, $v2.value);} | DIV v2=atom_exp {$value=sem.doDiv($value, $v2.value);})*
    			;

atom_exp 		returns [double value]
				: n=INT {$value = sem.getValue($n);}
				| n=FLOAT {$value = sem.getValue($n);}
				| CHAR_QUOTE {$value = 777;}
				| WORD ((LBRACK INT? RBRACK) | call_function)? {$value = 777;} // Variabile o Vettore
				| MULT WORD {$value = 777;} // Puntatore
				| AMP WORD {$value = 777;} // Indirizzo
    			| LPAREN expression RPAREN {$value = 777;} // Parentes
    			;

initialization	: type_name? WORD assignment?
				;

condition		: expression compare expression
				;
				
increment		: WORD assignment
				;

compare			: EQ 
				| NEQ 
				| LT 
				| GT 
				| LE 
				| GE
				;
				
anything		: INT 
				| FLOAT 
				| CHAR 
				| WORD 
				| IF 
				| WHILE 
				| FOR 
				| PERC 
				| SPACE 
				| ADD 
				| SUB 
				| MULT 
				| DIV 
				| AMP 
				| HASHTAG 
				| ASS 
				| WS
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
fragment SLASH 		: '\\';

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
					  | SLASH ('0' | 'n')) S_QUOTE ;

WORD 		: CHAR (CHAR | UNDRSCR | DIGIT)* ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;