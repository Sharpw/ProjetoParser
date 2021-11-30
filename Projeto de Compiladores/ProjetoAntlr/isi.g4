grammar isi;

//import das pastas
@header{
	import language.datastructures.isiSymbol;
	import language.datastructures.isiSymbolTable;
	import language.datastructures.isiVariable;
	import language.exceptions.isiSemanticException;
}

//declaração de metodos e atributos
@members{
	private int _type;
	private String _varName;
	private String _varValue;
	private isiSymbolTable symbolTable = new isiSymbolTable();
	private isiSymbol symbol;
	
	// função verifica se o ID existe na tabela
	public void verifyId(String id){
		if(!symbolTable.exists(id)){
			throw new isiSemanticException("SYMBOL "+_varName+" NAO DECLARADO");
		}
	}
	
	// cria um novo symbol, atribui e adiciona o token na tabela de symbols 
	public void createId(String id){
		_varValue = null;
		symbol = new isiVariable(_varName, _type, _varValue);
		if(!symbolTable.exists(_varName)){
			symbolTable.add(symbol);
		}else{
			throw new isiSemanticException("SYMBOL "+_varName+" JA DECLARADO");
		}
	}
}

program	: start 'main(){' decl block '}'
		;

start	: 'int' | 'void'
		;

decl	: (declareVar)+
		;
// chama a função createId();  linha = type ID (CM ID)* SC
declareVar : declareNum
		   | declareChar
		   | cmd
		   ;
		   
declareNum : number ID { createId(_varName = _input.LT(-1).getText());}
			 (CM ID { createId(_varName = _input.LT(-1).getText());}
			 )* SC
		   ;

declareChar : 'char' { _type = isiVariable.STRING;   } 
			   ID { createId(_varName = _input.LT(-1).getText());}
			   ACO NUMBER FCO SC
			;
		   
number	: 'int' | 'float' | 'double'
		;

block	: (cmd)+
		;

cmd		: cmdRead
		| cmdWrite
		| cmdAtt
		| cmdCond
		| cmdBool
		| cmdFor
		| cmdWhile
		| cmdRet
		| cmdMM
		| cmdLL
		| cmdChar
		| cmdComm
		| cmdFunc
		;

cmdComm : ACOM (ID)* FCOM
		;

cmdRead : 'scanf' AP ID { verifyId(_varName = _input.LT(-1).getText());} 
				 FP SC
		;
		
cmdWrite : 'printf' AP (ID { verifyId(_varName = _input.LT(-1).getText());}
					  | NUMBER
						)
				   FP SC
		 ;

cmdAtt  : ID { verifyId(_varName = _input.LT(-1).getText());} 
		  ATT expr SC
		;
		
cmdCond : 'if' AP ID { verifyId(_varName = _input.LT(-1).getText());} 
			OPR (ID { verifyId(_varName = _input.LT(-1).getText());} 
				| NUMBER) FP AC (cmd)+ FC
		  	('else' AC (cmd)+ FC)? SC
		;
		
cmdBool : 'bool' ID { verifyId(_varName = _input.LT(-1).getText());}
				ATT (TRUE | FALSE) SC
		;
		
cmdFor	: 'for' AP (ID { verifyId(_varName = _input.LT(-1).getText());}
			| number ID { createId(_varName = _input.LT(-1).getText());}
			) ATT NUMBER SC ID { verifyId(_varName = _input.LT(-1).getText());}
			 OPR (ID{ verifyId(_varName = _input.LT(-1).getText());}
			 	| NUMBER
			 ) SC ID { verifyId(_varName = _input.LT(-1).getText());}
			  (OPM | OPL) FP AC (cmd)+ FC (cmdRet | SC)
		;
		
cmdWhile : 'while' AP ID { verifyId(_varName = _input.LT(-1).getText()); }
				   OPR (ID { verifyId(_varName = _input.LT(-1).getText());}
				   		| NUMBER) FP AC (cmd)+ FC (cmdRet | SC)
		 ;
		 
cmdRet	: 'return' (ID { verifyId(_varName = _input.LT(-1).getText()); }
					| NUMBER) SC
		;
		
cmdMM	: ID OPM SC
		;
		
cmdLL	: ID OPL SC
		;

cmdChar : ID { verifyId(_varName = _input.LT(-1).getText()); }
		  ATT AS ID AS SC
		;
			
cmdFunc : number ID { createId(_varName = _input.LT(-1).getText());}
			AP ((ID{ verifyId(_varName = _input.LT(-1).getText());} 
				|CM ID { verifyId(_varName = _input.LT(-1).getText());} 
			)+)? FP AC cmd FC SC
		;



expr	: term (OP term)*
		;

term	: ID { verifyId(_varName = _input.LT(-1).getText());} 
		| NUMBER
		;
		
AP	: '('
	;

FP	: ')'
	;
	
AC	: '{'
	;

FC	: '}'
	;
	
ACO : '['
	;

FCO : ']'
	;

ATT : '='
	;

SC	: ';'
	;
	
CM  : ','
	;

OP	: '+' | '-' | '*' | '/'
	;

OPM : '++'
	;
	
OPL : '--'
	;

OPR : '>' | '<' | '>=' | '<=' | '==' | '!='
	;
	
OA  : '&&' | 'OR'
	;

ACOM : '/*'
	 ;
	  
FCOM : '*/'
	 ;

AS  : '\u0027'
	;
	
TRUE  : 'true'
	  ;
	 
FALSE : 'false'
	  ;

ID	: [a-z] ([a-zA-Z] | [0-9])*
	;

NUMBER : [0-9]+ ('.'[0-9]+)?
	   ;
	   
//TEXTO : ([a-z] | [A-Z] | [0-9] | ' ')+
//	  ;
	   
BLANK : (' ' | '\t' | '\n' | '\r') -> skip;


//CHARAC : ([a-z] | [A-Z] | [0-9]) ([a-zA-Z] | [0-9])*
//		 ;

