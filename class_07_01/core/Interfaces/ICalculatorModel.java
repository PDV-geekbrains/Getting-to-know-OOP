package class_07_01.core.Interfaces;

import java.util.List;

/** Интерфейс описывает сущность Калькулятор комплексных чисел */
public interface ICalculatorModel {
    /**
     * Метод сохраняет математическую операцию.
     * @param mathOperation - математическая операция.
     */
    public void saveMathOperation(IMathOperation mathOperation);

    /**
     * Метод возвращает полный список математических операций.
     * @return - список математических операций.
     */
    public List<IMathOperation> getAllMathOperations();
}
