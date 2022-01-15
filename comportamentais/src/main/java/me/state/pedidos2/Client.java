package me.state.pedidos2;

public class Client {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.execute();
        stateContext.setState(new PedidoACaminho());
        stateContext.execute();
        stateContext.setState(new PedidoFinalizado());
        stateContext.execute();
    }
}
