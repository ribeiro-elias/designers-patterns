package me.state.pedido;

public class PedidoFinalizado implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Pedido finalizado");
    }
}
