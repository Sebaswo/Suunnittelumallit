package Observer;

import java.util.Observable;

public class ClockTimer extends Observable {
    private int hour, minute, second;

    public void tick() {
        second++;
        if (second == 60) {
            minute++;
            second = 0;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
        }}}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setChanged();
        String time = Integer.toString(hour) + ":" + Integer.toString(minute) + ":" + Integer.toString(second);
        notifyObservers(time); 
    }
}
