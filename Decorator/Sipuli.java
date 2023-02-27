package Decorator;

public class Sipuli extends TayteDecorator {
    
    public Sipuli(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", sipuli";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 1.20;
    }
}
