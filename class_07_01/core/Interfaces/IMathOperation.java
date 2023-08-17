package class_07_01.core.Interfaces;

/** 
 * Интерфейс описывает сущность Математическая опрация
 * над двумя комплексными числами. 
 */
public interface IMathOperation {
     /**
     * Метод описывает математическую операцию.
     * @param operationType - тип математической операции.
     * @param firstArgument - первый аргумент.
     * @param secondArgument - второй аргумент.
     */
    public void doOperation(
        IComplexNumber firstArgument,
        IComplexNumber secondArgument);
    
    /**
     * Метод возвращает первое комплексное число участвующиее в
     * математической операции.
     * @return - число участвующиее в математической операции.
     */
    public IComplexNumber getFirstArgument();

    /**
     * Метод возвращает второе комплексное число участвующиее в
     * математической операции.
     * @return - число участвующиее в математической операции.
     */
    public IComplexNumber getSecondArgument();

    /**
     * Метод возвращает результат математической операции.
     * @return - результат математической операции.
     */
    public IComplexNumber getOperationResult();

    /**
     * Метод возвращает название математической операции.
     * @return - название математической операции.
     */
    public String getOperationType();

    /**
     * Метод возвращает описание математической оперции.
     * @return - описание математической оперции.
     */
    public String getOperationInLine();
}
