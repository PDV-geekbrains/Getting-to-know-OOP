package class_05_01;

import java.util.Scanner;;

public class Program {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel(new CalculatorException());
        View ui = new View(new Scanner(System.in));
        Presenter presenter = new Presenter(model, ui);

        presenter.start();
    }
}
