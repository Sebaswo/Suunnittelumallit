package Observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    @Override
    public void update(Observable o, Object time) {
         System.out.println("Time is: " + time);
    }
}
