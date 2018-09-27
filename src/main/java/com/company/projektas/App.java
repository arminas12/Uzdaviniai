package com.company.projektas;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        List<Asmuo> asmenys = new ArrayList<Asmuo>();
        asmenys.add(new Asmuo(15, "Jonas", "spec vyr"));
        asmenys.add(new Asmuo(53, "Petras", "vadybininkas"));
        asmenys.add(new Asmuo(98, "Kazys", "direktorius"));


        List<Durys> durys = new ArrayList<Durys>();
        durys.add(new Durys(18, "Vidines"));
        durys.add(new Durys(16, "Vip"));
        durys.add(new Durys(20, "Pagrindines"));


System.out.println(asmenys);
System.out.println(durys);
    }
}

