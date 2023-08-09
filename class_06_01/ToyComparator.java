import java.util.Comparator;

/**
 * Класс описывает механизм сравнения игрушек.
 */
public  class ToyComparator implements Comparator<IToy> {

    /**
     * Метод реализует сравнение объектов по их цвету.
     * В качестве характеристики цвета используется
     * соответствующая этому цвету длина волны.
     */
    @Override
    public int compare(IToy toy1, IToy toy2) {
        return toy1.getColor().getWaveLength() - toy2.getColor().getWaveLength();
    }
}