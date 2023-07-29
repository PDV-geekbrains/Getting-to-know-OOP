package class_04_01;

public class program {
    /** 
     * Последовательный вывод на консоль данных разных типов.
     */
    public static void main(String[] args) {
        printElement(123);
        printElement("String");
        printElement(123.456);
    }
    
    /**
     * Обобщённый метод выводит на консоль входной параметр.
     */
    private static <T> void printElement(T parameter){
        System.out.println(parameter);
    }
}
