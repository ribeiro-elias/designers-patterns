package book.observable.assinaturas;

public class AssinanteSMS implements AssinantesDeNotificacoes{
    @Override
    public void notifica(String mensagem) {
        System.out.println("SMS recebido com sucesso :" + mensagem);
    }
}
