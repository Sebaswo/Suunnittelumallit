package Decorator;

public class Kinkku extends TayteDecorator{

    public Kinkku(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", kinkku";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 1.5;
    }
    
}
