package Visitor;

public abstract class Pelihahmo {

    Tila tila;
    int pisteet;

    public Pelihahmo() {
        this.tila = new PieniTila();
    }

    public void setTila(Tila tila) {
        this.tila = tila;
    }

    public String getTila() {
        return tila.getTilaNimi();
    }

    public int getPisteet() {
        return pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    public void tee() {}

    public void accept(Vierailija vierailija) {}
}
