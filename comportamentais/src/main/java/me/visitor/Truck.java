package me.visitor;

public class Truck extends Transporte{
    public Truck(Integer price) {
        super("TRUCK", price);
    }

    @Override
    public Integer getPriceWithTaxes(TransportVisitor visitor) {
        return visitor.calculateTaxesForTruck(this);
    }
}
