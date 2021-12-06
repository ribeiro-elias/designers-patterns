package me.flyweight.car;

import java.util.HashMap;

public class CarFactory {
    private HashMap<String, Car> carsList = new HashMap<String, Car>();

    public Car getCar(String type){
        Car car = carsList.get(type);
        if(car == null){
            if (type == "Chevrolet") {
                car = new Chevrolet();
                carsList.put("Chevrolet", car);
                System.out.println("A Chevrolet car was CREATED and saved in memory");

            } else if (type == "Renault") {
                car = new Renault();
                carsList.put("Renault", car);
                System.out.println("A Renault car was CREATED and saved in memory");
            }
        }
        return car;
    }

}
