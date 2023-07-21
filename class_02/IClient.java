package class_02;

/**
 * Интерфейс определяет профиль посетителя
 * библиотеки.
 */
public interface IClient {

    default Gender getGender() {
        return Gender.MAN;
    }

    void setFullName(String name);

    String getFullName();
}

