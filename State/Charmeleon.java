package State;

public class Charmeleon extends State {
    
    private static Charmeleon instance = null;

    private Charmeleon() {}

    public static Charmeleon getInstance() {
        if (instance == null) {
            instance = new Charmeleon();
        }
        return instance;
    }

    public void aantele(Pokemon pkmn) {
        System.out.println("Char! Charmeleon!");
        pkmn.setAika(pkmn.getAika()+5);

        if (pkmn.getAika() > 500) {
            changeState(pkmn, Charizard.getInstance());
            System.out.println("\nCharmeleon kehittyi Charizardiksi!\n");
        }
    }

    public void tanssi(Pokemon pkmn) {
        System.out.println("Charmeleon breakdancee, vau!");
        pkmn.setAika(pkmn.getAika()+50);

        if (pkmn.getAika() > 500) {
            changeState(pkmn, Charizard.getInstance());
            System.out.println("\nCharmeleon kehittyi Charizardiksi!\n");
        }
    }

    public void syo(Pokemon pkmn) {
        System.out.println("Charmeleon maiskuttaa sushia");
        pkmn.setAika(pkmn.getAika()+25);
        
        if (pkmn.getAika() > 500) {
            changeState(pkmn, Charizard.getInstance());
            System.out.println("\nCharmeleon kehittyi Charizardiksi!\n");
        }
    }
}
