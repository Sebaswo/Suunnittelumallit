package Visitor;

public class Mario extends Pelihahmo {

    public void accept(Vierailija vierailija) {
        vierailija.visit(this);
    }

    public void accept2(Vierailija vierailija) {
        vierailija.visit(this);
    }

    @Override
    public void tee() {
        System.out.println("Mario:");
        tila.tee();
    }
}
