package class_07_01.core;

import class_07_01.core.Interfaces.IComplexNumber;
import class_07_01.core.Models.ComplexNumber;
import class_07_01.core.Models.DivisionOperation;
import class_07_01.core.Models.MultiplicationOperation;
import class_07_01.core.Interfaces.IMathOperation;
import class_07_01.core.Models.AdditionOperation;

import java.util.Scanner;

import class_07_01.UserInterface.IView;
import class_07_01.UserInterface.View;
import class_07_01.core.Interfaces.ICalculatorModel;
import class_07_01.core.Models.CalculatorModel;

/**
 * Класс ставит в соответствие интерфейсам их реализацию.
 */
public class Creator {

    /**
     * Метод возвращает новый экземпляр комплексного числа.
     * @return - экземпляр комплексного числа.
     */
    public IComplexNumber getComplexNumber() {
        return new ComplexNumber();
    }
    
    /**
     * Метод возвращает новый экземпляр операции Сложение.
     * @return - экземпляр операции Сложение.
     */
    public IMathOperation getAdditionOperation() {
        return new AdditionOperation(new ComplexNumber());
    }

    /**
     * Метод возвращает новый экземпляр операции Умножение.
     * @return - экземпляр операции Умножение.
     */
    public IMathOperation getMuliplicationOperation() {
        return new MultiplicationOperation(new ComplexNumber());
    }

    /**
     * Метод возвращает новый экземпляр операции Деление.
     * @return - экземпляр операции Деление.
     */
    public IMathOperation getDivisionOperation() {
        return new DivisionOperation(new ComplexNumber());
    }

    /**
     * Метод возвращает новый экземпляр калькулятора.
     * @return - экземпляр калькулятора.
     */
    public ICalculatorModel getCalculator() {
        return new CalculatorModel();
    }

    /**
     * Метод возвращает новый экземпляр View.
     * @return - экземпляр View.
     */
    public IView getView() {
        return new View(new Scanner(System.in));
    }
}
