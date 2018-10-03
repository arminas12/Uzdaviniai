package com.arminas.acprj;

import com.arminas.acprj.model.Asmuo;
import com.arminas.acprj.model.Durys;
import com.arminas.acprj.model.Leidimas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {


    public static void main(String[] args) {

        List<Asmuo> asmenys = new ArrayList<Asmuo>();
        asmenys.add(new Asmuo(15, "Jonas", "spec vyr"));
        asmenys.add(new Asmuo(16, "Jonas", "dir"));
        asmenys.add(new Asmuo(16, "Jonas", "persona non grata"));
        asmenys.add(new Asmuo(53, "Petras", "vadybininkas"));
        asmenys.add(new Asmuo(98, "Kazys", "direktorius"));


        List<Durys> durys = new ArrayList<Durys>();
        durys.add(new Durys(18, "Vidines"));
        durys.add(new Durys(16, "Vip"));
        durys.add(new Durys(20, "Pagrindines"));

        Leidimas leidimas = new Leidimas();
//        leidimas.setAsmuo("Jonas");
//        leidimas.setDurys("Vip");


//        List<Asmuo> asmuoList = asmenys.add();
//
//        Asmuo pvardas = asmenys.get(0);
//
//        List<Asmuo> int Asmuo = asmenys.indexOf(1);

//      Asmuo jonas = new Asmuo();
//        for (Asmuo Jonas : asmenys) {
//            System.out.println();

//        asmenys.add( pvardas );
//
//
//        String[] arr = durys.toArray(new String[2]);

        System.out.println(asmenys);
        System.out.println(durys);


//    }
//
//    public List<Asmuo> getAllAsmenys() {
//        return asmenys;
//    }
//    public Asmuo getBypvardas(String pvardas) {
//        return null;
//    }


//    public Asmuo getBypvardas(String pvardas) {
//        for (Asmuo asmuo : asmenys) {
//            if (asmuo.getPareigos().equals(pvardas)) {
//                return asmuo;
//            }
//

    }

    /*public static void main(String[] args) {

        List<Asmuo> zmones = new ArrayList<Asmuo>();
        zmones.add(new Asmuo("Kaz"));
        zmones.add(new Asmuo("Pas"));
        zmones.add(new Asmuo("Vuu"));
        zmones.add(new Asmuo("Puu"));

        List<Durys> durys = new ArrayList<Durys>();
        durys.add(new Durys("pirmos"));
        durys.add(new Durys("antros"));
        durys.add(new Durys("trecios"));
        durys.add(new Durys("ketvirtos"));




    }*/
}