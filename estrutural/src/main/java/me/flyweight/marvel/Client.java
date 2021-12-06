package me.flyweight.marvel;

public class Client {
    public static void main(String[] args) {
        Marvel marvel = new Marvel();
        marvel.addPersonagem(new Personagem("Super man","1.80","Força"));
        marvel.addPersonagem(new Personagem("Mulher maravilha","1.65","Força"));
        marvel.addPersonagem(new Personagem("Mulher maravilha","1.65","Força"));
        marvel.addPersonagem(new Personagem("Batman","1.76","Inteligencia"));
        marvel.addPersonagem(new Personagem("Batman","1.76","Inteligencia"));
        marvel.addPersonagem(new Personagem("Batman","1.76","Inteligencia"));
        marvel.addPersonagem(new Personagem("Batman","1.76","Inteligencia"));
        marvel.addPersonagem(new Personagem("Homem de ferro","1.86","Dinheiro"));

        System.out.println(marvel.report());
    }
}
