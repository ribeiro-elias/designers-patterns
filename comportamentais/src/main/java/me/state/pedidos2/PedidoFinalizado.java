package me.state.pedidos2;

public class PedidoFinalizado implements State{
    @Override
    public void execute(StateContext ctx) {
        System.out.println("Pedido finalizado");
    }
}
