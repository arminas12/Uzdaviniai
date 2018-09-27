package com.company.projektas;

public class Durys {
    private int id;
    private String pavadinimas;

    public Durys(int idd, String dpavadinimas) {

        id = idd;
        pavadinimas = dpavadinimas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}

