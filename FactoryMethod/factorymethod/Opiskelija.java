package factorymethod;

public class Opiskelija extends AterioivaOtus {
    
    public Juoma createJuoma() {
        return new Kahvi();
    }

    public Ruoka createRuoka() {
        return new Kaalipata();
    }

    @Override
    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Ruoan jälkeen " + juoma + " virkistää hyvin\n");
    }
}
