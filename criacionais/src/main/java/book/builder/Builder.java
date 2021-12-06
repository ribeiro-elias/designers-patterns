package book.builder;

public interface Builder {
    void withCarType(CarType type);
    void withSeats(Integer seats);
    void withTransmission(Transmission transmission);
    void withTripComputer(TripComputer tripComputer);;
}
