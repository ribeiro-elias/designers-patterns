package me.flyweight.marvel;

import java.util.concurrent.ConcurrentHashMap;

public class CatalogoDePersonagens {
    static ConcurrentHashMap<String,Personagem> personagens = new ConcurrentHashMap<String,Personagem>();

    public static Personagem getPersonagem(Personagem personagem) {
        boolean contains = personagens.containsKey(personagem.getName());
        if (!contains) {
            personagens.put(personagem.getName(),personagem);
        }
        return personagem;
    }

    public static Integer size(){
        return personagens.size();
    }
}
