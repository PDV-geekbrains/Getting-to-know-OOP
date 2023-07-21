package class_02;

/**
 * Интерфейс описывает общие параметры
 * сущности Библиотека.
 */
public interface ILibrary {

    String getName();

    void setName(String name);

    IAddress getAddress();

    boolean setAddress(IAddress address);

    String getRegularHours();

    void setRegularHours(String getRegularHours);
}
