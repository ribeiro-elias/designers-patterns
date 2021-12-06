package book.abstractFactory;

public class MobiliaModernaFactory implements AbstractFactory {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }
}
