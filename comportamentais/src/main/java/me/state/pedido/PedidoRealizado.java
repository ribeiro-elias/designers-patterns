package me.state.pedido;

public class PedidoRealizado implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Pedido realizado");
        context.setState(this);
    }
}
