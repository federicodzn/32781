// Generated from ssl.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import sslListener from './sslListener.js';
import sslVisitor from './sslVisitor.js';

const serializedATN = [4,1,14,69,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,1,0,4,0,18,8,0,11,0,12,0,19,1,0,1,0,1,1,1,1,1,2,
1,2,1,2,1,2,1,2,5,2,31,8,2,10,2,12,2,34,9,2,1,2,1,2,1,2,1,2,5,2,40,8,2,10,
2,12,2,43,9,2,1,2,3,2,46,8,2,1,3,4,3,49,8,3,11,3,12,3,50,1,3,3,3,54,8,3,
1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,6,1,6,1,7,1,7,1,7,0,0,8,0,2,4,6,8,
10,12,14,0,1,1,0,6,7,66,0,17,1,0,0,0,2,23,1,0,0,0,4,25,1,0,0,0,6,53,1,0,
0,0,8,55,1,0,0,0,10,61,1,0,0,0,12,64,1,0,0,0,14,66,1,0,0,0,16,18,3,2,1,0,
17,16,1,0,0,0,18,19,1,0,0,0,19,17,1,0,0,0,19,20,1,0,0,0,20,21,1,0,0,0,21,
22,5,0,0,1,22,1,1,0,0,0,23,24,3,4,2,0,24,3,1,0,0,0,25,26,5,1,0,0,26,27,3,
12,6,0,27,28,5,2,0,0,28,32,5,8,0,0,29,31,3,6,3,0,30,29,1,0,0,0,31,34,1,0,
0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,35,1,0,0,0,34,32,1,0,0,0,35,45,5,9,0,
0,36,37,5,3,0,0,37,41,5,8,0,0,38,40,3,6,3,0,39,38,1,0,0,0,40,43,1,0,0,0,
41,39,1,0,0,0,41,42,1,0,0,0,42,44,1,0,0,0,43,41,1,0,0,0,44,46,5,9,0,0,45,
36,1,0,0,0,45,46,1,0,0,0,46,5,1,0,0,0,47,49,3,8,4,0,48,47,1,0,0,0,49,50,
1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,54,1,0,0,0,52,54,3,10,5,0,53,48,1,
0,0,0,53,52,1,0,0,0,54,7,1,0,0,0,55,56,5,4,0,0,56,57,5,10,0,0,57,58,3,14,
7,0,58,59,5,11,0,0,59,60,5,12,0,0,60,9,1,0,0,0,61,62,5,5,0,0,62,63,5,12,
0,0,63,11,1,0,0,0,64,65,7,0,0,0,65,13,1,0,0,0,66,67,5,13,0,0,67,15,1,0,0,
0,6,19,32,41,45,50,53];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class sslParser extends antlr4.Parser {

    static grammarFileName = "ssl.g4";
    static literalNames = [ null, "'si'", "'entonces'", "'sino'", "'imprimir'", 
                            "'salir'", "'verdadero'", "'falso'", "'{'", 
                            "'}'", "'('", "')'", "';'" ];
    static symbolicNames = [ null, "SI", "ENTONCES", "SINO", "IMPRIMIR", 
                             "SALIR", "VERDADERO", "FALSO", "LLAVE_AP", 
                             "LLAVE_CI", "PARENT_AP", "PARENT_CI", "PUNTO_COMA", 
                             "CADENA_LIT", "WS" ];
    static ruleNames = [ "prog", "instruccion", "decision", "sentencia", 
                         "salida", "terminar", "condicion", "cadena" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = sslParser.ruleNames;
        this.literalNames = sslParser.literalNames;
        this.symbolicNames = sslParser.symbolicNames;
    }



	prog() {
	    let localctx = new ProgContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, sslParser.RULE_prog);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 17; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 16;
	            this.instruccion();
	            this.state = 19; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	        this.state = 21;
	        this.match(sslParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, sslParser.RULE_instruccion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 23;
	        this.decision();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	decision() {
	    let localctx = new DecisionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, sslParser.RULE_decision);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 25;
	        this.match(sslParser.SI);
	        this.state = 26;
	        this.condicion();
	        this.state = 27;
	        this.match(sslParser.ENTONCES);
	        this.state = 28;
	        this.match(sslParser.LLAVE_AP);
	        this.state = 32;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===4 || _la===5) {
	            this.state = 29;
	            this.sentencia();
	            this.state = 34;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 35;
	        this.match(sslParser.LLAVE_CI);
	        this.state = 45;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===3) {
	            this.state = 36;
	            this.match(sslParser.SINO);
	            this.state = 37;
	            this.match(sslParser.LLAVE_AP);
	            this.state = 41;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===4 || _la===5) {
	                this.state = 38;
	                this.sentencia();
	                this.state = 43;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 44;
	            this.match(sslParser.LLAVE_CI);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, sslParser.RULE_sentencia);
	    try {
	        this.state = 53;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 4:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 48; 
	            this._errHandler.sync(this);
	            var _alt = 1;
	            do {
	            	switch (_alt) {
	            	case 1:
	            		this.state = 47;
	            		this.salida();
	            		break;
	            	default:
	            		throw new antlr4.error.NoViableAltException(this);
	            	}
	            	this.state = 50; 
	            	this._errHandler.sync(this);
	            	_alt = this._interp.adaptivePredict(this._input,4, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            break;
	        case 5:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 52;
	            this.terminar();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, sslParser.RULE_salida);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 55;
	        this.match(sslParser.IMPRIMIR);
	        this.state = 56;
	        this.match(sslParser.PARENT_AP);
	        this.state = 57;
	        this.cadena();
	        this.state = 58;
	        this.match(sslParser.PARENT_CI);
	        this.state = 59;
	        this.match(sslParser.PUNTO_COMA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminar() {
	    let localctx = new TerminarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, sslParser.RULE_terminar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 61;
	        this.match(sslParser.SALIR);
	        this.state = 62;
	        this.match(sslParser.PUNTO_COMA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, sslParser.RULE_condicion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 64;
	        _la = this._input.LA(1);
	        if(!(_la===6 || _la===7)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	cadena() {
	    let localctx = new CadenaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, sslParser.RULE_cadena);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 66;
	        this.match(sslParser.CADENA_LIT);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

sslParser.EOF = antlr4.Token.EOF;
sslParser.SI = 1;
sslParser.ENTONCES = 2;
sslParser.SINO = 3;
sslParser.IMPRIMIR = 4;
sslParser.SALIR = 5;
sslParser.VERDADERO = 6;
sslParser.FALSO = 7;
sslParser.LLAVE_AP = 8;
sslParser.LLAVE_CI = 9;
sslParser.PARENT_AP = 10;
sslParser.PARENT_CI = 11;
sslParser.PUNTO_COMA = 12;
sslParser.CADENA_LIT = 13;
sslParser.WS = 14;

sslParser.RULE_prog = 0;
sslParser.RULE_instruccion = 1;
sslParser.RULE_decision = 2;
sslParser.RULE_sentencia = 3;
sslParser.RULE_salida = 4;
sslParser.RULE_terminar = 5;
sslParser.RULE_condicion = 6;
sslParser.RULE_cadena = 7;

class ProgContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_prog;
    }

	EOF() {
	    return this.getToken(sslParser.EOF, 0);
	};

	instruccion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstruccionContext);
	    } else {
	        return this.getTypedRuleContext(InstruccionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterProg(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitProg(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitProg(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_instruccion;
    }

	decision() {
	    return this.getTypedRuleContext(DecisionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterInstruccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitInstruccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitInstruccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DecisionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_decision;
    }

	SI() {
	    return this.getToken(sslParser.SI, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	ENTONCES() {
	    return this.getToken(sslParser.ENTONCES, 0);
	};

	LLAVE_AP = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(sslParser.LLAVE_AP);
	    } else {
	        return this.getToken(sslParser.LLAVE_AP, i);
	    }
	};


	LLAVE_CI = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(sslParser.LLAVE_CI);
	    } else {
	        return this.getToken(sslParser.LLAVE_CI, i);
	    }
	};


	sentencia = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SentenciaContext);
	    } else {
	        return this.getTypedRuleContext(SentenciaContext,i);
	    }
	};

	SINO() {
	    return this.getToken(sslParser.SINO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterDecision(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitDecision(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitDecision(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_sentencia;
    }

	salida = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SalidaContext);
	    } else {
	        return this.getTypedRuleContext(SalidaContext,i);
	    }
	};

	terminar() {
	    return this.getTypedRuleContext(TerminarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterSentencia(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitSentencia(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitSentencia(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_salida;
    }

	IMPRIMIR() {
	    return this.getToken(sslParser.IMPRIMIR, 0);
	};

	PARENT_AP() {
	    return this.getToken(sslParser.PARENT_AP, 0);
	};

	cadena() {
	    return this.getTypedRuleContext(CadenaContext,0);
	};

	PARENT_CI() {
	    return this.getToken(sslParser.PARENT_CI, 0);
	};

	PUNTO_COMA() {
	    return this.getToken(sslParser.PUNTO_COMA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TerminarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_terminar;
    }

	SALIR() {
	    return this.getToken(sslParser.SALIR, 0);
	};

	PUNTO_COMA() {
	    return this.getToken(sslParser.PUNTO_COMA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterTerminar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitTerminar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitTerminar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_condicion;
    }

	VERDADERO() {
	    return this.getToken(sslParser.VERDADERO, 0);
	};

	FALSO() {
	    return this.getToken(sslParser.FALSO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterCondicion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitCondicion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CadenaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = sslParser.RULE_cadena;
    }

	CADENA_LIT() {
	    return this.getToken(sslParser.CADENA_LIT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.enterCadena(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof sslListener ) {
	        listener.exitCadena(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof sslVisitor ) {
	        return visitor.visitCadena(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




sslParser.ProgContext = ProgContext; 
sslParser.InstruccionContext = InstruccionContext; 
sslParser.DecisionContext = DecisionContext; 
sslParser.SentenciaContext = SentenciaContext; 
sslParser.SalidaContext = SalidaContext; 
sslParser.TerminarContext = TerminarContext; 
sslParser.CondicionContext = CondicionContext; 
sslParser.CadenaContext = CadenaContext; 
