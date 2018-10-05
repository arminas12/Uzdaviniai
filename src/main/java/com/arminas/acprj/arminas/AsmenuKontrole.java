package com.arminas.acprj.arminas;

import java.util.Collection;

public class AsmenuKontrole {

    private AsmenuKazkas asmenuKazkas;


    public Collection<Asmenys> getAllAsmenys(){
        return this.asmenuKazkas.getAllAsmenys();
    }
    public Asmenys getAsmenysById (int id){
        return this.asmenuKazkas.getAsmenysById(id);
    }

}

