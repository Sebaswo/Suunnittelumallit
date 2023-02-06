package Composite;

import java.util.ArrayList;
import java.util.List;

public class Tietokone implements Laiteosa{

    double hinta;
    List<Laiteosa> tietokoneenOsat = new ArrayList<Laiteosa>();

    public double getHinta() {
        for (Laiteosa lo: tietokoneenOsat) {
            this.hinta += lo.getHinta();
        }
        return hinta;
    }

    public void lisääLaite(Laiteosa lisäys) {
        tietokoneenOsat.add(lisäys); 
    }
    
}
