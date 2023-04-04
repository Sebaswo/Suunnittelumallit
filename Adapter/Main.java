package Adapter;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Suomalainen ei osaa englantia, mutta hänellä on onneksi tulkki mukana.\n" + 
                            "He menevät Lontoolaiseen kahvilaan.\n");

        Suomalainen suomalainen = new Suomalainen();

        suomalainen.tilaaKahvi();
        suomalainen.tilaaTee();

        System.out.println("Onneksi tulkki auttaa!\n");

        ITilaus tilaus = new AdapterTranslator(new EnglishCafe());

        tilaus.tilaaTee();
        tilaus.tilaaKahvi();
        
    }
}
