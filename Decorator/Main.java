package Decorator;

public class Main {
    
    public static void main(String[] args) {

        Pizza americano = new Ananas(new Aurajuusto(new Kinkku(new Juusto(new Pizzapohja()))));
        System.out.println("Americano:");
        System.out.println(americano.getTayte());
        System.out.println("Hinta: " + americano.getHinta() + " euroa\n");

        Pizza dillinger = new Sipuli(new Jauheliha(new Kinkku(new Salami(new Juusto(new Pizzapohja())))));
        System.out.println("Dillinger:");
        System.out.println(dillinger.getTayte());
        System.out.println("Hinta: " + dillinger.getHinta() + " euroa\n");

        Pizza chickenhawaii = new Aurajuusto(new Ananas(new Broileri(new Juusto(new Pizzapohja()))));
        System.out.println("Chicken Hawaii:");
        System.out.println(chickenhawaii.getTayte());
        System.out.println("Hinta: " + chickenhawaii.getHinta() + " euroa");
    }
}
