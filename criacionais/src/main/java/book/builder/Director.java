package book.builder;

public class Director {
    public void constroiUmCarroEsportivo(Builder builder){
        builder.withCarType(CarType.SPORTS_CAR);
        builder.withSeats(2);
        builder.withTransmission(Transmission.AUTOMATIC);
        builder.withTripComputer(TripComputer.MEDIUM);
    }


    public void constroiUmCarroDeCidade(Builder builder){
        builder.withCarType(CarType.CITY_CAR);
        builder.withSeats(2);
        builder.withTransmission(Transmission.SEMI_AUTOMATIC);
        builder.withTripComputer(TripComputer.FULL);
    }

    public void constroiUmaSUV(Builder builder){
        builder.withCarType(CarType.SUV);
        builder.withSeats(4);
        builder.withTransmission(Transmission.MANUAL);
        builder.withTripComputer(TripComputer.EMPTY);
    }
}
