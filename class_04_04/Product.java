package class_04_04;

/** Класс описывает сущность Товар. */
public class Product {
    private String name;
    private double price;

    /**
     * Конструктор.
     * @param name - название товара.
     * @param price - цена товара.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /** Метод возвращает название товара. */
    public String getName() {
        return this.name;
    }

    /** Метод возвращает цену товара. */
    public double getPrice() {
        return this.price;
    }

        public String toString(){
            return new String("цена: " + this.price + "; " + "наименование: " + this.name);
    }
}
