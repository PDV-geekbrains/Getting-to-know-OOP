package class_02;

/**
 * Интерфейс определяет профиль посетителя
 * библиотеки.
 */
public interface Client {
    boolean setLibraryCardNumber(Integer number);

    Integer getLibraryCardNumber();

    void setFirstName(String name);

    String getFirstName();

    void setLastName(String name);

    String getLastName();
}
