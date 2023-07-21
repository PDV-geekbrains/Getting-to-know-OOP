package class_02;

/**
 * Интерфейс описывает сущность Книга.
 */
public interface Book {
    // Жёсткая обложка.
    int HARDCOVER = 1;
    // Мягкая облжка.
    int SOFTCOVER = 0;
    
    void setPublictionType(PublicationType type);

    PublicationType getPublicationType();

    void setBookName(String name);

    String getBookName();

    void setBookAuthor(String author);

    String getBookAuthor();

    void setPagesNumber(Integer number);

    Integer getPagesNumber();
}
