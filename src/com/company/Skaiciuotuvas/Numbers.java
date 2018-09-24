package com.company.Skaiciuotuvas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Numbers {

    public static void main(String[] dsf) {
        Numbers n = new Numbers();
        int[] rez = n.getByOrderInt("4 7 0 3", true);
        System.out.println(Arrays.toString(rez));
    }

    /**
     * @param numbersString - cia kaip PVZ:"3242 43 234234 34 234243423 234 234"
     * @param naturalOrder  - jeigu true: didejimo tvrka, jeigu false: mazejimo
     * @return int tipo masyvas isrikiuotas didejimo / mazejimo tvarka
     */
    public int[] getByOrderInt(String numbersString, boolean naturalOrder) {

////        int Numbers [] = new int[6];
//        int[] Numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int x = 0;
//        int ilgis = Numbers1.length;
//        Numbers1[Numbers1.length - 1] = 0;
////

        return prepareData(numbersString);

    }






































    int metodas(int a) {

        return 0;
    }







     int[] prepareData(String data) {

        String[] skStr = data.split(" ");
        int [] sk = new int [skStr.length];



        //int a = Integer.valueOf("678");




        return null;
    }

}

