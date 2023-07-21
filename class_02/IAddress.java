package class_02;

/**
 * Интерфейс определяет адрес библиотеки.
 */
public interface IAddress {
    void setCity(String city);

    String getCity();

    void setStreet(String street);

    String getStreet();

    void setBuildingNumber(Integer number);

    Integer getBuildingNumber();
}
