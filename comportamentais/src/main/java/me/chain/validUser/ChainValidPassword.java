package me.chain.validUser;

public class ChainValidPassword extends Chain{
    @Override
    public boolean valid(Pedido pedido) {
        if(pedido.getUsuario().getPassword() == null || pedido.getUsuario().getPassword().length() < 5){
            throw new IllegalArgumentException("password não é valido");
        }
        return checkNext(pedido);
    }
}
