package me.visitor;

public class Bike extends Transporte {
    public Bike(Integer price) {
        super("BIKE", price);
    }

    @Override
    public Integer getPriceWithTaxes(TransportVisitor visitor) {
        return visitor.calculateTaxesForBike(this);
    }
}
