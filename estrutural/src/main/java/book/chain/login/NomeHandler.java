package book.chain.login;

public class NomeHandler extends HandlerBase {
    @Override
    public Usuario handler(Usuario usuario) {
        if(usuario.getNome().isEmpty()){
            getDicionario().put("nome","O nome está invalido ou vazio");
        }
        return super.handler(usuario);
    }

}
