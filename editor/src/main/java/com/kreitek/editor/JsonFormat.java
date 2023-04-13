package com.kreitek.editor;

import java.util.ArrayList;

import static com.kreitek.editor.ConsoleEditor.TEXT_RESET;
import static com.kreitek.editor.ConsoleEditor.TEXT_YELLOW;

public class JsonFormat {
    public void showJsonLines(ArrayList<String> documentLines) {
        ConsoleEditor consoleEditor = new ConsoleEditor();
        if (documentLines.size() > 0){
            consoleEditor.setTextColor(TEXT_YELLOW);
            consoleEditor.printLnToConsole("START DOCUMENT ==>");
            consoleEditor.printLnToConsole("{");
            consoleEditor.printLnToConsole("\t\"doc\": [");
            for (int index = 0; index < documentLines.size(); index++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\t\t{\"line\":");
                stringBuilder.append("\"");
                stringBuilder.append(index);
                stringBuilder.append("\",");
                stringBuilder.append("\"text\":");
                stringBuilder.append("\"");
                stringBuilder.append(documentLines.get(index));
                //Añado comas en todas las lineas menos en la última
                if (index < documentLines.size()-1) {
                    stringBuilder.append("\"},");
                } else {
                    stringBuilder.append("\"}");
                }
                consoleEditor.printLnToConsole(stringBuilder.toString());
            }
            consoleEditor.printLnToConsole("\t]");
            consoleEditor.printLnToConsole("}");
            consoleEditor.printLnToConsole("<== END DOCUMENT");
            consoleEditor.setTextColor(TEXT_RESET);
        }
    }
}
