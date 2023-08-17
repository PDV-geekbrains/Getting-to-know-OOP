package class_07_01.UserInterface;

public interface IView {
    /**
     * Метод возвращает ввод пользователя с консоли.
     * @return - строка введённая пользователем.
     */
    public String getUserInput();

    /**
     * Метод выводит сообщение на консоль.
     * @param message - сообщение.
     */
    public void print(String message);
}
