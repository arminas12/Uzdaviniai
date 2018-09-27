package com.company.projektas;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        List<Asmuo> asmenys = new ArrayList<Asmuo>();
        asmenys.add(new Asmuo(15, "vardas", "spec vyr"));
        asmenys.add(new Asmuo(53, "pareigos", ""));
        asmenys.add(new Asmuo(98, "id", ""));


        List<Durys> durys = new ArrayList<Durys>();
        durys.add(new Durys(15, "vardas"));
        durys.add(new Durys(53, "pareigos"));
        durys.add(new Durys(98, "id"));
    }
}

