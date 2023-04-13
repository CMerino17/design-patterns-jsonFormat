package com.kreitek.editor;

public class Application {

    public static void main(String[] args) {
        try{
            EditorFactory editorFactory = new EditorFactory();
            Editor editor = editorFactory.getEditor();
            editor.run(args[0]);
        } catch (Exception e) {
            System.out.println("Error: Inserta \"text\" o \"json\" como argumento");
        }
    }
}
