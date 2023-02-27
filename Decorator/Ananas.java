package Decorator;

public class Ananas extends TayteDecorator {
    
    public Ananas(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", ananas";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 1.75;
    }
}