package book.abstractFactory;

public interface AbstractFactory {
    Cadeira criarCadeira();
    Mesa criarMesa();
    Sofa criarSofa();
}
