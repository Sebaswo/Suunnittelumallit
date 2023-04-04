package Builder;

public class WaiterDirector {
    private IBurgerBuilder burgerBuilder;

    public void setBurgerBuilder(IBurgerBuilder bb) {
        burgerBuilder = bb;
    }

    public void constructBurger() {
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildOnion();
        burgerBuilder.buildLettuce();
        burgerBuilder.buildSauce();
        burgerBuilder.buildTomato();
    }
}
