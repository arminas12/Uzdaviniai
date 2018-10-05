package com.arminas.acprj.arminas;

public class Paprasta {
    String vardas;
    String statusas;

    public Paprasta(String vardas, String statusas) {
        this.vardas = vardas;
        this.statusas = statusas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getStatusas() {
        return statusas;
    }

    public String statusas() {
        return statusas();
    }

    public void setStatusas(String statusas) {
        this.statusas = statusas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String vardas() {
        return vardas;
    }


    public void open() {

        statusas = "open";
    }


    public void close() {

        statusas = "closed";

    }

    public String israsymas() {
        return "Dooru vardas: " + vardas + "Statusas duru: " + statusas;

    }
}

