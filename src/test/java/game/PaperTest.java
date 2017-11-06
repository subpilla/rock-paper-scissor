package game;

import org.junit.Test;

import static game.Result.LOSE;
import static game.Result.TIE;
import static game.Result.WIN;
import static org.junit.Assert.assertEquals;

/**
 * Created by snpilla on 04/11/2017.
 */
public class PaperTest {

    @Test
    public void testPaperDefeatsRock() {
        assertEquals(WIN, Gesture.Paper.defeats(Gesture.Rock));
    }

    @Test
    public void testPaperLosesToScissor() {
        assertEquals(LOSE, Gesture.Paper.defeats(Gesture.Scissor));
    }

    @Test
    public void testPaperTiesWithPaper() {
        assertEquals(TIE, Gesture.Paper.defeats(Gesture.Paper));
    }
}
