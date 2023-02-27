package Decorator;

public class Pizzapohja implements Pizza {

    @Override
    public String getTayte() {
        return "Täytteet ovat: pizzapohja";
    }

    @Override
    public double getHinta() {
        return 2.50;
    }
    
}
