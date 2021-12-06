package book.builder;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private double fuel = 0;

    public Car(CarType carType, int seats, Transmission transmission, TripComputer tripComputer) {
        this.carType = carType;
        this.seats = seats;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
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


    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", fuel=" + fuel +
                '}';
    }
}
