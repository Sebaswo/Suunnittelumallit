package AbstractFactory;

public class BossFactory implements AbstractFactory {
    private String brand = "Boss";

    @Override
    public Cap wearCap() {
        return new Cap(brand);
    }

    @Override
    public Jeans wearJeans() {
        return new Jeans(brand);
    }

    @Override
    public Shoes wearShoes() {
        return new Shoes(brand);
    }

    @Override
    public Tshirt wearTshirt() {
        return new Tshirt(brand);
    }
}
