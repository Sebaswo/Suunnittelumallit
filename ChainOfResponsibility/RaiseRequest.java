package ChainOfResponsibility;

public class RaiseRequest {
    
    private double raiseAmount;
    private double baseSalary;

    public RaiseRequest(double raiseAmount, double baseSalary) {
        this.raiseAmount = raiseAmount;
        this.baseSalary = baseSalary;
    }

    public double getRaiseAmount() {
        return raiseAmount;
    }

    public void setRaiseAmount(double a) {
        raiseAmount = a;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
