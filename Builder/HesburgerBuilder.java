package Builder;

public class HesburgerBuilder implements IBurgerBuilder {

    StringBuilder stringBurger;

    @Override
    public void createNewBurger() {
        stringBurger = new StringBuilder();
    }

    @Override
    public void buildBun() {
        stringBurger.append("Brioche bun\n");
    }

    @Override
    public void buildPatty() {
        stringBurger.append("Ground beef patty\n");
    }

    @Override
    public void buildLettuce() {
        stringBurger.append("Romaine lettuce\n");
    }

    @Override
    public void buildSauce() {
        stringBurger.append("Smoky sweet barbecue sauce\n");
    }

    @Override
    public void buildCheese() {
        stringBurger.append("Aged cheddar\n");
    }

    @Override
    public void buildTomato() {
        stringBurger.append("Beefsteak tomato\n");
    }

    @Override
    public void buildOnion() {
        stringBurger.append("Red onion\n");
    }

    @Override
    public Object getBurger() {
        return "Hesburger burger ingredients:\n" + stringBurger;
    }
    
}
