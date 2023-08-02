package class_05_01;

import java.util.Scanner;;

/** Программа реализует калькулятор с четырьмя
 * арифметическими действиями.
 */
public class Program {
    public static void main(String[] args) {
        // Инициализация.
        CalculatorModel model = new CalculatorModel(new CalculatorException());
        View ui = new View(new Scanner(System.in));
        Presenter presenter = new Presenter(model, ui);
        
        // Запуск калькулятора.
        presenter.start();
    }
}
