package Command;

public class Main {
    
    public static void main(String[] args) {
        
        Screen screen = new Screen();
        Command up = new ScreenUpCommand(screen);
        Command down = new ScreenDownCommand(screen);
        WallButton upBtn = new WallButton(up);
        WallButton downBtn = new WallButton(down);

        upBtn.push();
        downBtn.push();
    }
}
