package game;

import org.junit.Test;

import static game.Player.PLAYER1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by snpilla on 04/11/2017.
 */
public class GameTest {

    @Test
    public void testRockDefeatsScissor() {
        Game game = new Game();
        game.player1Gesture(Gesture.Rock);
        game.player2Gesture(Gesture.Scissor);
        assertFalse(game.isTie());
        assertEquals(PLAYER1, game.getWinner());

    }

    @Test
    public void testScissordefeatsPaper() {
        Game game = new Game();
        game.player1Gesture(Gesture.Scissor);
        game.player2Gesture(Gesture.Paper);
        assertFalse(game.isTie());
        assertEquals(PLAYER1, game.getWinner());
    }

    @Test
    public void testPaperdefeatsRock() {
        Game game = new Game();
        game.player1Gesture(Gesture.Paper);
        game.player2Gesture(Gesture.Rock);
        assertFalse(game.isTie());
        assertEquals(PLAYER1, game.getWinner());
    }

    @Test
    public void testRockTiesRock() {
        Game game = new Game();
        game.player1Gesture(Gesture.Rock);
        game.player2Gesture(Gesture.Rock);
        assertTrue(game.isTie());
    }

    @Test
    public void testScissorTiesScissor() {
        Game game = new Game();
        game.player1Gesture(Gesture.Scissor);
        game.player2Gesture(Gesture.Scissor);
        assertTrue(game.isTie());
    }

    @Test
    public void testPaperTiesPaper() {
        Game game = new Game();
        game.player1Gesture(Gesture.Paper);
        game.player2Gesture(Gesture.Paper);
        assertTrue(game.isTie());
    }

}
