package class_03_01;

import class_02.PublicationType;

/** Класс описывает еженедельный журнал. */
public class WeeklyMagazine implements IMagazine {
    private String name;
    private Integer pagesNumber;

    /**
     * Конструктор.
     * @param name - название журнала.
     * @param pagesNumber - количество страниц в журнале.
     */
    public WeeklyMagazine(String name, Integer pagesNumber) {
        this.name = name;
        this.pagesNumber = pagesNumber;
    }

    /** Возвращает тип печатного издания. */
    public PublicationType getPublicationType() {
        return TYPE;
    }

    /** Возвращает название журнала. */
    public String getMagazineName() {
        return this.name;
    }

    /** Возвращает количество страниц в журнале. */
    public Integer getPagesNumber() {
        return this.pagesNumber;
    }

    /** Выводит на консоль информацию о журнале. */
    public void printInfo() {
        System.out.printf("Название: %s\nПериодичность выхода: %s\n" +
                "Кол-во страниц: %d\n", this.name, getPublicationPeriod(),
                this.pagesNumber);
    }
}
