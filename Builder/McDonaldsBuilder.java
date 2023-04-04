package Builder;

import java.util.ArrayList;

public class McDonaldsBuilder implements IBurgerBuilder {

    private ArrayList<Object> listBurger;

    @Override
    public void createNewBurger() {
        listBurger = new ArrayList<Object>();
    }

    @Override
    public void buildBun() {
        listBurger.add(new IngrBun("Sesame seed bun\n"));
    }

    @Override
    public void buildPatty() {
        listBurger.add(new IngrPatty("Ground chicken patty\n"));
    }

    @Override
    public void buildLettuce() {
        listBurger.add(new IngrLettuce("Frisée lettuce\n"));
    }

    @Override
    public void buildSauce() {
        listBurger.add(new IngrTomato("Chipotle mayo\n"));
    }

    @Override
    public void buildCheese() {
        listBurger.add(new IngrCheese("Mozarella cheese\n"));
    }

    @Override
    public void buildTomato() {
        listBurger.add(new IngrTomato("Cherry tomatoes\n"));
    }

    @Override
    public void buildOnion() {
        listBurger.add(new IngrOnion("Sweet onion\n"));
    }

    @Override
    public ArrayList<Object> getBurger() {
        return listBurger;
    }
    
}
