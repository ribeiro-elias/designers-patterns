package book.chain.login;

public class PasswordHandler extends HandlerBase {
    @Override
    public Usuario handler(Usuario usuario) {
        if(usuario.getPassword().isEmpty()){
            getDicionario().put("password","O senha está invalido ou vazio");
        }
        return usuario;
    }
}
