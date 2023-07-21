package class_02;

/** Интерфейс описывает сущность Газета. */
public interface Newspaper {
    /** Газета выходит ежедненвно */
    int DAILY = 1;
    /** Газета выходит еженедельно. */
    int WEEKLY = 0;

    void setPublicationType(PublicationType type);

    PublicationType getPublicationType();

    void setNewspaperName(String name);

    String getNewspaperName();
}
