package me.chain.validUser;

public class Client {
    public static void main(String[] args) {
        Chain chain = new ChainValidUsuarioEmail();
        chain.linkWith(new ChainValidPassword()).linkWith(new ChainValidPreco());
        Pedido pedido = new Pedido("PC", 0, new Usuario("elias", "1234567", ""));
        chain.valid(pedido);

    }
}
