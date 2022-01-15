package me.mediator;

public class Client {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setFan(fan);
        mediator.setButton(button);
        mediator.setPowerSupplier(powerSupplier);


        button.press();
        System.out.println(fan.isOn());
    }
}
