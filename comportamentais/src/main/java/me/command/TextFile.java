package me.command;

public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        System.out.println("Opening file " + name);
        return "Opening file " + name;
    }

    public String save() {
        System.out.println("Saving file " + name);
        return "Saving file " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
