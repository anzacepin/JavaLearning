package com.t1.dz6;

public abstract class User {
    public String Login;
    private String Password;

    public User (String login, String password){
        this.Login = login;
        this.Password = password;
    }

    public String getPassword() {
        return Password;
    }
}
