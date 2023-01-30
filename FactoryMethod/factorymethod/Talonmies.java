package factorymethod;

public class Talonmies extends AterioivaOtus{
    
    public Juoma createJuoma() {
        return new Karpalomehu();
    }

    public Ruoka createRuoka() {
        return new Maapahkinavoicurry();
    }

    @Override
    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Ja " + juoma + " kelpaa aina\n");
    }
}
