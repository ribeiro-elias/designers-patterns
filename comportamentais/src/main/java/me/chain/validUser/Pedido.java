package me.chain.validUser;

public class Pedido {
    private final String item;
    private final Integer valor;
    private final Usuario usuario;

    public Pedido(String item, Integer valor, Usuario usuario) {
        this.item = item;
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getItem() {
        return item;
    }

    public Integer getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
