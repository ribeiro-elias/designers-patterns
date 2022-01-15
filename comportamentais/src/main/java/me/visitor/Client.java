package me.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Car car = new Car(12);
        Bike bike = new Bike(2);
        Truck truck = new Truck(50);

        TaxesByBrazil taxesByBrazil = new TaxesByBrazil();

        List<Transporte> transportes = new ArrayList<>();
        transportes.add(car);
        transportes.add(bike);
        transportes.add(truck);

        Integer sum=0;
        for (Transporte transporte: transportes){
            sum += transporte.getPriceWithTaxes(taxesByBrazil);
        }

        System.out.println(sum);

        int computedAges = transportes.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getPriceWithTaxes(taxesByBrazil),Integer::sum);
        System.out.println(computedAges);
    }
}
