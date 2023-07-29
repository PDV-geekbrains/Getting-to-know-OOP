package class_04_03;

public class program {
    /**
     * Сравнение заданных разнотипных пар значений с использованием
     * обобщённого метода.
     */
    public static void main(String[] args) {
        // Входные данные.
        int num1 = 13;
        int num2 = 31;
        double num3 = 23.65;
        double num4 = 36.98;
        String text1 = "second";
        String text2 = "first";
        String text3 = "some text";
        String text4 = "some text";
        // Вывод на консоль результатов сравнения пар значений.
        printCompareResult(num1, num2);
        printCompareResult(num3, num4);
        printCompareResult(text1, text2);
        printCompareResult(text3, text4);
    }
    
    /**
     * Метод выводит на консоль результат сравнения аргументов.
     */
    private static <T> void printCompareResult(Comparable<T> o1, Comparable<T> o2) {
        T max = getMax(o1, o2);
        if(o1.compareTo((T)o2) != 0)
            System.out.println("between \"" + o1 + "\" and \"" + o2 +
                "\" the greater one is \"" + max + "\".");
        else
            System.out.println("elements \"" + o1 + "\" and \"" + o2 +
                "\" are equal.");
    }
    
    /**
     * Метод возвращает наибольший из входных аргументов.
     */
    private static <T> T getMax(Comparable<T> arg1, Comparable<T> arg2) {
        return arg1.compareTo((T) arg2) > 0 ? (T) arg1 : (T) arg2;
    }
}
