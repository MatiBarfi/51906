import { Parser } from "antlr4";
import AnalizadorVisitor from "./generated/AnalizadorVisitor.js";
import AnalizadorParser from "./generated/AnalizadorParser.js";

export class CustomAnalizadorVisitor extends AnalizadorVisitor{

    constructor() {
        super();
        // Puedes declarar variables de instancia aquí si necesitas mantener un estado
        // durante la visita, similar a 'this.memory' en tu ejemplo de calculadora.
        // Por ejemplo, para almacenar resultados intermedios, un entorno, etc.
        // this.output = []; // Ejemplo para recolectar salida de printf
    }

    // Visita la regla 'programa'
    visitPrograma(ctx) {
        // Un programa es una secuencia de instrucciones.
        // visitChildren procesará las instrucciones en orden.
        // Si necesitas recolectar resultados de cada instrucción,
        // podrías iterar sobre ctx.instrucciones().instruccion() o adaptar visitInstr1/visitInstr0
        console.log("Iniciando visita del programa.");
        const resultado = this.visit(ctx.instrucciones());
        console.log("Fin de visita del programa.");
        return resultado; // O lo que sea que 'instrucciones' deba devolver
    }

    // Visita la alternativa #instr0 de 'instrucciones' (instruccion única)
    visitInstr0(ctx) {
        // Procesa una única instrucción.
        return this.visit(ctx.instruccion());
    }

    // Visita la alternativa #instr1 de 'instrucciones' (instrucciones recursivas)
    visitInstr1(ctx) {
        // Procesa la lista de instrucciones previas y luego la instrucción actual.
        // Esto es para una secuencia. Puedes decidir cómo manejar los resultados.
        // Opción 1: Ejecutar secuencialmente (si tienen efectos secundarios)
        this.visit(ctx.instrucciones()); // Visita el bloque anterior de instrucciones
        return this.visit(ctx.instruccion());  // Visita y devuelve el resultado de la instrucción actual
                                           // (o el último resultado si las instrucciones devuelven algo)

        // Opción 2: Recolectar resultados (si las instrucciones devuelven valores)
        // const resultadosAnteriores = this.visit(ctx.instrucciones());
        // const resultadoActual = this.visit(ctx.instruccion());
        // return Array.isArray(resultadosAnteriores) ? [...resultadosAnteriores, resultadoActual] : [resultadosAnteriores, resultadoActual];
    }

    // Visita la alternativa #ins1 de 'instruccion'
    visitIns1(ctx) {
        // Una instrucción es una decisión en este caso.
        return this.visit(ctx.decision());
    }

    // Visita la alternativa #dec1 de 'decision' (IF ... ELSE?)
    visitDec1(ctx) {
        const condicionValue = this.visit(ctx.condicion()); // Esto devolverá 0 o 1 según tu lógica en visitCero1/visitUno1
        // Asumimos que '1' es verdadero y '0' es falso para la condición.
        if (condicionValue === 1) { // O la representación de verdadero que elijas
            return this.visit(ctx.sentencia(0)); // Visita el bloque de sentencias del IF
        } else if (ctx.ELSE()) { // Si hay un bloque ELSE
            return this.visit(ctx.sentencia(1)); // Visita el bloque de sentencias del ELSE
        }
        // Si la condición es falsa y no hay ELSE, no se hace nada o se devuelve un valor por defecto.
        return null; // O un valor indicativo
    }

    // Visita la alternativa #sal1 de 'sentencia' (salida única)
    visitSal1(ctx) {
        return this.visit(ctx.salida());
    }

    // Visita la alternativa #salsen1 de 'sentencia' (salida y sentencia recursiva)
    visitSalsen1(ctx) {
        // Similar a visitInstr1, maneja una secuencia.
        this.visit(ctx.salida()); // Ejecuta/procesa la salida
        return this.visit(ctx.sentencia()); // Procesa la siguiente sentencia
    }

    // Visita la alternativa #terminar1 de 'sentencia'
    visitTerminar1(ctx) {
        return this.visit(ctx.terminar());
    }

    // Visita la alternativa #salida1 de 'salida' (PRINTF)
    visitSalida1(ctx) {
        const cadenaAImprimir = this.visit(ctx.cadena());
        console.log(`${cadenaAImprimir}`); // Simula la acción de printf
        // this.output.push(cadenaAImprimir); // Si estuvieras recolectando salida
        return `printf("${cadenaAImprimir}");`; // O devuelve una representación
    }

    // Visita la alternativa #ter1 de 'terminar' (RETURN)
    visitTer1(ctx) {
        // En un intérprete real, esto podría lanzar una excepción especial
        // para detener la ejecución o devolver un objeto que indique el retorno.
        return { type: "RETURN" }; // Ejemplo de un valor de retorno especial
    }

    // Visita la alternativa #cero1 de 'condicion'
    visitCero1(ctx) {
        return 0; // Representa 'falso' o el valor numérico 0
    }

    // Visita la alternativa #uno1 de 'condicion'
    visitUno1(ctx) {
        return 1; // Representa 'verdadero' o el valor numérico 1
    }

    // Visita la alternativa #cadena1 de 'cadena'
    visitCadena1(ctx) {
        // Las comillas (LDCOMILLA) son parte de la regla, pero usualmente queremos el contenido.
        // ctx.caracteres() puede ser null si la cadena está vacía (ej: "").
        if (ctx.caracteres()) {
            return this.visit(ctx.caracteres());
        }
        return ""; // Cadena vacía
    }

    // Visita la alternativa #caracter1 de 'caracteres' (caracter único)
    visitCaracter1(ctx) {
        return this.visit(ctx.caracter()); // Devuelve el texto del único caracter
    }

    // Visita la alternativa #caracteres1 de 'caracteres' (caracteres recursivos)
    visitCaracteres1(ctx) {
        // Concatena el resultado de la visita recursiva de 'caracteres'
        // con el resultado de la visita del 'caracter' actual.
        const acumulado = this.visit(ctx.caracteres());
        const actual = this.visit(ctx.caracter());
        return acumulado + actual;
    }

    // Visita la alternativa #letr de 'caracter'
    visitLetr(ctx) {
        return ctx.LETRA().getText();
    }

    // Visita la alternativa #dig de 'caracter'
    visitDig(ctx) {
        return ctx.DIGITO().getText();
    }

    // Visita la alternativa #sim de 'caracter'
    visitSim(ctx) {
        return ctx.SIMBOLO().getText();
    }
}