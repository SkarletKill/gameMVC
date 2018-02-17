package ua.kpi.tef;

import java.util.ArrayList;

public class View {

    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUT_OF_BOUNDS = "Wrong input! Please enter a number from the specified range. ";
    public static final String LESS_THAN_NUMBER = "More";
    public static final String MORE_THAN_NUMBER = "Less";
    public static final String CONGRATULATION = "Congratulation! You WIN!";
    public static final String HISTORY = "History of your attempts: ";

    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public void printHistory(ArrayList<Integer> history) {
        printMessage(HISTORY);
        int i = 1;
        for (int attempt: history) {
            System.out.printf("%02d. %d\n", i++, attempt);
        }
    }

    public void printBounds(int lowerBound, int upperBound){
        System.out.println("[" + lowerBound + ", " + upperBound + "]");
    }

}
