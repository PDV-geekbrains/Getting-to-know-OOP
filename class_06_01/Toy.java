
/** Класс описывает сущность Игрушка. */
public class Toy implements IToy {
    private String name;
    private IColor color;

    /**
     * Конструктор.
     * @param name - название игрушки.
     * @param color - цвет игрушки.
     */
    public Toy(String name, IColor color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IColor getColor() {
        return this.color;
    }
}
