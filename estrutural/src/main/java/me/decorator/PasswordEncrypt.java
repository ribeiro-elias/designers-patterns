package me.decorator;

import org.apache.tomcat.util.codec.binary.Base64;

public class PasswordEncrypt implements Password{

    private Password password;

    public PasswordEncrypt(Password password) {
        this.password = password;
    }

    @Override
    public String password() {
        byte[] bytes = Base64.encodeBase64(password.password().getBytes());
        return new String(bytes);
    }
}
