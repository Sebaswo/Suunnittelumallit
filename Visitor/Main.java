package Visitor;

public class Main {
    public static void main(String[] args) {
        Vierailija lisaaP = new PisteenantoVierailija();
        Tila pieni = new PieniTila();
        Tila iso = new IsoTila();
        Pelihahmo mario = new Mario();
        Pelihahmo luigi = new Luigi();
        mario.setTila(iso);
        luigi.setTila(pieni);
        mario.accept(lisaaP);
        luigi.accept(lisaaP);
        luigi.accept(lisaaP);
        mario.setTila(pieni);
        mario.accept(lisaaP);
    }
}
