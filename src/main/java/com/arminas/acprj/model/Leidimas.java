package com.arminas.acprj.model;


import java.util.ArrayList;
import java.util.List;

public class Leidimas {

    private boolean aktyvus = true;

    private String pavadinimas;
    private List<Asmuo> asmenys = new ArrayList<>();
    private List<Durys> durys = new ArrayList<>();


    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public boolean isAktyvus() {
        return aktyvus;
    }

    public void setAktyvus(boolean aktyvus) {
        this.aktyvus = aktyvus;
    }

    public List<Asmuo> getAsmenys() {
        return asmenys;
    }


    public List<Durys> getDurys() {
        return durys;
    }


}




