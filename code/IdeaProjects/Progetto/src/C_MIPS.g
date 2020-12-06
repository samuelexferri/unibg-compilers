grammar C_MIPS;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	//package myCompiler;
}

@lexer::members {
	int nErrori = 0;
	
	void printMsg () {
		nErrori++;
		System.out.println("Numero errori Trovati: \t" + nErrori);
	}
}

@header {
	//package myCompiler;
}

@members {
	// int test;
}

/*
*	START
*/

start			: INCLUDE? (type_name identifier (global_var | function)) | (VOID identifier function)* EOF
				;

/*
*	PARSER RULES
*/

global_var		: (EQ type_value)? SEMICOL
				;
				
function		: LPAREN (type_name identifier (COMMA type_name identifier)*)? RPAREN codeblock
				;
				
codeblock       : LCURL statement* RCURL // First block
				| SEMICOL
				;
				
statement		: LCURL statement* RCURL // Another block
				| RETURN assignment SEMICOL // Return
				| assignment SEMICOL // Assignment
				| SEMICOL // Semicolon
				; 
				
assignment		: type_name? identifier (MIN | PLUS | MULT | DIV)? EQ type_value
				;

type_name		: (K_INT | K_FLOAT| K_CHAR)
				; 
				
identifier		: WORD 
				;

type_value		: (INT | FLOAT)
				;

// comment   		: S_L_COMMENT | M_L_COMMENT ;

/*
*	LEXER RULES
*/

INCLUDE			: '#include <stdio.h>' | '#include <stdlib.h>';

fragment DIGIT	: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR: '_' ;
fragment SPACE	: ' ' ;
fragment TAB	: '\t';
fragment NEWL   : '\n';
fragment SLASHR : '\r';

WS 				: (SPACE | TAB | NEWL | SLASHR)* {$channel=HIDDEN;};

K_INT			: 'int' ;
K_FLOAT			: 'float' ;
K_CHAR			: 'char' ;

VOID 			: 'void' ;
WHILE 	 		: 'while' ;
FOR 			: 'for' ;
IF 				: 'if' ;
ELSE 			: 'else' ;
RETURN 			: 'return' ;
EQ 				: '==' ;
NEQ				: '!=' ;
GT 				: '>' ;
LT 				: '<' ;
GE				: '>=' ;
LE 				: '<=' ;
PLUS 			: '+' ;
MIN 			: '-' ;
MULT 			: '*' ;
DIV 			: '/' ;
ASS 			: '=' ;
LPAREN    		: '(' ;
RPAREN 			: ')' ;
LBRACK 			: '[' ;
RBRACK   		: ']' ;
LCURL 			: '{' ;
RCURL 			: '}' ;
SEMICOL			: ';' ;
ARROW 			: '->' ;
S_QUOTE 		: '\'' ;
D_QUOTE 		: '"' ;
COMMA			: ',' ;
AMP      		: '&' ;

INT				: DIGIT_NO_ZERO DIGIT* ;
FLOAT			: DIGIT+ COMMA DIGIT+ ;

//SP_CHAR 		: '%' | '?' | '!' | '@' | '#' | '$' | '*' | '/' | '+' | '-' | '^' | '&' | '(' | ')' | '<' | '>' | '\\' ;
WORD 			: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)* ;

//S_L_COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;} ;
//M_L_COMMENT		: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

TOKEN_ERROR		: . {printMsg();} ;