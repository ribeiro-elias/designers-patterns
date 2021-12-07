package me.chain.validUser;

public class ChainValidPreco extends Chain{
    @Override
    public boolean valid(Pedido pedido) {
        if(pedido.getValor() < 0){
            throw new IllegalArgumentException("valor não é valido");
        }
        return checkNext(pedido);
    }
}
