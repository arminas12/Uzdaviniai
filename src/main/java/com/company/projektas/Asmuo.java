package com.company.projektas;

import java.util.ArrayList;
import java.util.List;

public class Asmuo {
    private int id; // 0
    private String pareigos; //null
    private String vardas; // null


    public Asmuo(int pid, String pvardas, String ppareigos) {

        id = pid;
        pareigos = ppareigos;
        vardas = pvardas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public String getVardaspavarde() {
        return vardas;
    }

    public void setVardaspavarde(String vardaspavarde) {
        this.vardas = vardaspavarde;
    }
}
