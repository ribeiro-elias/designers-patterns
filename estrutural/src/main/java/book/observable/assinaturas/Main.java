package book.observable.assinaturas;

public class Main {

    public static void main(String[] args) {
        Notificacao notificacao = new Notificacao();

        AssinanteEmail assinanteEmail = new AssinanteEmail();
        AssinanteJornal assinanteJornal = new AssinanteJornal();

        notificacao.adicionaNaListaDeAssinantes(assinanteEmail);
        notificacao.adicionaNaListaDeAssinantes(assinanteJornal);

        notificacao.notificaOsAssinantes("Mensagem de envio para Email e jornal");

        notificacao.removeDaListaDeAssinantes(assinanteEmail);
        notificacao.removeDaListaDeAssinantes(assinanteJornal);

        AssinanteSMS assinanteSMS = new AssinanteSMS();

        notificacao.adicionaNaListaDeAssinantes(assinanteSMS);
        notificacao.notificaOsAssinantes("Mensagem de envio apenas para SMS");
    }
}
