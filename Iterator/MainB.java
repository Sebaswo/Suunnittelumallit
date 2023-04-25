package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainB {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++) {
            lista.add(i);
        }

        Iterator<Integer> iterator3 = lista.iterator();
        
        Saie saie3 = new Saie(iterator3, 3);
        Saie saie4 = new Saie(iterator3, 4);

        saie3.start();
        saie4.start();
    }
}
