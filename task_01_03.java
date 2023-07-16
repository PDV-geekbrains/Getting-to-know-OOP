import java.util.LinkedList;

public class task_01_03 {
    public static void main(String[] args) {
        Library library = new Library();
        populateCatalog(library);

        library.displayAllBooks();
        library.displayAvailableBooks();
        library.searchByAuthor("Беляев А.");
    }

    private static void populateCatalog(Library library) {
        
        Book book1 = new Book();
        book1.setTitle("Война и мир");
        book1.setAuthor("Толстой Л.Н.");
        book1.setAvailability(false);

        Book book2 = new Book();
        book2.setTitle("Два капитана");
        book2.setAuthor("Каверин В.");
        book2.setAvailability(true);

        Book book3 = new Book();
        book3.setTitle("Ночевала тучка золотая");
        book3.setAuthor("Приставкин А.");
        book3.setAvailability(true);

        Book book4 = new Book();
        book4.setTitle("Голова профессора Доуэля");
        book4.setAuthor("Беляев А.");
        book4.setAvailability(true);

        Book book5 = new Book();
        book5.setTitle("Человек-амфибия");
        book5.setAuthor("Беляев А.");
        book5.setAvailability(true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
    }
}

/**
 * Описывает сущность Библиотека.
 */
class Library {
    /** Список книг. */
    private LinkedList<Book> catalog;

    /**
     * Конструктор.
     * Без параметров.
     */
    Library() {
        this.catalog = new LinkedList<Book>();
    }

    /**
     * Добавляет книгу в каталог. Если такая книга уже
     * присутствует - игнорирует добавление.
     * @param book - книга.
     */
    public void addBook(Book book) {
        if(!catalog.contains(book))
            this.catalog.add(book);
    }

    /**
     * Удаляет книгу из каталога. Если такой книги нет
     * в каталоге - игнорирует удаление.
     * @param book - книга.
     */
    public void removeBook(Book book) {
        if (catalog.contains(book))
            this.catalog.removeFirstOccurrence(book);
    }

    /**
     * Выводит на консоль информацию о всех книгах в библиотеке.
     */
    public void displayAllBooks() {
        System.out.println("Все книги каталога.\n");
        Integer counter = 0;
        if (catalog == null)
            System.out.println("В каталоге книг нет.");
        else {
            for (Book book : this.catalog) {
                book.displayInfo();
                counter++;
            }
        }
        System.out.println("Всего: " + counter + "\n\n");
    }
    
    /**
     * Выводит на консоль информацию о доступных книгах в библиотеке.
     */
    public void displayAvailableBooks() {
        System.out.println("Доступные книги.\n");
        Integer counter = 0;
        for (Book book : this.catalog) {
            if (book.getAvailability() == true) {
                book.displayInfo();
                counter++;
            }
        }
        System.out.println("Всего: " + counter + "\n\n");
    }
    
    /**
     * Выводит на консоль информацию о книгах заданного автора.
     * @param author - имя автора.
     */
    public void searchByAuthor(String author) {
        System.out.printf("Книги автора: %s\n\n" , author);
        Integer counter = 0;
        for (Book book : this.catalog) {
            if (book.getAuthor() == author) {
                book.displayInfo();
                counter++;
            }
        }
        System.out.printf("Всего доступно: %d\n\n", counter);
    }
}
    
    /** Описывает сущность Книга. */
    class Book {
        /** Название книги. */
        private String title;
        /** Имя автора книги. */
        private String author;
        /** Доступность книги. */
        private boolean isAvailable;

        /**
         * Возвращает название книги.
         * @return - название книги
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * Записывает название книги.
         * @param title - название книги.
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * Возвращает имя автора.
         * @return - имя автора.
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * Записывает имя автора.
         * @param author - имя автора.
         */
        public void setAuthor(String author) {
            this.author = author;
        }

        /**
         * Возвращает признак доступности книги.
         * @return - признак доступности книги.
         */
        public boolean getAvailability() {
            return this.isAvailable;
        }

        /**
         * Устанавливает признак доступности книги.
         * @param isAvailable - признак доступности книги.
         */
        public void setAvailability(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        public void displayInfo() {
            String text = "не доступна";
            if(this.isAvailable)
                text="доступна";

            System.out.printf("Название: %s\nАвтор: %s\n" +
                "Доступность: %s\n\n", this.title, this.author, text);
        }
    }
