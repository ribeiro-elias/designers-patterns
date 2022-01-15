package me.visitor;

public class Car extends Transporte{
    public Car(Integer price) {
        super("CAR", price);
    }

    @Override
    public Integer getPriceWithTaxes(TransportVisitor visitor) {
        return visitor.calculateTaxesForCar(this);
    }
}
