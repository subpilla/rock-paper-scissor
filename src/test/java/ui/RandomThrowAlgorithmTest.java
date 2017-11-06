package ui;

import game.Gesture;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by snpilla on 04/11/2017.
 */
public class RandomThrowAlgorithmTest {

    List<Gesture> gestures = Arrays.<Gesture> asList(Gesture.Scissor, Gesture.Rock, Gesture.Paper);

    @Test
    public void shouldHaveChosenAllGestures() {
        Set<Gesture> result = new HashSet<Gesture>();
        for (int i = 0; i < 1000; i++) {
            result.add(new RandomThrowAlgorithm(gestures)._throw());
        }
        assertEquals(3, result.size());
    }
}
