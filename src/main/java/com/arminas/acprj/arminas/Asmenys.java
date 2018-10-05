package com.arminas.acprj.arminas;

public class Asmenys {
    private int id;
    private String vardas;
    private String pareigos;

    public Asmenys(int id, String vardas, String pareigos) {
        this.id = id;
        this.vardas = vardas;
        this.pareigos = pareigos;
    }
    public Asmenys (){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }
}
