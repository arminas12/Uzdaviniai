package com.company;

public class AritmetineProgresija {

    /**
     * <pre>
     *
     *
     *
     *     2*a + d(n-1)
     * s = ------------------- * n
     *       2
     *
     * </pre>
     */

    public double progresija(double a, double n, double d ) {

        a = a * 2;
        d = d * (n - 1);
        n = ((a + d) / 2) * n;
        return a + d + n;

    }
}
