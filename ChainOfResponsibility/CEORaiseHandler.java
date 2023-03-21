package ChainOfResponsibility;

public class CEORaiseHandler extends RaiseHandler {

    private final double MAXRAISE = 2.00;
    
    public void handleRaise(RaiseRequest request) {
        if (request.getRaiseAmount() < request.getBaseSalary()*MAXRAISE) {
            System.out.println("The CEO has approved the pay raise of " + request.getRaiseAmount() + " euros.\n");
        } else {
            System.out.println("What a daring request! You just became the new CEO!");
            System.exit(-1);
        }
    }
}