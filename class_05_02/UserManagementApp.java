package class_05_02;

import java.util.Scanner;

public class UserManagementApp {
    public static void main(String[] args) {
        // Инициализация.
        Scanner sc=new Scanner(System.in);
        UserPresenter presenter = new UserPresenter(
            new User(),
            new UserView(sc));
        
        // Запуск стартового меню приложения.
        switch (presenter.start()) {
            case "AUTHORIZATION":
                presenter.authorizeUser();
                // ...
                break;
            case "REGISTRATION":
                presenter.registerUser();
                // ...
                break;
            default:
                return;
        }
    }
}
