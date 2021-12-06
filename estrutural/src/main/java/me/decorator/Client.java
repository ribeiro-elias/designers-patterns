package me.decorator;

public class Client {
    public static void main(String[] args) {
        Password password = new PasswordEncrypt(new PassworSimple());
        System.out.println(password.password());
        PasswordDecoded passwordDecoded = new PasswordDecoded(password);
        System.out.println(passwordDecoded.password());
    }
}
