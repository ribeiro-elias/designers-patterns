package book.builder;

public class CarBuilder implements Builder{

    private CarType type;
    private int seats;
    private Transmission transmission;
    private TripComputer tripComputer;
    private Integer fuel = 0;

    @Override
    public void withCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void withSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public void withTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void withTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void withFuel(Integer fuel){
        this.fuel = fuel;
    }

    public Car getResult(){
        Car car = new Car(this.type, this.seats, this.transmission, this.tripComputer);
        car.setFuel(this.fuel);
        return car;
    }

}
