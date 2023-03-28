package Visitor;

public class IsoTila implements Tila {

    @Override
    public void tee() {
        System.out.println("Hahmon tila on iso! Nyt voitetaan!");
    }

    @Override
    public String getTilaNimi() {
        return "iso";
    }
    
}
