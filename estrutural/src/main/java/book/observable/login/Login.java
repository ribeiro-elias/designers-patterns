package book.observable.login;

import java.util.Observable;
import java.util.Observer;

public class Login extends Observable {
    private String mensagem;

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        setChanged();
        notifyObservers(mensagem);
    }
}
