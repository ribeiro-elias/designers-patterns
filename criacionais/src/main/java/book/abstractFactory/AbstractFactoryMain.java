package book.abstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Application application = new Application(new MobiliaModernaFactory());
        application.falarSobreOTipo();

        application = new Application(new MobiliaRetroFactory());
        application.falarSobreOTipo();
    }
}
