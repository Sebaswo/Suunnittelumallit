package Observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClockTimer observable = new ClockTimer();
        DigitalClock observer = new DigitalClock();
        observable.addObserver(observer);
        
        while(true) {
            observable.tick();
        }
    }
    
}
