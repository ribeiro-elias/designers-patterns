package me.decorator;

public abstract class PasswordDecorator implements Password{
    protected Password password;

    public PasswordDecorator(Password password) {
        this.password = password;
    }

    @Override
    public String password() {
        return password.password();
    }
}
