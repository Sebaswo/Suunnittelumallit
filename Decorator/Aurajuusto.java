package Decorator;

public class Aurajuusto extends TayteDecorator {
    
    public Aurajuusto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", aurajuusto";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 2.25;
    }
}