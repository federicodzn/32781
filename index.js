import sslLexer from "./generated/sslLexer.js";
import sslParser from "./generated/sslParser.js";
import { CustomSslVisitor } from "./CustomSslVisitor.js";
import { CustomSslListener } from "./CustomSslListener.js";
import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";
import readline from 'readline';
import fs from 'fs';

async function main() {
    let input;

    // Leer desde input.txt o pedir por teclado si no existe
    try {
        input = fs.readFileSync('input_correcto1.txt', 'utf8');
        console.log("Leyendo desde input.txt...\n");
    } catch (err) {
        input = await leerCadena();
        console.log();
    }

    // --- Primera pasada: tabla de tokens y lexemas ---
    let inputStream = CharStreams.fromString(input);
    let lexer = new sslLexer(inputStream);

    console.log("Verificando tokens generados por el lexer...");
    const tokens = lexer.getAllTokens();

    if (tokens.length === 0) {
        console.error("No se generaron tokens. Verifica la entrada y la gramática.");
        return;
    }

    console.log("\nTabla de Tokens y Lexemas:");
    console.log("--------------------------------------------------");
    console.log("| Lexema         | Token                         |");
    console.log("--------------------------------------------------");

    for (let token of tokens) {
        const tokenType = sslLexer.symbolicNames[token.type] || `UNKNOWN (${token.type})`;
        const lexema = token.text;
        console.log(`| ${lexema.padEnd(14)} | ${tokenType.padEnd(30)}|`);
    }

    console.log("--------------------------------------------------");

    /* Vuelve a procesar la entrada porque getAllTokens() consume el lexer */
    inputStream = CharStreams.fromString(input);
    lexer = new sslLexer(inputStream);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new sslParser(tokenStream);
    const tree = parser.prog();

    // Verificar errores sintácticos
    if (parser.syntaxErrorsCount > 0) {
        console.error(`\nSe encontraron ${parser.syntaxErrorsCount} error(es) de sintaxis.`);
        process.exit(1);
    }

    console.log("\n✓ Entrada válida.\n");

    // Mostrar árbol de derivación en texto
    const cadenaTree = tree.toStringTree(parser.ruleNames);
    console.log(`Árbol de derivación:\n${cadenaTree}\n`);

    // --- Listener: recorre el árbol emitiendo eventos enter/exit ---
    console.log("── Recorrido con Listener ──────────────────────────");
    const listener = new CustomSslListener();
    ParseTreeWalker.DEFAULT.walk(listener, tree);

    // --- Visitor: ejecuta el programa según la semántica definida ---
    console.log("\n── Ejecución con Visitor ───────────────────────────");
    const visitor = new CustomSslVisitor();
    visitor.visit(tree);
}

function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    return new Promise(resolve => {
        rl.question("Ingrese el programa SSL: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

main();