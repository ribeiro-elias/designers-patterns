package me.state.pedidos2;

public class StateContext {
    private State state;

    public StateContext() {
        state = new PedidoIniciado();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void execute(){
        state.execute(this);
    }
}
