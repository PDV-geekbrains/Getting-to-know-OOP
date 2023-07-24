package class_03_02;

import class_02.*;

public class TownNews implements INewspaper, Comparable<TownNews> {
    private PublicationType type = PublicationType.NEWSPAPER;
    private String name;
    private Integer pagesNumber;

    /**
     * Конструктор.
     * @param name - название издания.
     * @param pagesNumber - количество страниц издания.
     */
    public TownNews(String name, Integer pagesNumber) {
        this.name = name;
        this.pagesNumber = pagesNumber;
    }
    //#region ---В данном случае эти методы не используются.
    public void setPublicationType(PublicationType type) {}

    public PublicationType getPublicationType() {return null;}

    public void setNewspaperName(String name) {
    }
    //#endregion ---

    /** Возвращает название издания. */
    public String getNewspaperName() {
        return this.name;
    }

    /** Возвращает количество страниц в издании. */
    public Integer getpagesNumber() {
        return this.pagesNumber;
    }

    /** Реализация логики сравнения. */
    public int compareTo(TownNews m) {
        return this.pagesNumber - m.pagesNumber;
    }
}
