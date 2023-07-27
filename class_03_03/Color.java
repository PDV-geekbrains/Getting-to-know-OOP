package class_03_03;

/** Класс описывает сущность Световое Излучение. */
public class Color {
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

    /** Метод возвращает цвет излучения. */
    public String getColorName() {
        return this.color;
    }

    /** Метод возвращает длину волны излучения в нм. */
    public Integer getWaveLength() {
        return this.waveLength;
    }
}
