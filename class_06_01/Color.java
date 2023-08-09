
/** Класс описывает сущность Световое Излучение. */
public class Color implements IColor {
    private String color;
    private Integer waveLength;

    /**
     * Конструктор.
     * @param color - цвет излучения.
     * @param waveLength - длина волны в нм.
     */
    public Color(String color, Integer waveLength) {
        this.color = color;
        this.waveLength = waveLength;
    }

    @Override
    public String getColorName() {
        return this.color;
    }

    @Override
    public Integer getWaveLength() {
        return this.waveLength;
    }
}
