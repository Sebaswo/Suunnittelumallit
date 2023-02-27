package Decorator;

public class Broileri extends TayteDecorator {
    
    public Broileri(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTayte() {
        return super.getTayte() + ", paahdettu broileri";
    }

    @Override
    public double getHinta() {
        return super.getHinta() + 2.25;
    }
}