package class_03_01;

import class_02.PublicationType;

/** Класс описывает ежемесячный журнал. */
public class MonthlyMagazine implements IMagazine {
    private String name;
    private Integer pagesNumber;

    /**
     * Конструктор.
     * @param name - название журнала.
     * @param pagesNumber - количество страниц в журнале.
     */
    public MonthlyMagazine(String name, Integer pagesNumber) {
        this.name = name;
        this.pagesNumber = pagesNumber;
    }

    /**Возвращает периодичность выхода журнала. */
    @Override
    public PublicationPeriod getPublicationPeriod() {
        return PublicationPeriod.MONTH;
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