package game;

import org.junit.Test;

import static game.Result.LOSE;
import static game.Result.TIE;
import static game.Result.WIN;
import static org.junit.Assert.assertEquals;

/**
 * Created by snpilla on 04/11/2017.
 */

public class RockTest {
    @Test
    public void testRockDefeatsScissor() {
        assertEquals(WIN, Gesture.Rock.defeats(Gesture.Scissor));
    }

    @Test
    public void testRockLosesToPaper() {
        assertEquals(LOSE, Gesture.Rock.defeats(Gesture.Paper));
    }

    @Test
    public void testRockTiesWithRock() {
        assertEquals(TIE, Gesture.Rock.defeats(Gesture.Rock));
    }
}
