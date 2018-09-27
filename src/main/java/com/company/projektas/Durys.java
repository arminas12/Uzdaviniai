package com.company.projektas;

public class Durys {
    private int id;
    private String ppavadinimas;

    public Durys(int idd, String dpavadinimas) {

        id = idd;
        ppavadinimas = dpavadinimas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return ppavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.ppavadinimas = pavadinimas;



        }
        public String toString () {
            return (" Idendifikavimas: " + id + " Pareigos: " + ppavadinimas);
    }
}
