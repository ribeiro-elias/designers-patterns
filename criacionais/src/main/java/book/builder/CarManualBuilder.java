package book.builder;

public class CarManualBuilder implements Builder{

    private CarType type;
    private int seats;
    private Transmission transmission;
    private TripComputer tripComputer;


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

    public CarManual getResult(){
        return new CarManual(this.type,this.seats,this.transmission,this.tripComputer);
    }
}
