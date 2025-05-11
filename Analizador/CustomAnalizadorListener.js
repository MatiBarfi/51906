import AnalizadorListener from "./generated/AnalizadorListener.js";

export class CustomAnalizadorListener extends AnalizadorListener {

    enterStat(ctx) {
        console.log(`Se detectó una: ${ctx.constructor.name}`);
    }

}