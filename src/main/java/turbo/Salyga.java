package turbo;

import turbo.Bandymas.Aprasymas;
import turbo.Bandymas.Iden;

import java.util.ArrayList;
import java.util.List;

public class Salyga {


    private Iden iden;

    public Salyga(Iden iden) {
        this.iden = iden;
    }

    public List<Paieska> getAvailablePaieskaByvardas(String vardas, Aprasymas Bandymas) {
        List<Paieska> result = new ArrayList<>();
        for (Paieska paieska : Bandymas.searchBy(true)) {

            if (tikrina(paieska, vardas)) {
                result.add(paieska);
            }
        }
        return result;
    }

    boolean tikrina(Paieska paieska, String vardas) {
        boolean tikrina = paieska.getVardas().toLowerCase().contains(vardas.toLowerCase());
        return tikrina && paieska.isAvailable();

    }


    public List<Paieska> getAvailablePaieskaByiD(String iD, Aprasymas Bandymas) {
        List<Paieska> result = new ArrayList<>();
        for (Paieska paieska : Bandymas.searchBy(true)) {

            if (fff(paieska, iD)) {
                result.add(paieska);
            }
        }
        return result;
    }

    boolean fff(Paieska paieska, String iD) {
        boolean ttikrina = paieska.getiD().toLowerCase().contains(iD.toLowerCase());
        return ttikrina && paieska.isAvailable();

    }


}
