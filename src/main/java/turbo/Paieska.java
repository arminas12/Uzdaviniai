package turbo;


public class Paieska {

    private String iD;
    private String vardas;
    private String pareigos;
    private int durys;

    private boolean available;

    public Paieska(String iD, String vardas, boolean available) {
        this.iD = iD;
        this.vardas = vardas;
        this.available = available;
//        this.pareigos = pareigos;
//        this.durys = durys;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public int getDurys() {
        return durys;
    }

    public void setDurys(int durys) {
        this.durys = durys;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

