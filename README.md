# Analizador

Este proyecto utiliza **ANTLR4** y **Node.js** para analizar instrucciones escritas en un lenguaje definido por la gramática `Analizador.g4`.

---

## Requisitos Mínimos para Ejecución

Para ejecutar el analizador, asegúrate de tener instalado lo siguiente:

- **Node.js**: Versión 16 o superior  
  [https://nodejs.org](https://nodejs.org)
- **Git**: Para clonar el repositorio  
  [https://git-scm.com](https://git-scm.com)
- **Java Runtime Environment (JRE)**: Requerido si ANTLR necesita regenerar archivos del parser/lexer

Verifica las instalaciones con los siguientes comandos:

```bash
node -v
npm -v
git --version
java -version
```

---

## Cómo Ejecutar la Aplicación con los Ejemplos

### 1. Clona el repositorio

```bash
git clone https://github.com/MatiBarfi/51906.git
```

### 2. Navega al directorio del analizador

```bash
cd 51906/Analizador
```

### 3. Instala las dependencias

```bash
npm install
```

### 4. Prepara el archivo de entrada

El analizador lee desde `input.txt`. Copia el contenido de un archivo de ejemplo a `input.txt`:

**Linux/macOS:**
```bash
cp inputcorrecto1.txt input.txt
```

**Windows (CMD):**
```cmd
copy inputcorrecto1.txt input.txt
```

También puedes abrir `input.txt` en tu editor, borrar su contenido y pegar el contenido de `inputcorrecto1.txt` o `inputcorrecto2.txt`.

### 5. Ejecuta el analizador

```bash
npm start
```

#### Nota para usuarios de PowerShell en Windows:
Si obtienes un error de política de ejecución al correr `npm start`, ejecuta:

```powershell
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
```

Confirma con `Y` o `A`.

---

## Salida Esperada

Usando `inputcorrecto1.txt`, deberías ver:

```
Entrada válida.

Tabla de Lexemas:
if → IF
( → LPAR
1 → UNO
...
<EOF> → EOF

Árbol de derivación:
(programa (instrucciones (instruccion ...
...
Fin de visita del programa.
verdadero
```

---

### 🔍 Depurar el Proyecto

Puedes depurar el analizador directamente desde Visual Studio Code presionando `F5`. A continuación, se detallan los pasos necesarios para configurar la depuración correctamente:

#### 1. Instala la extensión necesaria

Debes tener instalada la siguiente extensión oficial en Visual Studio Code:

- [**ANTLR4 grammar syntax support**](https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4)

Puedes buscarla como `antlr4` en la pestaña de extensiones de VSCode.

#### 2. Configura el archivo `.vscode/launch.json`

Verifica que el archivo `.vscode/launch.json` contenga lo siguiente:

```json
{
  "version": "2.0.0",
  "configurations": [
    {
      "name": "Debug ANTLR4 grammar",
      "type": "antlr-debug",
      "request": "launch",
      "input": "input.txt",
      "grammar": "Analizador.g4",
      "printParseTree": true,
      "visualParseTree": true
    }
  ]
}
```

Este archivo configura la depuración para que use la gramática `Analizador.g4` sobre el archivo `input.txt`, mostrando el árbol de análisis sintáctico en consola y de forma visual.

> ⚠️ Asegúrate de que el archivo esté ubicado en la carpeta `.vscode` dentro del directorio `Analizador`.

#### 3. Estructura esperada del proyecto

Asegúrate de que tu proyecto tenga la siguiente estructura mínima:

```
/Analizador
│
├── index.js
├── Analizador.g4
├── input.txt
├── package.json
└── .vscode/
    └── launch.json
```

- `index.js`: archivo principal que ejecuta el analizador.
- `input.txt`: archivo que contiene el código fuente de entrada.
- `.vscode/launch.json`: configuración de depuración para ANTLR.

#### 4. Ejecutar la depuración

Una vez todo esté configurado:

1. Abre la carpeta `Analizador` con VSCode.
2. Verifica que `input.txt` contenga contenido válido para analizar.
3. Presiona `F5` o selecciona la opción **Ejecutar y depurar → Debug ANTLR4 grammar**.

Esto iniciará la depuración y mostrará tanto el árbol de derivación textual como una vista visual (si tienes habilitada la opción en la extensión).

> Si aparece el error `"Configured debug type 'antlr-debug' is not supported"`, asegúrate de tener instalada correctamente la extensión **ANTLR4 grammar syntax support**.
## Reglas para un Input Válido (Según `Analizador.g4` y `AnalizadorLexer.g4`)

### Estructura General

Un programa consiste en **una o más instrucciones**, cada una con una estructura de decisión `if`.

### Estructura de Decisión

- Inicia con `if`
- Sigue una condición entre paréntesis: `(0)` o `(1)`
- Luego, un bloque entre llaves `{}` con sentencias
- Opcionalmente: `else` seguido de otro bloque `{}`

**Formato válido:**

```c
if (condicion) { sentencia(s) }
if (condicion) { sentencia(s) } else { sentencia(s) }
```

> **Importante**: No se permiten `if` anidados dentro de bloques `{}` de otro `if` o `else`.

---

### Tipos de Sentencias Permitidas

- **Salida (`printf`)**
- **Terminación (`return`)**

**Ejemplos:**

```c
printf("texto");
return;
```

---

### Cadenas de Texto

- Deben estar entre comillas dobles `"`.  
- Pueden contener:
  - Letras (a-z, A-Z)
  - Dígitos (0-9)
  - Símbolos `. , ! ? : ; '`
- **Espacios dentro de la cadena** serán omitidos por el lexer y no aparecerán en la salida del visitor.

> `printf("hola mundo");` será tratado como `"holamundo"`.

---

## Ejemplo Válido Combinando Reglas

```c
if (1) {
    printf("Condicion verdadera.");
    printf("Otra linea aqui.");
} else {
    printf("Condicion falsa.");
    return;
}

if (0) {
    printf("Esto no se imprime.");
}
```

---

## Ejemplos de Errores Comunes

```c
if (2) { printf("error"); }             // Condición inválida
if (1) printf("sin llaves");           // Faltan {}
printf "cadena";                       // Faltan () y ;
if (1) { printf("hola") }              // Falta ;
if (1) { if(0){printf("anidado");} }   // Anidación de if no permitida
if (1) { printf("caracteres invalidos @#$"); }  // Caracteres no válidos
```

---
