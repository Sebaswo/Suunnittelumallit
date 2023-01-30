package AbstractFactory;

public class Jeans {
    private String brand;

    public Jeans(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Farkut ovat merkkiä: " + this.brand + "\n";
    }
}
