package me.flyweight.marvel;

public class Marvel {
    private final CatalogoDePersonagens catalogoDePersonagens = new CatalogoDePersonagens();

    public void addPersonagem(Personagem personagem){
        CatalogoDePersonagens.getPersonagem(personagem);
    }

    String report() {
        return "\nTotal de personagens "
                + catalogoDePersonagens.size();
    }
}
