package class_05_02;

/** Класс описывает сущность Пользователь. */
public class User {
    private String name;
    private String login;
    private String password;

    /**
     * Метод сохраняет имя пользователя.
     * @param name - имя пользователя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает имя пользовател.
     * @return - имя пользователя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод сохраняет логин пользователя.
     * @param login - логин пользователя.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Метод возвращает логин пользователя.
     * @return - логин пользователя.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Метод сохраняет пароль пользователя.
     * @param password - пароль пользователя.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Метод возвращает пароль пользователя.
     * @return - пароль пользователя.
     */
    public String getPassword() {
        return this.password;
    }
}