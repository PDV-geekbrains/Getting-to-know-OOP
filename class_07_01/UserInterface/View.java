package class_07_01.UserInterface;

import java.util.Scanner;

/** 
 * Класс реализует взаимодействие с пользователем
 * через консоль.
 */
public class View implements IView {
    private Scanner sc;

    /** Конструктор. */
    public View(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Метод возвращает ввод пользователя с консоли.
     * @return - строка введённая пользователем.
     */
    public String getUserInput() {
        return sc.nextLine().replace("\n", "");
    }

    /**
     * Метод выводит сообщение на консоль.
     * @param message - сообщение.
     */
    public void print(String message){
        System.out.printf(message);
    }
}
