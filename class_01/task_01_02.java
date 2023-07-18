package class_01;
public class task_01_02 {
    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        rct.Print();
        rct.setLength(13);
        rct.setWidth(51);
        rct.Print();
    }
}

/** Описывает прямоугольник. */
class Rectangle {
    /** Длина прямоугольника. */
    private Integer length;
    /** Ширина прямоугольника. */
    private Integer width;

    /**
     * Конструктор.
     * Создаёт прямоугольник с длиной и
     * шириной заданными по умолчанию.
     */
    Rectangle() {
        this.length = 10;
        this.width = 5;
    }

    /**
     * Конструктор.
     * Создаёт прямоугольник с произвольными
     * длиной и шириной.
     * @param length - длина прямоугольника.
     * @param width - ширина прямоугольника.
     */
    Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Возвращает длину прямоугольника.
     * @return - дина прямоугольника.
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * Записывает длину прямоугольника.
     * @param length - дина прямоугольника.
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Возвращает ширину прямоугольника.
     * @return - ширина прямоугольника.
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * Записывает ширину прямоугольника.
     * @param width - ширина прямоугольника.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Возвращает площадь прямоугольника.
     * @return - площадь прямоугольника.
     */
    public Integer calculateArea() {
        return this.length * this.width;
    }

    /**
     * Возвращает периметр прямоугольника.
     * @return - периметр прямоугольника.
     */
    public Integer calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    /**
     * Выводит на консоль длину, ширину, периметр
     * и площадь прямоугольника.
     */
    public void Print() {
        System.out.printf("длина: %d\nширина: %d\n" +
            "периметр: %d\nплощадь: %d\n\n", this.length, +
            this.width, this.calculatePerimeter(),
            this.calculateArea());
    }
}
