package book.observable.login;

import java.util.Observable;
import java.util.Observer;

public class Email implements Observer {

    private String mensagem;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Recebei a msg de que fui logado");
        this.setMensagem((String) arg);
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
