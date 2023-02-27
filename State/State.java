package State;

abstract class State {
    
    public void aantele(Pokemon pkmn) {}

    public void tanssi(Pokemon pkmn) {}

    public void syo(Pokemon pkmn) {}

    public void changeState(Pokemon pkmn, State state) {
        pkmn.changeState(state);
    }
}
