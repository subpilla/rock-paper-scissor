package ui;

import game.Gesture;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by snpilla on 04/11/2017.
 */
public class HumanTest {

    List<Gesture> gestures = Arrays.<Gesture>asList(Gesture.Scissor, Gesture.Paper, Gesture.Rock);

    @Test
    public void shouldChooseScissorGesture() {
        Human human = new Human(gestures, new ByteArrayInputStream("scissor".getBytes()));
        assertEquals(Gesture.Scissor, human._throw());
    }


    @Test
    public void shouldAskAgainWhenGestureIsInvalid() {
        String input = "scisor" + System.getProperty("line.separator") + "scissor";
        Human human = new Human(gestures, new ByteArrayInputStream(input.getBytes()));
        assertEquals(Gesture.Scissor, human._throw());
    }
}
