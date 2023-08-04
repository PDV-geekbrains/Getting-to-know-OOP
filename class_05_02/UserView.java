package class_05_02;

import java.util.Scanner;

public class UserView {
    Scanner sc;

    /**
     * Конструктор.
     * @param sc - сканер для работы с консолью.
     */
    public UserView(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Метод возвращает ответ пользователя в ответ на вопрос
     * @param message - вопрос пользователю.
     * @return - ответ пользователя.
     */
    public String getUserInput(String message) {
        System.out.print(message + ": ");
        return sc.nextLine();
        //return sc.nextLine().replace("\n", "");
    }

    /**
     * Метод возвращает пункт меню выбранный пользователем из
     * предложенного списка.
     * @param menu - список пунктов меню.
     * @return - пункт меню выбранный пользователем.
     */
    public int getMenuChoice(String menu) {
        int choice = -1;
        System.out.print(menu);
        try {
            choice = Integer.parseInt(sc.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Ошибка. Введите число.");
        }
        return choice;
    }
    
    /**
     * Метод выводит сообщение на консоль.
     * @param message - сообщение.
     */
    public void print(String message) {
        System.out.print(message);
    }
}
