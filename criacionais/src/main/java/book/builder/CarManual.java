package book.builder;

public class CarManual {
    private final CarType carType;
    private final int seats;
    private final Transmission transmission;
    private final TripComputer tripComputer;

    public CarManual(CarType carType, int seats,  Transmission transmission, TripComputer tripComputer) {
        this.carType = carType;
        this.seats = seats;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
    }


    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                '}';
    }
}
