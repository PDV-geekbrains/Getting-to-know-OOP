package class_05_01;

/** Класс описывает сущность Исключение. */
public class CalculatorException implements ICalculatorException {
    private boolean status;
    private String message;

    /** Конструктор. */
    public CalculatorException() {
        this.status = false;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
