package ChainOfResponsibility;

public class DeptHeadRaiseHandler extends RaiseHandler {
    
    private final double MAXRAISE = 0.05;

    public void handleRaise(RaiseRequest request) {
        if (request.getRaiseAmount() < request.getBaseSalary()*MAXRAISE) {
            System.out.println("The Department Head has approved the pay raise of " + request.getRaiseAmount() + " euros.\n");
        } else {
            System.out.println("Too big of a decision for the Department Head.");
            super.handleRaise(request);
        }
    }
}