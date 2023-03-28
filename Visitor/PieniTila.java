package Visitor;

public class PieniTila implements Tila{

    @Override
    public void tee() {
        System.out.println("Hahmon tila on pieni! Varo vaaraa!");
    }

    @Override
    public String getTilaNimi() {
        return "pieni";
    }
    
}
