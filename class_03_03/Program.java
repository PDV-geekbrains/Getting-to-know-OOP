package class_03_03;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        List<Toy> toys = getToys();
        ToyComparator comparator = new ToyComparator();
        toys = getSortedList(toys, comparator);
        Print(toys);
    }
    
    /** Метод возвращает неупорядоченный список игрушек. */
    private static List<Toy> getToys() {
        List<Toy> toys = new LinkedList<>();
        toys.add(new Toy("Ведро", new Color("Фиолетовый", 450)));
        toys.add(new Toy("Машина", new Color("Зелёный", 560)));
        toys.add(new Toy("Лодка", new Color("Оранжевый", 620)));
        toys.add(new Toy("Слон", new Color("Красный", 760)));
        toys.add(new Toy("Совок", new Color("Синий", 480)));
        toys.add(new Toy("Птица", new Color("Желтый", 590)));
        toys.add(new Toy("Кукла", new Color("Голубой", 500)));
        return toys;
    }

    /**
     * Метод возвращает отсортированный список.
     * @param list - несортированный список.
     * @param comparator - компаратор.
     * @return - отсортированный список.
     */
    private static List<Toy> getSortedList(List<Toy> toys, ToyComparator comparator) {
        Collections.sort(toys, comparator);
        return toys;
    }

    /**
     * Метод выводит на консоль элементы списка.
     * @param toys - список.
     */
    private static void Print(List<Toy> toys) {
        for(Toy toy : toys)
            System.out.printf("Название игрушки: %s, Цвет: %s (длина волны, нм: %d\n",
                toy.getName(), toy.getColor().getColorName(), toy.getColor().getWaveLength());
    }
}
