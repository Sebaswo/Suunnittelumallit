package AbstractFactory;

public class Person {
    private AbstractFactory factory;
    private Cap cap;
    private Jeans jeans;
    private Shoes shoes;
    private Tshirt tshirt;

/*text */
    public Person(AbstractFactory factory) {
        this.factory = factory;
    }

    public void getDressed() {
        this.cap = factory.wearCap();
        this.jeans = factory.wearJeans();
        this.shoes = factory.wearShoes();
        this.tshirt = factory.wearTshirt();
    }

    @Override
    public String toString() {
        return "Asuni on nyt:\n" + cap.toString() + jeans.toString() + shoes.toString() + tshirt.toString();
    }
}
