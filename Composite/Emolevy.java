package Composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
    
    double hinta;
    List<Laiteosa> emolevyLista = new ArrayList<Laiteosa>();
    
    public Emolevy(double hinta) {
        this.hinta = hinta;
    }

    public double getHinta() {
        for (Laiteosa lo: emolevyLista) {
            this.hinta += lo.getHinta();
        }
        return hinta;
    }

    public void lisääLaite(Laiteosa  lisäys) {
        emolevyLista.add(lisäys);
    }
    
}
