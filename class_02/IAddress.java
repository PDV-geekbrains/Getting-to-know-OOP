package class_02;

/**
 * Интерфейс определяет адрес библиотеки.
 */
public interface Address {
    void setCity(String city);

    String getCity();

    void setStreet(String street);

    String getStreet();

    void setBuildingNumber(Integer number);

    Integer getBuildingNumber();
}
