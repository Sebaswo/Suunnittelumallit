package Decorator;

public class Juusto extends TayteDecorator {
    
    public Juusto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", juusto";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 1.5;
    }
}
