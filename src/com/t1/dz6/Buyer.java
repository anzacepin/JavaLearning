package com.t1.dz6;

import java.util.UUID;

public class Buyer extends User implements Comparable<Buyer>{
    public String FIO;
    public String Phone;
    public UUID ID;

    public Buyer(String FIO, String login, String password, String phone) {
        super(login, password);
        this.FIO = FIO;
        this.Phone = phone;
        this.ID = UUID.randomUUID();
    }

    @Override
    public int compareTo(Buyer o) {
        return this.FIO.compareTo(o.FIO);
    }

    @Override
    public String toString() {
        return this.FIO + ";" +
                this.Login + ";" +
                this.getPassword() + ";" +
                this.Phone + ";" +
                this.ID.toString() + ";";
    }
}
