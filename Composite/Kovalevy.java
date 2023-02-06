package Composite;

public class Kovalevy implements Laiteosa {

    double hinta;

    public Kovalevy(double hinta) {
        this.hinta = hinta;
    }

    public double getHinta() {
        return hinta;
    }

    public void lisääLaite(Laiteosa  lisäys) {
        throw new RuntimeException("Ei voi lisätä perusosaa toiseen perusosaan"); 
    }
}
