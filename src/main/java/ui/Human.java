package ui;

import game.Gesture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by snpilla on 04/11/2017.
 */
public class Human extends Player {

    private final List<Gesture> gestures;
    private final BufferedReader reader;

    public Human(List<Gesture> gestures) {
        this.gestures = gestures;
        this.reader =  new BufferedReader(new InputStreamReader(System.in));
    }

    // for testing
    Human(List<Gesture> gestures, InputStream inputStream){
        this.gestures = gestures;
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String toString(){
        return "Human";
    }

    public Gesture _throw() {
        while (true) {
            try {
                printGestures();
                String sGesture = reader.readLine();
                Gesture matchedGesture = null;
                for (Gesture gesture : gestures) {
                    if (sGesture.equalsIgnoreCase(gesture.toString())) {
                        matchedGesture = gesture;
                    }
                }
                if (matchedGesture != null)
                    return matchedGesture;
            } catch (IOException e) {
            }
        }
    }

    private void printGestures() {
        System.out.println("");
        System.out.print("Please choose one of the following gestures: ");
        for(Gesture gesture: gestures){
            System.out.print(gesture + " ");
        }
        System.out.println("");
    }
}
