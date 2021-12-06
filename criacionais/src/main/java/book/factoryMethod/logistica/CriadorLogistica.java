package book.factoryMethod.logistica;

public abstract class CriadorLogistica {
    public void algumaOperacao(){
        System.out.println("Alguma operacao de criador de logistica");
    }

    public abstract Logistica criaEspecifica();
}
