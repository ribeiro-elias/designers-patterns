package me.chain.validUser;

public class ChainValidUsuarioEmail extends Chain{
    @Override
    public boolean valid(Pedido pedido) {
        if(pedido.getUsuario().getEmail() == null){
            throw new IllegalArgumentException("Email não é valido");
        }
        return checkNext(pedido);
    }
}
