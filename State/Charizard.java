package State;

public class Charizard extends State {
    
    private static Charizard instance = null;

    private Charizard() {}

    public static Charizard getInstance() {
        if (instance == null) {
            instance = new Charizard();
        }
        return instance;
    }

    public void aantele(Pokemon pkmn) {
        System.out.println("ZZzzzzzZZZzzz");
        pkmn.setAika(pkmn.getAika()+5);
    }

    public void tanssi(Pokemon pkmn) {
        System.out.println("Charizard ei halua tanssia, vaan ottaa nokoset");
        pkmn.setAika(pkmn.getAika()+50);
    }

    public void syo(Pokemon pkmn) {
        System.out.println("Charizard syö kokonaisen joulukinkun");
        pkmn.setAika(pkmn.getAika()+25);
    }
}
