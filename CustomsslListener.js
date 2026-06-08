import sslListener from "./generated/sslListener.js";
 
export class CustomSslListener extends sslListener {
 
    constructor() {
        super();
        this.depth = 0;  // nivel de profundidad para indentación visual
    }
 
    indent() {
        return "  ".repeat(this.depth);
    }
 
    enterProg(ctx) {
        console.log("[listener] Inicio del programa");
        this.depth++;
    }
 
    exitProg(ctx) {
        this.depth--;
        console.log("[listener] Fin del programa");
    }
 
    enterInstruccion(ctx) {
        console.log(`${this.indent()}→ instruccion`);
        this.depth++;
    }
 
    exitInstruccion(ctx) {
        this.depth--;
    }
 
    enterDecision(ctx) {
        const tieneSino = ctx.SINO() !== null;
        console.log(`${this.indent()}→ decision (tiene sino: ${tieneSino})`);
        this.depth++;
    }
 
    exitDecision(ctx) {
        this.depth--;
    }
 
    enterSentencia(ctx) {
        console.log(`${this.indent()}→ sentencia`);
        this.depth++;
    }
 
    exitSentencia(ctx) {
        this.depth--;
    }
 
    enterSalida(ctx) {
        console.log(`${this.indent()}→ salida`);
    }
 
    exitSalida(ctx) {}
 
    enterTerminar(ctx) {
        console.log(`${this.indent()}→ terminar`);
    }
 
    exitTerminar(ctx) {}
 
    enterCondicion(ctx) {
        const valor = ctx.VERDADERO() ? "verdadero" : "falso";
        console.log(`${this.indent()}→ condicion: ${valor}`);
    }
 
    exitCondicion(ctx) {}
 
    enterCadena(ctx) {
        const raw = ctx.CADENA_LIT().getText();
        console.log(`${this.indent()}→ cadena: ${raw}`);
    }
 
    exitCadena(ctx) {}
}
 
