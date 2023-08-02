package class_05_01;


public interface ICalculatorException {

    /** Метод возвращает признак наличия ошибки.
     * Истина - ошибка. Ложь - нет ошибки.
     */
    boolean getStatus();

    /** Метод устанавливает признак наличия ошибки.
     * Истина - ошибка. Ложь - нет ошибки.
     */
    void setStatus(boolean status);

    /** Метод возвращает описание ошибки. */
    String getMessage();

    /** Метод сохраняет описание ошибки. */
    void setMessage(String message);
}
