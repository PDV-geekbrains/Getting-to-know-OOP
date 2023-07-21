package class_02;

public class Book implements IBook {
    private PublicationType type;
    private String name;
    private String author;
    private Integer pagesNumber;

    Book(PublicationType type,
         String name,
         String author,
         Integer pagesNumber) {
        this.type = type;
        this.name=name;
        this.author = author;
        this.pagesNumber = pagesNumber;
         }
    
    public void setPublictionType(PublicationType type) {
        this.type = type;
    }

    public PublicationType getPublicationType() {
        return this.type;
    }

    public void setBookName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return this.name;
    }

    public void setBookAuthor(String author) {
        this.author = author;
    }

    public String getBookAuthor() {
        return this.author;
    }

    public void setPagesNumber(Integer number) {
        this.pagesNumber = number;
    }

    public Integer getPagesNumber() {
        return this.pagesNumber;
    }
    
    /** Выводит на консоль информацию о книге. */
    public void printInfo() {
        System.out.printf("Название: %s\nАвтор: %s\nСтраниц: %d\n",
            this.name, this.author, this.pagesNumber);
    }
}
