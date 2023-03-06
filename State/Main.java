package State;

public class Main {
    
    public static void main(String[] args) {
        Pokemon pkmn = new Pokemon();

        while (pkmn.getAika() < 750) {
            pkmn.aantele();
            pkmn.tanssi();
            pkmn.syo();
        }
    }
}
