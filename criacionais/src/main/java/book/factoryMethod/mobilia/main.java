package book.factoryMethod.mobilia;

public class main {
    public static void main(String[] args) {
        CriadorDeMobilia criadorDeMobilia = new MobiliaConcretaSofa();
        Mobilia mobilia = criadorDeMobilia.criarMobilia();
        mobilia.facaAlgo();
    }
}
