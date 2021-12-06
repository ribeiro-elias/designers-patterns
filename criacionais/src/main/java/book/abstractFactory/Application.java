package book.abstractFactory;

public class Application {
    private Mesa mesa;
    private Sofa sofa;
    private Cadeira cadeira;

    public Application(AbstractFactory abstractFactory){
        this.mesa = abstractFactory.criarMesa();
        this.sofa = abstractFactory.criarSofa();
        this.cadeira = abstractFactory.criarCadeira();
    }

    public void falarSobreOTipo(){
        mesa.tipoMesa();
        sofa.tipoDoSofa();
        cadeira.tipoDaCadeira();
    }
}
