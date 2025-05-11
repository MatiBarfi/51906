
# Analizador

Este proyecto utiliza ANTLR4 y Node.js para analizar instrucciones escritas en un lenguaje definido por la gramática `Analizador.g4`.

---

## Requisitos

Asegúrate de tener instaladas las siguientes herramientas:

1. **Java Runtime Environment (JRE)**  
   Necesario para ejecutar ANTLR.

2. **Node.js**  
   Descarga e instala la versión LTS desde: https://nodejs.org/es  
   > Se requiere Node 16 o superior, ya que el proyecto está construido con Node.js.

3. **Visual Studio Code (VS Code)**  
   Descárgalo desde: https://code.visualstudio.com/  
   > Durante la instalación, habilita la opción **"Add to PATH"** para poder abrir VS Code desde la terminal con `code .`.

4. **Git**  
   Descárgalo desde: https://git-scm.com/downloads

---

### Verifica la instalación con los siguientes comandos en tu terminal:

| Comando       | Descripción                        | Salida esperada (ejemplo)           |
|---------------|------------------------------------|-------------------------------------|
| `node -v`     | Versión de Node.js                 | `v20.10.0`                          |
| `npm -v`      | Versión de NPM                     | `10.2.3`                            |
| `code -v`     | Versión de Visual Studio Code      | `1.96.4`                            |
| `git -v`      | Versión de Git                     | `git version 2.43.0.windows.1`      |

---

### Configuración en VS Code

1. Instala la extensión **ANTLR4 grammar syntax support** desde el Marketplace:  
   Ve al menú **Ver > Extensiones** (Ctrl + Shift + X), busca "ANTLR4" y haz clic en **Instalar**.

2. Configura la generación automática:  
   Ve a **Archivo > Preferencias > Configuración** (Ctrl + ,), busca `antlr`, desplázate a la sección **Antlr4:Generation**, y edita el archivo `settings.json`.

   Usa la siguiente configuración:

   ```json
   "antlr4.generation": {
     "alternativeJar": "antlr-4.13.2-complete.jar",
     "mode": "external",
     "listeners": true,
     "visitors": true,
     "language": "JavaScript",
     "outputDir": "./generated"
   }
   ```

---

## Instalación del Proyecto

1. Clona este repositorio desde la terminal:

   ```bash
   git clone https://github.com/MatiBarfi/51906.git
   ```

   Si se clonó correctamente, deberías ver el mensaje `done`.

2. Cambia al directorio del proyecto:

   ```bash
   cd 51906
   ```

3. Abre el proyecto en VS Code:

   ```bash
   code .
   ```

---

## Ejecutar el Proyecto

El archivo principal es `index.js`, que analiza el contenido del archivo `input.txt`.

### 📝 Para probar el analizador:

1. Copia el contenido de uno de los ejemplos en el archivo `input.txt`.

2. Ejecuta el analizador:

   ```bash
   npm start
   ```
> En caso de nunca haber utilizado este comando debe ejecutar en la terminal el siguiente código antes de escribir npm start:
> ```bash
> Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
```
3. La salida esperada será algo como:

   ```
   ✅ Entrada válida.

   Tabla de Lexemas:
   if → IF
   ( → LPAR
   1 → UNO
   ...

   Árbol de derivación: (programa (instrucciones ...) ...)
   verdadero
   ```

---

## Estructura del Proyecto

- `Analizador.g4`: Gramática del lenguaje.
- `input.txt`: Archivo de entrada con ejemplos de prueba.
- `index.js`: Lógica principal del analizador.
- `CustomAnalizadorListener.js` / `CustomAnalizadorVisitor.js`: Recorrido y procesamiento del árbol.
- `generated/`: Carpeta generada automáticamente por ANTLR con el Lexer y Parser.

---
