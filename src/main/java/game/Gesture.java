package game;

import static game.Result.LOSE;
import static game.Result.TIE;
import static game.Result.WIN;

/**
 * Created by snpilla on 04/11/2017.
 */
public enum Gesture {

    Paper() {
        @Override
        public Result defeats(Gesture c) {
            if (c == Scissor) {
                return LOSE;
            } else if (c == Rock) {
                return WIN;
            } else {
                return TIE;
            }
        }

    },

    Rock() {
        @Override
        public Result defeats(Gesture c) {
            if (c == Paper) {
                return LOSE;
            } else if (c == Scissor) {
                return WIN;
            } else {
                return TIE;
            }
        }
    },

    Scissor() {
        @Override
        public Result defeats(Gesture c) {
            if (c == Rock) {
                return LOSE;
            } else if (c == Paper) {
                return WIN;
            } else {
                return TIE;
            }
        }
    };

    public abstract Result defeats(Gesture c);

}
