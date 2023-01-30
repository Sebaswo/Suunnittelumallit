package AbstractFactory;

public class Tshirt {
    private String brand;

    public Tshirt(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "T-paita on merkkiä: " + this.brand + "\n";
    }
}
