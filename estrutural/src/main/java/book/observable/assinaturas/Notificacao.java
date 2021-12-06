package book.observable.assinaturas;

import java.util.ArrayList;
import java.util.List;

public class Notificacao {

    private List<AssinantesDeNotificacoes> assinantesDeNotificacoes = new ArrayList<>();

    public Notificacao() {
    }

    public void adicionaNaListaDeAssinantes(AssinantesDeNotificacoes assinantesDeNotificacoes){
        this.assinantesDeNotificacoes.add(assinantesDeNotificacoes);
    }

    public void removeDaListaDeAssinantes(AssinantesDeNotificacoes assinantesDeNotificacoes){
        this.assinantesDeNotificacoes.remove(assinantesDeNotificacoes);
    }

    public void notificaOsAssinantes(String mensagem){
        for (AssinantesDeNotificacoes assinantesDeNotificacoes: assinantesDeNotificacoes){
            assinantesDeNotificacoes.notifica(mensagem);
        }
    }
}
