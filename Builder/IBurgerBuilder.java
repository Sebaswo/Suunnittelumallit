package Builder;

public interface IBurgerBuilder {
    
    public abstract void createNewBurger();
    
    public abstract void buildBun();
    public abstract void buildPatty();
    public abstract void buildLettuce();
    public abstract void buildSauce();
    public abstract void buildCheese();
    public abstract void buildTomato();
    public abstract void buildOnion();

    public abstract Object getBurger();
}
