package book.chain.login;

public class ValidatorHandler {

    public NomeHandler validator(Usuario usuario){
        NomeHandler nomeHandler = new NomeHandler();
        nomeHandler
                .setNextHandler(new EmailHandler())
                .setNextHandler(new PasswordHandler());
        nomeHandler.handler(usuario);
        return nomeHandler;
    }
}
