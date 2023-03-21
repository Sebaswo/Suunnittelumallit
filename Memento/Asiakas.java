package Memento;

import java.util.Random;

public class Asiakas extends Thread{
    private Arvuuttaja arvuuttaja;
    private Object memento;
    private Random rndm = new Random();
    private int pelaajanro;

    public Asiakas(int nro, Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.pelaajanro = nro;
    }

    public void liityPeliin() {
        this.memento = arvuuttaja.liityPeliin();
    }

    public synchronized boolean arvaa() {
        return arvuuttaja.vertaaLukuja(memento, (rndm.nextInt(10)+1));
    }

    public void run() {
        boolean loppu = false;
        liityPeliin();
        while(!loppu) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (arvaa() == true) {
                System.out.println("Pelaaja " + pelaajanro + " arvasi OIKEIN!");
                loppu = true;
            } else {
                System.out.println("Pelaaja " + pelaajanro + " arvasi väärin!");
            }
        }
    }
}
