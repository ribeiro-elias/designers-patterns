package book.chain.login;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioComSenhaInvalida = new Usuario("Elias", "elias@email.com", "");
        ValidatorHandler validatorHandler = new ValidatorHandler();
        NomeHandler validator = validatorHandler.validator(usuarioComSenhaInvalida);
        if(validator.hasErrors()){
            validator.showErros();
        }
    }
}
