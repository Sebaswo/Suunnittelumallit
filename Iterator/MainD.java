package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainD { 
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++) {
            lista.add(i);
        }

        Iterator<Integer> iterator1 = lista.iterator();
        Iterator<Integer> iterator2 = lista.iterator();

        SaieD saie1 = new SaieD(iterator1, 1);
        SaieD saie2 = new SaieD(iterator2, 2);

        saie1.start();
        saie2.start();
        
    }
}
