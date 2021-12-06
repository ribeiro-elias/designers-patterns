package book.builder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constroiUmCarroDeCidade(carBuilder);



        Car result = carBuilder.getResult();

        System.out.println(result.toString());

    }
}
