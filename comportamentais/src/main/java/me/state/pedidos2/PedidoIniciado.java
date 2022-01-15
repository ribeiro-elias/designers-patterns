package me.state.pedidos2;

public class PedidoIniciado implements State {
    @Override
    public void execute(StateContext ctx) {
        System.out.println("Pedido iniciado");
    }
}
