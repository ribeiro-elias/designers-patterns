package book.observable.assinaturas;

public class AssinanteEmail implements AssinantesDeNotificacoes{
    @Override
    public void notifica(String mensagem) {
        System.out.println("Email recebido com sucesso : " + mensagem);
    }
}
