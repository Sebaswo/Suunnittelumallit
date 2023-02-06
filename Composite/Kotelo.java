package Composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

    double hinta;

    List<Laiteosa> koteloLista = new ArrayList<Laiteosa>();

    public Kotelo (double hinta) {
        this.hinta = hinta;
    }

    public void lisääLaite(Laiteosa lisäys) {
        koteloLista.add(lisäys);
    }

    public double getHinta() {
        for (Laiteosa lo: koteloLista){
            this.hinta += lo.getHinta();
        }
        return hinta;
    }
}
