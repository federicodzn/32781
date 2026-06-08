import sslVisitor from "./generated/sslVisitor.js";
import sslParser from "./generated/sslParser.js";
 
export class CustomSslVisitor extends sslVisitor {
 
    constructor() {
        super();
    }
 
    // Visita el programa completo: ejecuta cada instrucción en orden
    visitProg(ctx) {
        return this.visitChildren(ctx);
    }
 
    // Visita una instrucción (delega en decision)
    visitInstruccion(ctx) {
        return this.visitChildren(ctx);
    }
 
    // Visita una decision: evalúa la condición y ejecuta el bloque correspondiente
    visitDecision(ctx) {
        const condicionCtx = ctx.condicion();
        const condicion = this.visit(condicionCtx);
 
        // ctx.sentencia() devuelve array con todas las sentencias de ambos bloques.
        // El parser agrupa los bloques por posición de las llaves.
        // Usamos los índices LLAVE_AB/LLAVE_CL para separar entonces vs sino.
        const llaves = ctx.LLAVE_AP();  // [llave entonces, llave sino (si existe)]
        const sentencias = ctx.sentencia();
 
        // Determinamos cuántas sentencias pertenecen al bloque "entonces"
        // buscando la posición del SINO token (si existe).
        const sinoToken = ctx.SINO();
        let sentenciasEntonces = [];
        let sentenciasSino = [];
 
        if (sinoToken) {
            // Posición de inicio del token SINO en el token stream
            const sinoPos = sinoToken.symbol.tokenIndex;
            for (const s of sentencias) {
                if (s.start.tokenIndex < sinoPos) {
                    sentenciasEntonces.push(s);
                } else {
                    sentenciasSino.push(s);
                }
            }
        } else {
            sentenciasEntonces = sentencias;
        }
 
        if (condicion) {
            console.log("  [decision] Condición verdadera → ejecutando bloque 'entonces'");
            for (const s of sentenciasEntonces) this.visit(s);
        } else {
            if (sinoToken) {
                console.log("  [decision] Condición falsa → ejecutando bloque 'sino'");
                for (const s of sentenciasSino) this.visit(s);
            } else {
                console.log("  [decision] Condición falsa y no hay bloque 'sino'. Nada que ejecutar.");
            }
        }
    }
 
    // Visita una sentencia: puede ser una o más salidas, o un terminar
    visitSentencia(ctx) {
        return this.visitChildren(ctx);
    }
 
    // Visita salida: imprime el contenido de la cadena (sin las comillas)
    visitSalida(ctx) {
        const cadenaCtx = ctx.cadena();
        const texto = this.visit(cadenaCtx);
        console.log(`  >> ${texto}`);
    }
 
    // Visita terminar: detiene la ejecución
    visitTerminar(ctx) {
        console.log("  [terminar] Fin del programa.");
        process.exit(0);
    }
 
    // Visita condicion: devuelve true si es VERDADERO, false si es FALSO
    visitCondicion(ctx) {
        return ctx.VERDADERO() !== null;
    }
 
    // Visita cadena: retorna el texto sin las comillas dobles
    visitCadena(ctx) {
        const raw = ctx.CADENA_LIT().getText();
        return raw.slice(1, -1);  // quita las comillas
    }
}
 
