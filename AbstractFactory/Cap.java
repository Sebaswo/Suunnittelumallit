package AbstractFactory;

public class Cap {
    private String brand;

    public Cap(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Housut ovat merkkiä: " + this.brand + "\n";
    }
}
