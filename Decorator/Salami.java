package Decorator;

public class Salami extends TayteDecorator {
    
    public Salami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", salami";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 1.5;
    }
}