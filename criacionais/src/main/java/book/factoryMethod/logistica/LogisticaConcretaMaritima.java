package book.factoryMethod.logistica;

public class LogisticaConcretaMaritima extends CriadorLogistica{
    @Override
    public Logistica criaEspecifica() {
        System.out.println("criando logistica maritima");
        return new LogisticaMaritima();
    }
}
