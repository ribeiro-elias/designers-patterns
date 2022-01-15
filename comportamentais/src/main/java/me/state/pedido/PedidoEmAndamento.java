package me.state.pedido;

public class PedidoEmAndamento implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Pedido em andamento");
        context.setState(this);
    }
}
