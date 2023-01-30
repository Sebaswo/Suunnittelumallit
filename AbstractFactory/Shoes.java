package AbstractFactory;

public class Shoes {
    private String brand;

    public Shoes(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Kengät ovat merkkiä: " + this.brand + "\n";
    }
}
