package me.state.pedidos2;

public class PedidoACaminho implements State{
    @Override
    public void execute(StateContext ctx) {
        System.out.println("Pedido a caminho");
    }
}
