package me.visitor;

public interface TransportVisitor {

    Integer calculateTaxesForCar(Car car);
    Integer calculateTaxesForBike(Bike bike);
    Integer calculateTaxesForTruck(Truck truck);
}
