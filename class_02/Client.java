package class_02;

/**
 * Интерфейс определяет профиль посетителя
 * библиотеки.
 */
public interface Client {

    void setFullName(String name);

    String getFullName();
}

enum Gender {
    MAN,
    WOMAN
}
