package ua.kpi.tef;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        while(model.inGame()) {
            view.printBounds(model.getLowerBound(), model.getUpperBound());
            setNumber(inputIntValueWithScanner(sc));
        }
        view.printMessage(View.CONGRATULATION);
        view.printHistory(model.getAttempts());
    }

    private void setNumber(int value) {
        if(value >= model.getLowerBound() && value <= model.getUpperBound()) {
            if(value < model.getNumber()) view.printMessage(View.LESS_THAN_NUMBER);
            if(value > model.getNumber()) view.printMessage(View.MORE_THAN_NUMBER);
            model.setNumber(value);
        }
        else {
            view.printMessage(View.OUT_OF_BOUNDS);
        }
    }

    private int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
