package class_05_02;

public class UserPresenter {
    User user;
    UserView view;

    /** Конструктор. */
    public UserPresenter(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    /**
     * Метод выводит стартовое меню приложения.
     * @return - выбор пользователя.
     */
    public String start() {
        StringBuilder sb = new StringBuilder()
                .append("=== Для начала работы выберите вариант входа ===\n")
                .append("1. Авторизация\n")
                .append("2. Регистрация\n")
                .append("Введите номер меню: ");
        String result = "";
        switch (view.getMenuChoice(sb.toString())) {
            case 1:
                result = Status.AUTHORIZATION.toString();
                break;
            case 2:
                result = Status.REGISTRATION.toString();
                break;
            default:
                view.print("Ошибка. Необходимо ввести число от 1 до 2.");
        }
        return result;
    }
    
    /**
     * Метод реализует авторизацию пользователя. 
     * @return - true: пользователь прошёл авторизацию,
     * false: пользователь не прошёл авторизацию.
     */
    public boolean authorizeUser() {
        // Вывод заголовока меню.
        view.print("\n=== Авторизация ===\n");

        // Запрос данных пользователя.
        String login = view.getUserInput("Введите логин").replace("\n", "");
        String password = view.getUserInput("Введите пароль").replace("\n", "");
        
        if (user.getLogin() == login && user.getPassword() == password)
            return true;
        else
            return false;
    }

    /**
     * Метод регистрирует пользователя.
     * @return - новый пользователь.
     */
    public User registerUser() {
        // Вывод заголовока меню.
        view.print("\n=== Регистрация ===\n");

        // Запрос данных пользователя.
        String name = view.getUserInput("Введите имя").replace("\n", "");
        String login = view.getUserInput("Введите логин").replace("\n", "");
        String password = view.getUserInput("Введите пароль").replace("\n", "");

        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);

        return user;
    }
}
