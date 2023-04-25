package Iterator;

import java.util.Iterator;

public class SaieD extends Thread {

    Iterator<Integer> iterator;
    int saieNro;

    public SaieD(Iterator<Integer> iterator, int nro) {
        this.iterator = iterator;
        this.saieNro = nro;
    }
    
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iterator.forEachRemaining((nro) -> System.out.println(nro));
    }
}
