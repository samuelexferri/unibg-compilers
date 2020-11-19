grammar OpenWeatherMapAPI;

options {
	language = Java;
}

@lexer::header {
	//package myCompiler;
}

@lexer::members {
	int prova1;
}

@header {
	//package myCompiler;
}

@members {
	int prova2;
}

// Qui inizia la specifica del parser
myStartExample
	: mainblock
	;

mainblock
	: GO (block)* GC ;
	
block
	: stringa DUEP sublock VIRG*; // TODO: L'ultimo blocco non ha la virgola (sia quelli grossi che innestati)
	
stringa
	: VIRGUP NAME VIRGUP;

sublock
	: INT | FLOAT | stringa | (GO (block)+ GC) ;
	
/*
expression
	: atom (x=OP {System.out.println("Ho trovato questa operazione: \t" + $x.getText());} atom)* ;


atom
	: 	( INT
		| FLOAT
		| ID
		| LP expression RP
		)
	;
*/

// Qui inizia la specifica del lexer
GO	: '{' ;

GC	: '}' ;

VIRG	: ',' ;

VIRGUP	: '"' ;

DUEP	:	':' ;

NAME  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')* ; // TODO: Possono essere solo da una lista

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

ERROR_TOKEN
	: . {$channel=HIDDEN;}
	;