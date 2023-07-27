package class_03_03;

import java.util.Comparator;

/**
 * Класс описывает механизм сравнения игрушек.
 */
public class ToyComparator implements Comparator<Toy> {

    /**
     * Метод реализует сравнение объектов по их цвету.
     * В качестве характеристики цвета используется
     * соответствующая этому цвету длина волны.
     */
    @Override
    public int compare(Toy toy1, Toy toy2) {
        return toy1.getColor().getWaveLength() - toy2.getColor().getWaveLength();
    }
    
}