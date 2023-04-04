package Adapter;

public class AdapterTranslator implements ITilaus {

    EnglishCafe kahvila;

    public AdapterTranslator (EnglishCafe cafe) {
        this.kahvila = cafe;
    }

    @Override
    public void tilaaKahvi() {
        kahvila.orderCoffee();
    }

    @Override
    public void tilaaTee() {
        kahvila.orderTea();
    }
 
}
