package class_02;

/** Класс описывает сущность Газета */
public class Newspaper implements INewspaper {
    private PublicationType type;
    private String name;

    /**
     * Конструктор.
     * Задаёт значения типа и названия издания.
     * @param type - тип издания.
     * @param name - название издания.
     */
    Newspaper(String name) {
        this.type = PublicationType.NEWSPAPER;
        this.name = name;
    }

    public void setPublicationType(PublicationType type) {
        this.type = type;
    }
    public PublicationType getPublicationType() {
        return this.type;
    }

    public void setNewspaperName(String name) {
        this.name = name;
    }
    public String getNewspaperName() {
        return this.name;
    }
    
}
