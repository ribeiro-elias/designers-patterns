package book.chain.login;

public class EmailHandler extends HandlerBase {
    @Override
    public Usuario handler(Usuario usuario) {
        if(usuario.getEmail().isEmpty() || !usuario.getEmail().contains("@")){
            getDicionario().put("email","O email está invalido ou vazio");
        }
        return super.handler(usuario);
    }

}
