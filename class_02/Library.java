package class_02;

/**
 * Интерфейс описывает общие параметры
 * сущности Библиотека.
 */
public interface Library {

    String getName();

    void setName(String name);

    Address getAddress();

    boolean setAddress(Address address);

    String getRegularHours();

    void setRegularHours(String getRegularHours);
}
