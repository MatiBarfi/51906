import AnalizadorLexer from "./generated/AnalizadorLexer.js";
import AnalizadorParser from "./generated/AnalizadorParser.js";
import { CustomAnalizadorListener } from "./CustomAnalizadorListener.js";
import { CustomAnalizadorVisitor } from "./CustomAnalizadorVisitor.js";
import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";
import readline from 'readline';
import fs from 'fs';
class ThrowingErrorListener extends antlr4.error.ErrorListener {
    syntaxError(recognizer, offendingSymbol, line, column, msg, err) {
        throw new Error(`línea ${line}, columna ${column}: ${msg}`);
    }
}
async function main() {
    let input;

    // Intento leer la entrada desde el archivo input - en forma sincrona.
    try {
        input = fs.readFileSync('input.txt', 'utf8');
    } catch (err) {
        // Si no es posible leer el archivo, solicitar la entrada del usuario por teclado
        input = await leerCadena(); // Simula lectura síncrona
        console.log(input);
    }
    // Proceso la entrada con el analizador e imprimo el arbol de analisis en formato texto
   try {
        let inputStream = CharStreams.fromString(input);
        let lexer = new AnalizadorLexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ThrowingErrorListener());
        let tokenStream = new CommonTokenStream(lexer);
        let parser = new AnalizadorParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());
        let tree = parser.programa();
        console.log("\n✅ Entrada válida.");
        console.log("\nTabla de Lexemas:");
            tokenStream.fill(); // llena todos los tokens
            tokenStream.tokens.forEach(token => {
                const tokenName = AnalizadorLexer.symbolicNames[token.type];
                if (tokenName) {
                    console.log(`${token.text} → ${tokenName}`);
                }
    });
        const cadena_tree = tree.toStringTree(parser.ruleNames);
        console.log(`\nÁrbol de derivación: ${cadena_tree}`);
        const visitor = new CustomAnalizadorVisitor();
        visitor.visit(tree);
    } 
    catch (e) {
    console.error("\n❌ Se detectó un error durante el análisis:");
    console.error(e.message);
    return; // importante: detener ejecución
    }
}

function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    return new Promise(resolve => {
        rl.question("Ingrese una cadena: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

// Ejecuta la función principal
main();
