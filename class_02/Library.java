package class_02;

import java.util.LinkedList;
import java.util.List;

public class Library implements ILibrary {

    private String libraryName;
    private IAddress address;
    private List<Book> books;

    Library() {
        this.books = new LinkedList<Book>();
    }

    Library(String name,
            IAddress address) {
        this();
        this.libraryName = name;
        this.address = address;
    }
    

    public String getName() {
        return this.libraryName;
    }
    public void setName(String name) {
        this.libraryName = name;
    }

    public IAddress getAddress() {
        return this.address;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }
    
    /** Добавляет книгу в библиотечный список книг. */
    public void addBook(Book book) {
        if (!this.books.contains(book))
            this.books.add(book);
    }
    
    /** Выводит на консоль информацию о библиотечном
     * фонде и постоянных посетителях.
     */
    public void printInfo() {
        System.out.printf("Название: %s\nАдрес: %s, %s - %d",
            this.libraryName, this.address.getCity(),
            this.address.getStreet(), this.address.getBuildingNumber());
        
    }
}
