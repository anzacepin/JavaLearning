package com.t1.dz6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Saler extends User{
    public String FileName;

    public Saler(String login, String password, String filename) {
        super(login, password);
        this.FileName = filename;
    }

    public void ShowActiveBuyers(ArrayList<Buyer> buyers)
    {
        Collections.sort(buyers);

        BufferedWriter writer = null;

        try{
            writer = new BufferedWriter(new FileWriter(this.FileName));

            for (Buyer buyer: buyers){
                writer.write(buyer.toString());
                writer.write(System.lineSeparator());
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            if (writer != null){
                try{
                    writer.close();
                }
                catch (IOException e){
                    System.out.println(e);
                }
            }

        }

    }

}
