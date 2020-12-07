grammar C_MIPS;

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
}

@members {
	// int test;
}



// TODO: Cicli, Puntatori
// PARSER
start			: INCLUDE? (VOID identifier function | type_name identifier ((((global_var_ass? (COMMA identifier global_var_ass?)*) | global_vector) SEMICOL) | function) | identifier LBRACK INT RBRACK global_var_ass SEMICOL)* EOF
				;

global_var_ass 	: ASS type_value
				;
				
global_vector 	: LBRACK INT? RBRACK (ASS ((LCURL type_value (COMMA type_value)* RCURL) | type_value))?
				;
				
vector 			: LBRACK INT? RBRACK (ASS ((LCURL type_value (COMMA type_value)* RCURL) | type_value))?
				;
					
function 		: LPAREN (type_name identifier (COMMA type_name identifier)*)? RPAREN codeblock
				;

call_function 	: LPAREN (identifier (COMMA  identifier)*)? RPAREN
				;
				
codeblock 		: LCURL (statement SEMICOL)* RCURL   
	    		| SEMICOL // SEMICOL		
				;
 
statement 		: type_name? identifier (assignment | call_function | vector)
			  	| RETURN value 
			  	;
	
assignment		: ((ADD | SUB | MULT | DIV)? ASS type_value)? // TODO: Oltre a type_value assegnare anche =vector[5]
				;

type_name		: (K_INT | K_FLOAT | K_CHAR)
				; 
				
identifier		: (WORD | CHAR)
				;

type_value		: expression
				;

expression 		: multiply_exp (ADD multiply_exp | SUB multiply_exp)* 
    			;
    
multiply_exp 	: atom_exp (MULT atom_exp | DIV atom_exp)*
    			;

atom_exp 		: INT
				| FLOAT  
				| CHAR_QUOTE
				| identifier (LBRACK INT RBRACK)? // Variable or Vector   
    			| LPAREN expression RPAREN
    			;

value 			: (INT | identifier)
				;



// LEXER

INCLUDE	: '#include <stdio.h>' | '#include <stdlib.h>';

fragment DIGIT	: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR: '_' ;
fragment SPACE	: ' ' ;
fragment TAB	: '\t';
fragment NEWL   : '\n';
fragment SLASHR : '\r';

WS 	: ( SPACE 
	| TAB 
	| NEWL 
	| SLASHR 
	){$channel=HIDDEN;}
	;

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

ADD 		: '+' ;
SUB 		: '-' ;
MULT 		: '*' ;
DIV 		: '/' ;
ASS 		: '=' ;
LPAREN    	: '(' ;
RPAREN 		: ')' ;
LBRACK 		: '[' ;
RBRACK   	: ']' ;
LCURL 		: '{' ;
RCURL 		: '}' ;
SEMICOL		: ';' ;
DOT 		: '.' ; // Float
ARROW 		: '->' ; // Arrow
S_QUOTE 	: '\'' ;
D_QUOTE 	: '"' ;
COMMA		: ',' ;
AMP      	: '&' ;

INT			: DIGIT_NO_ZERO DIGIT* | '0' ;
FLOAT		: DIGIT+ DOT DIGIT+ ;
CHAR 		: ('a'..'z' | 'A'..'Z') ;
CHAR_QUOTE	: S_QUOTE ('a'..'z' | 'A'..'Z') S_QUOTE ;

WORD 		: CHAR ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)+ ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;