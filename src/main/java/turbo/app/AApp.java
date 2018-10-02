package turbo.app;

import turbo.Bandymas.Aprasymas;
import turbo.Paieska;
import turbo.Salyga;


import java.util.List;

public class AApp {
    public static void main(String[] args) {

        Aprasymas Bandymas = new Aprasymas();

        Salyga salyga = new Salyga(Bandymas);

        List<Paieska> paieskas = salyga.getAvailablePaieskaByvardas("Jonas", Bandymas);

        List<Paieska> paieskas1 = salyga.getAvailablePaieskaByiD("1234", Bandymas);


        for (Paieska paieska : paieskas) {
            System.out.println(paieska.getVardas());
        }


        for (Paieska paieska : paieskas1) {
            System.out.println(paieska.getiD());
        }


    }
}
