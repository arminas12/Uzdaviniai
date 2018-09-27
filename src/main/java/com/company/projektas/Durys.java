package com.company.projektas;

public class Durys {
    private int id;
    private String pavadinimas;

    public Durys(String pagrindines) {
        pavadinimas = pagrindines;

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

