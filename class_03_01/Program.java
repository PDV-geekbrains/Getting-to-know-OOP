package class_03_01;

import class_02.*;

/**
 * This class extends functionality of the class 'program' in package 'class_02' 
 * with interface IMagazine and its implementation.
 */
public class Program {
    public static void main(String[] args) {
        Library library = getLibrary();

        // Выводит информацию о библиотеке.
        library.printInfo();
    }
    
    /** Возвращает новую библиотеку. */
    private static Library getLibrary() {
        IAddress libraryAddress = getLibraryAddress(
                "Омск", "ул. Станционная", 12);
        Library library = new Library(libraryAddress);
        library.setName("Национальная библиотека");
        
        addBooksToLibrary(library);
        addNewspapersToLibrary(library);
        addClientsToLibrary(library);
        addMagazines(library);
        return library;
    }

    /** Возвращает адрес библиотеки. */
    private static IAddress getLibraryAddress(
        String city,
        String street,
            Integer number) {
        IAddress address = new Address();
        address.setCity(city);
        address.setStreet(street);
        address.setBuildingNumber(number);
        return address;
    }

    /** Наполняет библиотеку книгами. */
    private static void addBooksToLibrary(Library library) {
        library.addBook(new Book("Три мушкетёра", "Дюма", 112));
        library.addBook(new Book("1984", "Оруэл", 318));
    }

    /** Наполняет библиотеку газетами. */
    private static void addNewspapersToLibrary(Library library) {
        library.addNewspaper(new Newspaper("Ведомости"));
        library.addNewspaper(new Newspaper("Коммерсант"));
        library.addNewspaper(new Newspaper("Метро"));
    }

    /** Наполняет библиотеку журналами. */
    private static void addMagazines(Library library) {
        library.addMagazine(new MonthlyMagazine("Рога и копыта", 21));
        library.addMagazine(new MonthlyMagazine("Весёлый молочник", 231));
        library.addMagazine(new WeeklyMagazine("Охотник", 125));
    }

    /** Наполняет библиотеку посетителями. */
    private static void addClientsToLibrary(Library library) {
        library.addClient(new Client("Пётр Петров"));
        library.addClient(new Client("Иван Иванов"));
        library.addClient(new Client("Сидор Сидоров"));
    }
}
