package ua.kpi.tef;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private int lowerBound;
    private int upperBound;
    private int number;
    ArrayList<Integer> attempts;
    private boolean inGame;

    public Model() {
        this.lowerBound = 0;
        this.upperBound = 100;
        this.number = rand(lowerBound, upperBound);
        this.attempts = new ArrayList<>();
        inGame = true;
    }

    public int rand(int lower, int upper) {
        return (new Random().nextInt(upper - lower + 1) + lower);
    }

    public void expandHistory(int additionalValue) {
        attempts.add(additionalValue);
    }

    public void updateBounds(int bound) {
        if(bound < number) this.lowerBound = bound + 1;
        else this.upperBound = bound - 1;
        expandHistory(bound);
    }

    public void setNumber(int value) {
        if(value == getNumber()){
            inGame = false;
            expandHistory(value);
        }
        else {
            updateBounds(value);
        }
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getNumber() {
        return number;
    }

    public boolean inGame() {
        return inGame;
    }

    public ArrayList<Integer> getAttempts() {
        return attempts;
    }

//    public boolean isNumber(int value) {
//        return (this.number == value);
//    }

}