package com.company.Sultys;

import com.company.AritmetineProgresija;

public class App {
    public static void main(String[] args) {


        AritmetineProgresija y = new AritmetineProgresija();

        //double rez = 5454.7;
        double rez = y.progresija(4, 6, 7);


        System.out.println(rez);
        // System.out.println(new AritmetineProgresija().progresija(2, 6, 9));
    }
}
