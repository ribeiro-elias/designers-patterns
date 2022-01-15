package me.memento.baedung;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento ");
        textEditor.write("Implementation ");
        textEditor.hitSave();
        textEditor.write("bla bla");
        textEditor.hitUndo();

        System.out.println(textEditor.print());
    }
}
