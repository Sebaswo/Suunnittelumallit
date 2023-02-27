package State;

public class Charmander extends State {
    
    private static Charmander instance = null;

    private Charmander() {}

    public static Charmander getInstance() {
        if (instance == null) {
            instance = new Charmander();
        }
        return instance;
    }

    public void aantele(Pokemon pkmn) {
        System.out.println("Chaaaaarmander!");
        pkmn.setAika(pkmn.getAika()+5);

        if (pkmn.getAika() > 200) {
            changeState(pkmn, Charmeleon.getInstance());
            System.out.println("\nCharmander kehittyi Charmeleoniksi!\n");
        }
    }

    public void tanssi(Pokemon pkmn) {
        System.out.println("Charmander tanssii macarenaa");
        pkmn.setAika(pkmn.getAika()+50);

        if (pkmn.getAika() > 200) {
            changeState(pkmn, Charmeleon.getInstance());
            System.out.println("\nCharmander kehittyi Charmeleoniksi!\n");
        }
    }

    public void syo(Pokemon pkmn) {
        System.out.println("Charmanderille maistuu jäätelö!");
        pkmn.setAika(pkmn.getAika()+25);
        
        if (pkmn.getAika() > 200) {
            changeState(pkmn, Charmeleon.getInstance());
            System.out.println("\nCharmander kehittyi Charmeleoniksi!\n");
        }
    }
}
