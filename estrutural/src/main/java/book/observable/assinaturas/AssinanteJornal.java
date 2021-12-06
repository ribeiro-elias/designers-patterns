package book.observable.assinaturas;

public class AssinanteJornal implements AssinantesDeNotificacoes{
    @Override
    public void notifica(String mensagem) {
        System.out.println("Jornal recebido com sucesso : " + mensagem);
    }
}
