package me.decorator;

import org.apache.tomcat.util.codec.binary.Base64;

public class PasswordDecoded implements Password{

    private Password password;

    public PasswordDecoded(Password password) {
        this.password = password;
    }

    @Override
    public String password() {
        byte[] bytes = Base64.decodeBase64(password.password().getBytes());
        return new String(bytes);
    }
}
