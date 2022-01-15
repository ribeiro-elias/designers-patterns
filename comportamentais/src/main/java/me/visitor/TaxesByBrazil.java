package me.visitor;

public class TaxesByBrazil implements TransportVisitor{
    @Override
    public Integer calculateTaxesForCar(Car car) {
        return car.getPrice() * 2;
    }

    @Override
    public Integer calculateTaxesForBike(Bike bike) {
        return bike.getPrice() * 3;
    }

    @Override
    public Integer calculateTaxesForTruck(Truck truck) {
        return truck.getPrice() * 5;
    }
}
