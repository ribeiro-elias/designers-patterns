package book.observable.login;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Email email = new Email();
        login.addObserver(email);
        login.setMensagem("Loguei");
    }
}
