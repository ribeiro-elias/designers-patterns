package book.factoryMethod.logistica;

public class LogisticaConcretaTerrestre extends CriadorLogistica{
    @Override
    public Logistica criaEspecifica() {
        System.out.println("criando logistica terrestre");
        return new LogisticaTerrestre();
    }
}
