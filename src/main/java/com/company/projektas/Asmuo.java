package com.company.projektas;

import java.util.ArrayList;
import java.util.List;

public class Asmuo {
    private int id;
    private String pareigos;
    private String vardaspavarde;

    public Asmuo(String pareigos) {

    }


    public static void main(String[] args) {

        List<Asmuo> list1 = new ArrayList<Asmuo>();
        list1.add(new Asmuo("asistentas"));
        list1.add(new Asmuo("darbuotojas"));
        list1.add(new Asmuo("vadovas"));

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
        return vardaspavarde;
    }

    public void setVardaspavarde(String vardaspavarde) {
        this.vardaspavarde = vardaspavarde;
    }
}
