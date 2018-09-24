package com.company.MAin1.Uzdaviniai;

public class Jeep {


    public static void main(String[] spa) {
        String sspalva = "Raudona";
        switch (sspalva) {
            case "Zalia":
                System.out.println("Negrazi spalva");
                break;
            case "Raudona":
                System.out.println("Labai grazi spalva");
                break;
            case "Geltona":
                System.out.println("Megstama spalva");
                break;
                default:
                    System.out.println("Nematau");
        }
    }
}
