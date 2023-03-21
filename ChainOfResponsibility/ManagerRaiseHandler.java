package ChainOfResponsibility;

public class ManagerRaiseHandler extends RaiseHandler {
    
    private final double MAXRAISE = 0.02;

    public void handleRaise(RaiseRequest request) {
        if (request.getRaiseAmount() < request.getBaseSalary()*MAXRAISE) {
            System.out.println("The Manager has approved the pay raise of " + request.getRaiseAmount() + " euros.\n");
        } else {
            System.out.println("Too big of a decision for the Manager.");
            super.handleRaise(request);
        }
    }
}
