package Visitor;

public class Luigi extends Pelihahmo {

    @Override
    public void tee() {
        System.out.println("Luigi:");
        tila.tee();
    }

    public void accept(Vierailija vierailija) {
        vierailija.visit(this);
    }
}
