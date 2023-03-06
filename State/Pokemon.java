package State;

public class Pokemon {
    private State state;
    private int aika = 0;

    public Pokemon() {
        state = Charmander.getInstance();
    }

    public void aantele() {
        state.aantele(this);
    }

    public void tanssi() {
        state.tanssi(this);
    }

    public void syo() {
        state.syo(this);
    }

    protected void changeState(State s) {
        state = s;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }
}
