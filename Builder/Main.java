package Builder;

public class Main {
    
    public static void main(String[] args) {

        WaiterDirector waiter = new WaiterDirector();

        HesburgerBuilder hesBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcdBuilder = new McDonaldsBuilder();

        waiter.setBurgerBuilder(hesBuilder);
        waiter.constructBurger();
        System.out.println(hesBuilder.getBurger());

        waiter.setBurgerBuilder(mcdBuilder);
        waiter.constructBurger();
        System.out.println("McDonald's burger ingredients:");
        for (Object ingr : mcdBuilder.getBurger()) {
            System.out.print(ingr);
        }

    }
}
