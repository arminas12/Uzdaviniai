package turbo.Bandymas;

import turbo.Paieska;

import java.util.List;

public interface Iden {

    public List<Paieska> getAllPaieskas();

    public Paieska getByiD(String iD);

    public List<Paieska> searchBy(boolean available);


}
