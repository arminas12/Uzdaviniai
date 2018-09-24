package com.company.MAin1.Uzdaviniai;

import java.sql.SQLOutput;

public class Gatve {
    public static void main(String[] gat) {

        Opel automobilis = new Opel();

        Raktas raktelis = new Raktas();


        boolean aratsidare = automobilis.atidarytiDuris(raktelis);
        if (aratsidare) {
            System.out.println("atidare");
        } else {
            System.out.println("neatidare");
        }
        boolean uzsivede = automobilis.uzvesti(raktelis);
        if (uzsivede) {
            System.out.println("uzsivede");
        } else {
            System.out.println("neuzsivede");
        }

        automobilis.atidarytiDuris(raktelis);
    }
}
