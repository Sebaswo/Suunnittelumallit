package Singleton;

public class SuomenPresidentti {

    private String nimi;

    private SuomenPresidentti() {
    }

    private static SuomenPresidentti INSTANCE = null;

    public static synchronized SuomenPresidentti getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SuomenPresidentti();
        }
        return INSTANCE;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }
}
