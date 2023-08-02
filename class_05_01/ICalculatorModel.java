package class_05_01;

public interface ICalculatorModel {
    /** Метод возвращает состояние ошибки
     * выполнения операции.
     * @return - описание ошибки.
     */
    ICalculatorException getException();

    /** Метод возвращает арнумент_1. */
    double getArg1();

    /** Метод возвращает арнумент_2. */
    double getArg2();

    /** Метод возвращает результат операции. */
    double getResult();

    /**
     * Метод вычисляет сумму двух чисел.
     * @param arg1 - слагаемое 1.
     * @param arg2 - слагаемое 2.
     */
    void add(double arg1, double arg2);

    /**
     * Метод вычисляет разность двух чисел.
     * @param arg1 - уменьшаемое.
     * @param arg2 - вычитаемое.
     */
    void subtract(double arg1, double arg2);

    /**
     * Метод вычисляет произведение двух чисел.
     * @param arg1 - сомножитель 1.
     * @param arg2 - сомножитель 2.
     */
    void multiply(double arg1, double arg2);

    /**
     * Метод вычисляет частное от деления двух чисел.
     * @param arg1 - делимое.
     * @param arg2 - делитель.
     */
    void divide(double arg1, double arg2);
}
