package me.flyweight.marvel;

public class Personagem{

    private final String name;
    private final String altura;
    private final String poder;

    public Personagem(String name, String altura, String poder) {
        this.name = name;
        this.altura = altura;
        this.poder = poder;
    }

    public String getName() {
        return name;
    }

    public String getAltura() {
        return altura;
    }

    public String getPoder() {
        return poder;
    }
}
