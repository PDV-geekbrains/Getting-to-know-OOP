package class_07_01;

import class_07_01.UserInterface.IView;
import class_07_01.core.Creator;
import class_07_01.core.Interfaces.IComplexNumber;
import class_07_01.core.Interfaces.IMathOperation;
import class_07_01.core.Interfaces.ICalculatorModel;

/**
 * Класс реализует функцию презентера паттерна
 * model-presenter-view.
 */
public class Presenter {
    private Creator creator;
    private IView view;
    private ICalculatorModel calculator;

    /** Конструктор. */
    public Presenter(Creator creator) {
        this.creator = creator;
        this.view = creator.getView();
        this.calculator = creator.getCalculator();
    }

    public void start() {
        int mainMenuItem = 0;
        while (mainMenuItem != 1) {
            printMainMenu();
            mainMenuItem = getMainMenuItem();
            switch (mainMenuItem) {
                case 2:
                    addNumbers();
                    break;
                case 3:
                    multiplicateNumbers();
                    break;
                case 4:
                    divideNumbers();
                    break;
                case 5:
                    printAllOperations();
                    break;
            }
        }
    }
    
    /** Метод выводит основное меню. */
    private void printMainMenu() {
        StringBuilder mainMenu = new StringBuilder()
                .append("\n=== Калькулятор комплексных чисел ===\n")
                .append("1. Выход\n")
                .append("2. Сложение\n")
                .append("3. Умножение\n")
                .append("4. Деление\n")
                .append("5. История операций\n");
        view.print(mainMenu.toString());

    }
    
    /** Метод возвращает пункт основного меню введённого пользователем. */
    private int getMainMenuItem() {
        int userInput = 0;
        System.out.print("Введите номер меню: ");
        // Пользователь должен ввести целое число.
        try {
            userInput = Integer.parseInt(view.getUserInput());
        } catch (Exception e) {
            view.print("\nОшибка. Введите номер меню.\n");
        }
        // Пользователь должен ввести целое число от 1 до 5.
        if (userInput < 1 || userInput > 5)
            view.print("\nОшибка. Введите номер меню от 1 до 5.\n");
        return userInput;
    }
    
    // Сложение. TODO Разбить метод.
    private void addNumbers() {
        IMathOperation addition = creator.getAdditionOperation();
        IComplexNumber num1 = creator.getComplexNumber();
        IComplexNumber num2 = creator.getComplexNumber();

        System.out.print("\n=== Сложение комплексных чисел ===\n");
        System.out.print("Введите действительную часть первого слагаемого: ");
        num1.setRealPart(getInputNumber());
        System.out.print("Введите мнимую часть первого слагаемого: ");
        num1.setImaginaryPart(getInputNumber());
        System.out.print("Введите действительную часть второго слагаемого: ");
        num2.setRealPart(getInputNumber());
        System.out.print("Введите мнимую часть второго слагаемого: ");
        num2.setImaginaryPart(getInputNumber());

        addition.doOperation(num1, num2);
        this.calculator.saveMathOperation(addition);
        view.print(addition.getOperationInLine());
    }

    // Умножение. TODO Разбить метод.
    private void multiplicateNumbers() {
        IMathOperation multiplication = creator.getMuliplicationOperation();
        IComplexNumber num1 = creator.getComplexNumber();
        IComplexNumber num2 = creator.getComplexNumber();

        System.out.print("\n=== Умножение комплексных чисел ===\n");
        System.out.print("Введите действительную часть первого сомножителя: ");
        num1.setRealPart(getInputNumber());
        System.out.print("Введите мнимую часть первого сомножителя: ");
        num1.setImaginaryPart(getInputNumber());
        System.out.print("Введите действительную часть второго сомножителя: ");
        num2.setRealPart(getInputNumber());
        System.out.print("Введите мнимую часть второго сомножителя: ");
        num2.setImaginaryPart(getInputNumber());

        multiplication.doOperation(num1, num2);
        this.calculator.saveMathOperation(multiplication);
        view.print(multiplication.getOperationInLine());
    }

    // Деление. TODO Разбить метод.
    private void divideNumbers() {
        IMathOperation division = creator.getDivisionOperation();
        IComplexNumber num1 = creator.getComplexNumber();
        IComplexNumber num2 = creator.getComplexNumber();

        System.out.print("\n=== Деление комплексных чисел ===\n");
        System.out.print("Введите действительную часть делимого: ");
        num1.setRealPart(getInputNumber());
        System.out.print("Введите мнимую часть делимого: ");
        num1.setImaginaryPart(getInputNumber());
        System.out.print("Введите действительную часть делителя: ");
        num2.setRealPart(getInputNumber());
        System.out.print("Введите мнимую часть делителя: ");
        num2.setImaginaryPart(getInputNumber());

        if (num2.getRealPart() != 0 || num2.getImaginaryPart() != 0) {
            division.doOperation(num1, num2);
            this.calculator.saveMathOperation(division);
            view.print(division.getOperationInLine());
        } else {
            view.print("\nОшибка. Мнимая и действительная часть " +
                "делителя не могут одновременно быть равны 0.\n");
        }
    }
    
    /**
     * Метод возвращает число введённое пользователем.
     * @return - число введённое пользователем.
     */
    private double getInputNumber() {
        return Double.parseDouble(view.getUserInput());
    }

    /**
     * Метод выводит на печать список совершённых математических операций.
     */
    private void printAllOperations() {
        view.print("=== История всех операций:\n");
        if (!calculator.getAllMathOperations().isEmpty()) {
            for (IMathOperation o : calculator.getAllMathOperations()) {
                view.print(o.getOperationInLine() + "\n");
            }
        } else {
            view.print("Список пуст. Выполните хотя бы одну математичесую операцию.\n");
        }
    }
}