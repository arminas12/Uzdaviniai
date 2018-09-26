package com.company.projektas;

public class Main {



    public static void main(String args[]) {
        Leidimas leidzia = new Leidimas();
        leidzia.setAsmuo("Jonas");
        leidzia.setDurys("Pagrindines");

        System.out.println("Asmuo:" + leidzia.getAsmuo() + "Durys:" + leidzia.getDurys());
    }
}
