package com.arminas.acprj.arminas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AsmenuKazkas {

    private static Map<Integer, Asmenys> asmenyss;

    static {
        asmenyss = new HashMap<Integer, Asmenys>() {
            {
                put(1, new Asmenys(123, "Jonas", "Vip"));
                put(2, new Asmenys(234, "Petras", "Virsininkas"));
                put(3, new Asmenys(345, "Maja", "Specialistas"));
            }
        };
    }


    public Collection<Asmenys> getAllAsmenys() {
        return this.asmenyss.values();
    }

    public Asmenys getAsmenysById(int id) {
        return this.asmenyss.get(id);
    }

}
