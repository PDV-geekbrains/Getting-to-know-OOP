package class_04_04;

import java.util.Comparator;

public class Program {
    private static DataContainer<Product> products;

    public static void main(String[] args) {
        //products = new DataContainer<>(comparator);
        products = new DataContainer<>();

        populateDataContainer();
        System.out.println("---Несортированный список---");
        products.print();

        products.sort(new ProductComparator());
        System.out.println("---По возрастанию цены---");
        products.print();

        products.sort(new ProductComparator2());
        System.out.println("---По убыванию цены---");
        products.print();
    }

    /** Метод заполняет данными DataContainer. */
    private static void populateDataContainer() {
        products.add(new Product("Сапоги женские", 23.60));
        products.add(new Product("Щётка для обуви", 1.13));
        products.add(new Product("Шнурки чёрные", 0.9));
        products.add(new Product("Туфли мужские", 19.7));
        products.add(new Product("Кроссовки", 17.08));
    }
    
    
}