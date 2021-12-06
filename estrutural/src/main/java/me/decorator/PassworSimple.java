package me.decorator;

public class PassworSimple implements Password{
    @Override
    public String password() {
        return "password";
    }
}
