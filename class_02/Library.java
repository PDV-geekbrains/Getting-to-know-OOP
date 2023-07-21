package class_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library implements ILibrary {

    private String libraryName;
    private IAddress address;
    private List<Book> books;
    private List<Newspaper> newspapers;
    private List<Client> clients;

    Library(IAddress address) {
        this.books = new LinkedList<Book>();
        this.newspapers = new ArrayList<Newspaper>();
        this.clients = new ArrayList<Client>();
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

    /** Добавляет газету. */
    public void addNewspaper(Newspaper newspaper) {
        if (!this.newspapers.contains(newspaper))
            newspapers.add(newspaper);
    }
    
    /** Добавляет нового клиента в список. */
    public void addClient(Client client) {
        if(!this.clients.contains(client))
            clients.add(client);
    }
    
    /** Выводит на консоль информацию о библиотечном
     * фонде и постоянных посетителях.
     */
    public void printInfo() {
        System.out.printf("Название: %s\nАдрес: %s, %s, %d\n",
                this.libraryName, this.address.getCity(),
                this.address.getStreet(), this.address.getBuildingNumber());
        System.out.println("Всего книг: " + this.books.size());
        System.out.println("Всего газет: " + this.newspapers.size());
        System.out.println("Всего постоянных посетителей: " + this.clients.size());
        System.out.println();
    }
}
