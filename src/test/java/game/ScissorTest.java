package game;

import org.junit.Test;

import static game.Result.LOSE;
import static game.Result.TIE;
import static game.Result.WIN;
import static org.junit.Assert.assertEquals;

/**
 * Created by snpilla on 04/11/2017.
 */
public class ScissorTest {

    @Test
    public void testScissorDefeatsPaper() {
        assertEquals(WIN, Gesture.Scissor.defeats(Gesture.Paper));
    }

    @Test
    public void testScissorLosesToRock() {
        assertEquals(LOSE, Gesture.Scissor.defeats(Gesture.Rock));
    }

    @Test
    public void testScissorTiesWithScissor() {
        assertEquals(TIE, Gesture.Scissor.defeats(Gesture.Scissor));
    }
}
