package ui;

import game.Gesture;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

/**
 * Created by snpilla on 04/11/2017.
 */
public class RandomThrowAlgorithm implements ThrowAlgorithm {

    private final List<Gesture> gestures;

    public RandomThrowAlgorithm(List<Gesture> gestures) {
        this.gestures = gestures;
    }

    public Gesture _throw() {
        List<Gesture> gestures = new ArrayList<Gesture>(this.gestures);
        shuffle(gestures);
        return gestures.get(0);
    }
}
