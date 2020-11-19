grammar AssignmentCompiler;

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
	: assignement+
	;

assignement
	: ID EQ expression SC
	;
	
expression
	: atom (x=OP {System.out.println("Ho trovato questa operazione: \t" + $x.getText());} atom)* ;
	
atom
	: 	( INT
		| FLOAT
		| ID
		| LP expression RP
		)
	;

// Qui inizia la specifica del lexer
EQ 	:	':=' ;

OP
	: '+' | '-' | '*' | '/' ;
	
LP
	: '(' ;

RP
	: ')' ;
	
SC
	: ';' ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

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