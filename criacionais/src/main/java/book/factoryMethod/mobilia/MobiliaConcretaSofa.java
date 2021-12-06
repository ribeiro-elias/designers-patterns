package book.factoryMethod.mobilia;

public class MobiliaConcretaSofa extends CriadorDeMobilia {

    @Override
    public Mobilia criarMobilia() {
        return new MobiliaSofa();
    }
}
