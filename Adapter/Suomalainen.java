package Adapter;

public class Suomalainen implements ITilaus {

    @Override
    public void tilaaKahvi() {
        System.out.println("Yks kahvi!\nMutta myyjä ei ymmärrä..\n");
    }

    @Override
    public void tilaaTee() {
        System.out.println("Teetä ottasin kans!\nMutta myyjä ei ymmärrä..\n");
    }
    
}
