package com.t1.dz6;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public abstract class User {
    public String Login;
    private String Password;

    public User (String login, String password){
        this.Login = login;
        this.Password = CalculateMD5(password);
    }

    private String CalculateMD5(String inputtext) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(inputtext.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            return Base64.getEncoder().encodeToString(digest);
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("Не могу вычислить MD5" + System.lineSeparator());
            System.out.println(e);
            return "";
        }
    }

    public boolean CheckPassword(String password) {
        return this.Password.equals(CalculateMD5(password));
    }
}
