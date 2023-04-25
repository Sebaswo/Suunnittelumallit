package Iterator;

import java.util.Iterator;

public class Saie extends Thread {

    Iterator<Integer> iterator;
    int saieNro;

    public Saie(Iterator<Integer> iterator, int nro) {
        this.iterator = iterator;
        this.saieNro = nro;
    }
    
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(iterator.hasNext()) {
            System.out.println("Säie nro " + saieNro + ": " + iterator.next());
        }
    }
}
