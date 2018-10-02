package com.company.projektas;

import java.util.ArrayList;
import java.util.List;

public class Leidimas {
    private String asmuo;
    private String durys;

//    private Leidimas(String paradines, String vip) {
//    }
//    public static void main(String[] args, String paradines, String vip) {
//        List<Leidimas> leidzia = new ArrayList<>();
//        leidzia.add(new Leidimas(paradines, vip));
//    }


    public String getAsmuo() {
        return asmuo;
    }

    public void setAsmuo(String asmuo) {
        this.asmuo = asmuo;
    }

    public String getDurys() {
        return durys;
    }

    public void setDurys(String durys) {
        this.durys = durys;
    }
}
