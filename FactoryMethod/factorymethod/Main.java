package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus talonmies = new Talonmies();
        opettaja.aterioi();
        opiskelija.aterioi();
        talonmies.aterioi();
    }
}
