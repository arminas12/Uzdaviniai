package com.arminas.acprj.model;

import java.util.ArrayList;
import java.util.List;

public class Asmuo {


    private int id; // 0

private boolean galioja = true;
    private String pareigos; //null
    private String vardas; // null


    public Asmuo(int pid, String pvardas, String ppareigos) {

        id = pid;
        pareigos = ppareigos;
        vardas = pvardas;
    }

    public boolean isGalioja() {
        return galioja;
    }

    public void setGalioja(boolean galioja) {
        this.galioja = galioja;
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
    public String toString(){
return (" Idendifikavimas: " + id +" Pareigos: "+ pareigos + " Vardas: "  + vardas);
    }
}
