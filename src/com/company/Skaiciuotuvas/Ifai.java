package com.company.Skaiciuotuvas;

public class Ifai {

    /**
     * Parasyt funkcija kuri nustatytu ar yra kelias apskritai?
     *
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     * @param p5
     * @param p6
     * @return
     */

    public String getWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
        boolean w1 = p1 && p2;
        if (w1) {
            return "p1 p2";
        }
        boolean w2 = p4 && p5;
        if (w2) {
            return "p4 && p5";
        }
        boolean w3 = p1 && p3 && p5;
        if (w3) {
            return "p1 && p3 && p5";
        }
        boolean w4 = p4 && p3 && p2;
        if (w4) {
            return "p4 && p3 && p2";
        }
        boolean w5 = p4 && p6 && p2;
        if (w5) {
            return "p4 && p6 && p2";
        }

//        return w1 || w2 || w3 || w4 || w5;
        // kodas cia...

        return "-";

    }
}





