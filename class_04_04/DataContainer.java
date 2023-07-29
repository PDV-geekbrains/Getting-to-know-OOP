package class_04_04;

import java.util.ArrayList;
import java.util.Comparator;

//* Класс описывает коллекцию элементов. */
public class DataContainer<T> {
    private ArrayList<T> list = new ArrayList<>();
        
    /**
     * Метод добавляет элемент в коллекцию.
     * @param element - элемент для добавления в список.
     */
    public void add(T element) {
        this.list.add(element);
    }

    /**
     * Метод возвращает элемент коллекции по его индексу.
     * @param index - индекс элемента в коллекции.
     */
    public T get(Integer index) {
        return this.list.get(index);
    }

    /**
     * Метод упорядочивает элементы массива в соответствии
     * с правилом, определяемым компаратором.
     * @param comparator - компаратор.
     */
    public void sort(Comparator<T> comparator) {
        this.list.sort(comparator);
    }

    /** Метод выводит на консоль элементы списка. */
    public void print() {
        for (T item : list)
            System.out.println(item);
    }
}
