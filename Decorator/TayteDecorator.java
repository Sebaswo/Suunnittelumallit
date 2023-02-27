package Decorator;

public abstract class TayteDecorator implements Pizza {
    protected Pizza pizza;

    public TayteDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTayte() {
        return pizza.getTayte();
    }
    
    public double getHinta() {
        return pizza.getHinta();
    }
}
