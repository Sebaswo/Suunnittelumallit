package Decorator;

public class Jauheliha extends TayteDecorator {
    
    public Jauheliha(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", jauheliha";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 1.5;
    }
}