package me.chain.validUser;

public abstract class Chain {
    private Chain next;

    public Chain linkWith(Chain next) {
        this.next = next;
        return next;
    }

    public abstract boolean valid(Pedido pedido);

    protected boolean checkNext(Pedido pedido) {
        if (next == null) {
            return true;
        }
        return next.valid(pedido);
    }
}
