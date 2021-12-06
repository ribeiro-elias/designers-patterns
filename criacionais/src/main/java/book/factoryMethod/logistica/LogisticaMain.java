package book.factoryMethod.logistica;


public class LogisticaMain {



    public static void main(String[] args) {
        CriadorLogistica criadorLogistica = new LogisticaConcretaTerrestre();
        Logistica logisticaTerresta = criadorLogistica.criaEspecifica();
        logisticaTerresta.facaAlgo();
        System.out.println("============================================================================");
        criadorLogistica = new LogisticaConcretaMaritima();
        Logistica criadorLogisticaMaritima = criadorLogistica.criaEspecifica();
        criadorLogisticaMaritima.facaAlgo();

    }
}
