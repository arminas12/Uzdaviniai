package com.arminas.acprj.arminas;

public class Paprasta {

    //    String vardas;
//    String statusas;
//
//    public Paprasta(String vardas, String statusas) {
//        this.vardas = vardas;
//        this.statusas = statusas;
//    }
//
//    public String getVardas() {
//        return vardas;
//    }
//
//    public String getStatusas() {
//        return statusas;
//    }
//
//    public String statusas() {
//        return statusas();
//    }
//
//    public void setStatusas(String statusas) {
//        this.statusas = statusas;
//    }
//
//    public void setVardas(String vardas) {
//        this.vardas = vardas;
//    }
//
//    public String vardas() {
//        return vardas;
//    }
//
//
//    public void open() {
//
//        statusas = "open";
//    }
//
//
//    public void close() {
//
//        statusas = "closed";
//
//    }
//
//    public String israsymas() {
//        return "Dooru vardas: " +  vardas + " Statusas duru: " + statusas;
//
//    }

    public String statusas;


    private String vardas;
    private boolean atidaryta;


    public Paprasta(String vardas, boolean atidaryta) {
        this.vardas = vardas;
        this.atidaryta = atidaryta;
    }


    public Paprasta(String vardas, String open) {

    }


    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setAtidaryta(boolean atidaryta) {
        this.atidaryta = atidaryta;
    }

    public void open() {

        atidaryta = true;
    }

    public void close() {

        atidaryta = false;

    }


    public String israsymas() {
        return "Dooru vardas: " + vardas + " Statusas duru: " + statusas;

    }


    public String statusas() {
        if (atidaryta)
            return "open";
        else
            return "closed";
    }
}

