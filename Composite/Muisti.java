package Composite;

public class Muisti implements Laiteosa {

    double hinta;

    public Muisti(double hinta) {
        this.hinta = hinta;
    }

    public double getHinta() {
        return hinta;
    }

    public void lisääLaite(Laiteosa  lisäys) {
        throw new RuntimeException("Ei voi lisätä perusosaa toiseen perusosaan"); 
    }
}
