package book.abstractFactory;

public class MobiliaRetroFactory implements AbstractFactory {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraRetro();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaRetro();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaRetro();
    }
}
