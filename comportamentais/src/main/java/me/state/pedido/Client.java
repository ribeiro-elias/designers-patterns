package me.state.pedido;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        PedidoRealizado startState = new PedidoRealizado();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        PedidoEmAndamento pedidoEmAndamento = new PedidoEmAndamento();
        pedidoEmAndamento.doAction(context);

        System.out.println(context.getState().toString());

        PedidoFinalizado pedidoFinalizado = new PedidoFinalizado();
        pedidoFinalizado.doAction(context);
    }
}
