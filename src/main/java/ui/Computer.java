package ui;

import game.Gesture;

import java.util.List;

/**
 * Created by snpilla on 04/11/2017.
 */
public class Computer extends Player {

    private final ThrowAlgorithm throwAlgorithm;
    private final String name;

    public Computer(List<Gesture> gestures) {
        this(gestures, "Computer");
    }

    public Computer(List<Gesture> gestures, String computerName) {
        this.throwAlgorithm = new RandomThrowAlgorithm(gestures);
        this.name = computerName;
    }

    @Override
    public String toString(){
        return this.name;
    }


    @Override
    public Gesture _throw() {
        return throwAlgorithm._throw();
    }
}
