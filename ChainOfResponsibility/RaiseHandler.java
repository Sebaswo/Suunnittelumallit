package ChainOfResponsibility;

public abstract class RaiseHandler {
    
    private RaiseHandler nextHandler;

    public void setNextRaiseHandler (RaiseHandler handler) {
        this.nextHandler = handler;
    }

    public void handleRaise(RaiseRequest request) {
        if (nextHandler != null) {
            nextHandler.handleRaise(request);
        }
    }
}
