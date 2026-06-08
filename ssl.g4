grammar ssl;

//Reglas del parser

prog 
: instruccion+EOF
;

instruccion 
: decision
;

decision 
: SI condicion ENTONCES 
	LLAVE_AP sentencia* LLAVE_CI
	( SINO LLAVE_AP sentencia* LLAVE_CI )?
 ;

sentencia 
: salida+ 
| terminar 
;

salida 
: IMPRIMIR PARENT_AP cadena PARENT_CI PUNTO_COMA
;

terminar 
:  SALIR PUNTO_COMA
;

condicion 
: VERDADERO
| FALSO
;
cadena 
	: CADENA_LIT
	;

//Tokens - Lexer
// Palabras clave
SI : 'si' ;
ENTONCES : 'entonces' ;
SINO : 'sino' ; 
IMPRIMIR : 'imprimir' ;
SALIR : 'salir' ;
VERDADERO : 'verdadero' ; 
FALSO : 'falso' ;

// Delimitadores
LLAVE_AP : '{' ;
LLAVE_CI : '}' ;
PARENT_AP : '(' ;
PARENT_CI : ')' ;
PUNTO_COMA : ';' ;

//Literal de cadena
CADENA_LIT : '"' [a-zA-Z0-9.,!?:; ]* '"' ;

// Ignorar espacios y saltos de línea
WS : [ \t\r\n]+ -> skip ;
