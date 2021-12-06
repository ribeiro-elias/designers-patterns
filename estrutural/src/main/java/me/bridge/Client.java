package me.bridge;

public class Client {
    public static void main(String[] args) {
        Device radio = new Radio(true, 10, 5);
        AdvancedRemove remote = new AdvancedRemove(radio);
        remote.mute();
        System.out.println(radio.getVolume());
    }
}
