package class_04_02;

import java.util.ArrayList;
import java.util.List;

public class program {
    /**  Вывод на консоль элементов массивов типов Integer и String.
     */
    public static void main(String[] args) {
        ArrayList<Integer> listOfIntegers = getArrayOfIntegers();
        ArrayList<String> listOfStrings = getArrayOfStrings();

        printArray(listOfIntegers);
        printArray(listOfStrings);
    }
    
    /** Обобщённый метод выводит на консоль элементы входного массива. */
    private static <T> void printArray(Iterable<T> array) {
        for (T item : array)
            System.out.println(item);
    }
    
    /** Метод возвращает массив элеметов типа Integer. */
    private static ArrayList<Integer> getArrayOfIntegers() {
        return new ArrayList<Integer>(List.of(1, 2, 3));
    }

    /** Метод возвращает массив элеметов типа String. */
    private static ArrayList<String> getArrayOfStrings() {
        return new ArrayList<String>(List.of("one", "two", "three"));
    }
}
