package com.arminas.acprj.arminas;

public class DuruKontrole {

    public static void main(String[] args) {

        DuruStatusas priekines = new DuruStatusas("Priekines", "open");
        DuruStatusas vidines = new DuruStatusas("Vidines", "closed");
        DuruStatusas galines = new DuruStatusas("Galines", "closed");


        if (priekines.statusas.equals("open")) {
            priekines.close();

            System.out.println(priekines.israsymas());
        }
        if(vidines.statusas.equals("closed")) {
            vidines.open();
        }
        System.out.println(vidines.israsymas());

        if(galines.statusas.equals("closed")){
            galines.open();
        }
        System.out.println(galines.israsymas());
    }
}