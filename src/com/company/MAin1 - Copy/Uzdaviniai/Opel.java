package com.company.MAin1.Uzdaviniai;

public class Opel {
    Spalva spalva;
    int duruSkaicius = 2;
    CarModel modelis = CarModel.Adam;

//   int uzvedimui = 122;

    public boolean uzvesti(Raktas uzvedimui) {
//        if (uzvedimui.getRaktokodas() == 122) {
//            return true;
//        }
//        return false;

        return uzvedimui.getRaktokodas() == 122;
    }


    public boolean atidarytiDuris(Raktas opelRaktas) {

        if (opelRaktas.getRaktokodas() == 122) {
            return true;
        } else {
            return false;
        }

    }
}
