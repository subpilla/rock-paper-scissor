package game;

import java.util.ArrayList;
import java.util.List;

import static game.Player.PLAYER1;
import static game.Player.PLAYER2;
import static game.Result.WIN;

/**
 * Created by snpilla on 04/11/2017.
 */
public class Game {

    private List<Gesture> gestures = new ArrayList<Gesture>();

    private Gesture player1Gesture;

    private Gesture player2Gesture;

    public Game() {
        gestures.add(Gesture.Rock);
        gestures.add(Gesture.Paper);
        gestures.add(Gesture.Scissor);
    }

    public void player1Gesture(Gesture gesture) {
        this.player1Gesture = gesture;
    }

    public void player2Gesture(Gesture gesture) {
        this.player2Gesture = gesture;
    }

    public Player getWinner() {
        Result result = this.player1Gesture.defeats(this.player2Gesture);
        if (result == WIN)
            return PLAYER1;
        else
            return PLAYER2;
    }

    public boolean isTie() {
        return (this.player1Gesture.defeats(this.player2Gesture) == Result.TIE);
    }

    public List<Gesture> getGestures() {
        return gestures;
    }
}
