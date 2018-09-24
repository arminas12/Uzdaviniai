package com.company.Skaiciuotuvas;

public class converter {


    /**
     * 0 bytes ...; 1kb ... ; 1Mb... 1Gb ... ; 1Tb and more;
     * <p>
     * Vienas skaicius po kablelio.
     * Maziau uz 1 Mb neberodom kablelio is vis.
     *
     * <pre>
     * Example:
     *  1,3Gb           // <- Acceptable   (1,39  ~= 1,3)
     *  893Kb        // <- Acceptable
     *  1Gb and 312Mb and ...//  <- Not acceptable
     * </pre>
     */
    public String convertToHumanReadable(long sizeInBytes) {
        // code should be here ...

        return "";
    }
}
