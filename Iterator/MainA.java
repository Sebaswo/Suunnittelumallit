package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainA { 
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++) {
            lista.add(i);
        }

        Iterator<Integer> iterator1 = lista.iterator();
        Iterator<Integer> iterator2 = lista.iterator();

        Saie saie1 = new Saie(iterator1, 1);
        Saie saie2 = new Saie(iterator2, 2);

        saie1.start();
        saie2.start();
        
    }
}
