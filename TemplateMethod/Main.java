package TemplateMethod;

public class Main {
    
    public static void main(String[] args) {

        Game snakeLadderGame = new SnakesAndLaddersGame();
        //max players: 4
        snakeLadderGame.playOneGame(3);

    }
}
