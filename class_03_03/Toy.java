package class_03_03;

/** Класс описывает сущность Игрушка. */
public class Toy {
    private String name;
    private Color color;

    /**
     * Конструктор.
     * @param name - название игрушки.
     * @param color - цвет игрушки.
     */
    public Toy(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    /** Возвращает название игрушки. */
    public String getName() {
        return this.name;
    }

    /** Возвращает цвет игрушки. */
    public Color getColor() {
        return this.color;
    }
}
