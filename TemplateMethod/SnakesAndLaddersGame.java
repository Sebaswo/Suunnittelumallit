package TemplateMethod;

import java.util.Random;

public class SnakesAndLaddersGame extends Game {

    Random rndm = new Random();
    boolean end = false;
    int position1 = 0;
    int position2 = 0;
    int position3 = 0;
    int position4 = 0;
    int winner;

    @Override
    void initializeGame() {
        System.out.println("This is the Snakes and Ladders game for up to 4 people!\nRoll the dice and hope you land on the ladder tiles to climb faster!\n" +
        "But beware of the snake tiles or you might end up losing the game!\nFirst player to reach the 100th tile WINS!\n" + 
        "We have " + super.playersCount + " players competing!");
        if (super.playersCount > 4) {
            System.out.println("Too many players!");
            System.exit(0);
        }
    }

    @Override
    void makePlay(int player) {

        int roll = rndm.nextInt(6)+1;
        player += 1;

        switch (player) {
            case 1:
                position1 += roll;
                position1 = checkLadderAndSnake(position1);
                System.out.println("Player " + (player) + " rolled the dice and got a " + roll + ". They move to position " + position1);
                checkWin(position1, player);
                break;
            case 2:
                position2 += roll;
                position2 = checkLadderAndSnake(position2);
                System.out.println("Player " + (player) + " rolled the dice and got a " + roll + ". They move to position " + position2);
                checkWin(position2, player);
                break;
            case 3:
                position3 += roll;
                position3 = checkLadderAndSnake(position3);
                System.out.println("Player " + (player) + " rolled the dice and got a " + roll + ". They move to position " + position3);
                checkWin(position3, player);
                break;
            case 4:
                position4 += roll;
                position4 = checkLadderAndSnake(position4);
                System.out.println("Player " + (player) + " rolled the dice and got a " + roll + ". They move to position " + position4);
                checkWin(position4, player);
                break;
        }
    }

    int checkLadderAndSnake(int pos) {
        switch (pos) {
            //Ladders:
            case 1:
                System.out.println("\nLADDER! Lucky!");
                return 38;
            case 4:
                System.out.println("\nLADDER! Lucky!");
                return 14;
            case 8:
                System.out.println("\nLADDER! Lucky!");
                return 30;
            case 21:
                System.out.println("\nLADDER! Lucky!");
                return 42;
            case 28:
                System.out.println("\nLADDER! Lucky!");
                return 76;
            case 50:
                System.out.println("\nLADDER! Lucky!");
                return 67;
            case 71:
                System.out.println("\nLADDER! Lucky!");
                return 92;
            case 80:
                System.out.println("\nLADDER! Lucky!");
                return 99;
            //Snakes:
            case 32:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 10;
            case 36:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 6;
            case 48:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 26;
            case 62:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 18;
            case 88:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 24;
            case 95:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 56;
            case 97:
                System.out.println("\nSnaake! A Snaake! Ooh, it's a snake!");
                return 78;
            default:
                return pos;
        }
    }

    void checkWin(int pos, int player) {
        if (pos >= 100) {
            end = true;
            winner = player;
        }
    }

    @Override
    boolean endOfGame() {
        if (!end) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    void printWinner() {
        System.out.println("Congratulations player " + winner + "! You are the luckiest!");
    }
    
}
