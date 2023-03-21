package Memento;

import java.util.Random;

public class Arvuuttaja {

    private Random rndm = new Random();

    public Object liityPeliin() {
        int randLuku = rndm.nextInt(10)+1;
        return new Memento(randLuku);
    }

    public boolean vertaaLukuja(Object obj, int arvattuLuku) {
        Memento memento = (Memento) obj;
        if (arvattuLuku == memento.getLuku()) {
            return true;
        }
        return false;
    }

    private class Memento {
        private int luku;

        public Memento(int luku) {
            this.luku = luku;
        }

        public int getLuku() {
            return luku;
        }
    }
}
