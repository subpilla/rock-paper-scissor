package ui;

import game.Game;
import game.Gesture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static game.Player.PLAYER1;
import static ui.RockPaperScissor.GameMode.HUMAN_COMPUTER;

/**
 * Created by snpilla on 04/11/2017.
 */
public class RockPaperScissor {

    enum GameMode {
        HUMAN_COMPUTER, COMPUTER_COMPUTER
    }

    private Player player1;
    private Player player2;
    private Gesture player1Gesture;
    private Gesture player2Gesture;
    private GameMode mode = HUMAN_COMPUTER;

    public static void main(String[] args) throws IOException {
        new RockPaperScissor().game();
    }

    private void game() throws IOException {
        while (true) {
            printMenu();
            readOption();
            changeMode();
        }
    }

    private void changeMode() {
        if (mode == HUMAN_COMPUTER) {
            mode = GameMode.COMPUTER_COMPUTER;
        } else {
            mode = HUMAN_COMPUTER;
        }
    }

    private void play() {
        Game game = new Game();
        createPlayers(game.getGestures());
        _throw();
        game.player1Gesture(player1Gesture);
        game.player2Gesture(player2Gesture);
        if (game.isTie()) {
            System.out.println("Game has tied");
        } else {
            System.out.println(getWinner(game) + " has won");
        }
    }

    private Player getWinner(Game game) {
        return game.getWinner() == PLAYER1 ? player1 : player2;
    }

    private void printGesturesChosen() {
        System.out.println(player1 + " has chosen " + this.player1Gesture);
        System.out.println(player2 + " has chosen " + this.player2Gesture);
    }

    private void _throw() {
        this.player1Gesture = player1._throw();
        this.player2Gesture = player2._throw();
        printGesturesChosen();
    }

    private void createPlayers(List<Gesture> gestures) {
        if (mode == HUMAN_COMPUTER) {
            this.player1 = new Human(gestures);
            this.player2 = new Computer(gestures);
        } else {
            this.player1 = new Computer(gestures, "Computer 1");
            this.player2 = new Computer(gestures, "Computer 2");
        }
    }

    private void readOption() throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String option = bis.readLine();
        if (option.toLowerCase().startsWith("n")) {
            System.exit(0);
        }
        play();
    }

    private void printMenu() {
        System.out.println("Continuing mode, " + mode + " . Do you want to continue playing (y/n) ? ");
    }
}
