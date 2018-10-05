package com.arminas.acprj.arminas;

public class Kkontrole {

    public static void main(String[] args) {

        Paprasta priekines = new Paprasta("Priekines", "open");
        Paprasta vidines = new Paprasta("Vidines", "closed");
        Paprasta galines = new Paprasta("Galines", "closed");


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