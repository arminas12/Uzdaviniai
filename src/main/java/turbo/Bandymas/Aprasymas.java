package turbo.Bandymas;

import java.util.ArrayList;
import java.util.List;

import turbo.Paieska;

public class Aprasymas implements Iden {

    private List<Paieska> paieskas = new ArrayList<>();

    {
        paieskas.add(new Paieska("1234", "Jonas",true));
        paieskas.add(new Paieska("1345", "Petras", true));
        paieskas.add(new Paieska("2589", "Kazys", true));
        paieskas.add(new Paieska("1478", "Jonas1", false));
        paieskas.add(new Paieska("3214", "Petras1", true));
        paieskas.add(new Paieska("1596", "Kazys1", true));
        paieskas.add(new Paieska("6547", "Jonas2", false));
        paieskas.add(new Paieska("9632", "Petras2", true));
        paieskas.add(new Paieska("4321", "Kazys2", true));
    }

    public List<Paieska> getAllPaieskas() {
        return paieskas;
    }

    public Paieska getByiD(String iD) {
        for (Paieska paieska : paieskas) {
            if (paieska.getiD().equals(iD)) {
                return paieska;
            }
        }

        return null;
    }

    public List<Paieska> searchBy(boolean available) {
        List<Paieska> result = new ArrayList<>();
        for (Paieska paieska : paieskas) {
            if (paieska.isAvailable() == available) {
                result.add(paieska);
            }
        }
        return result;
    }
}

