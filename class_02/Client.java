package class_02;

/** Класс описывает сущность Посетитель бибдиотеки. */
public class Client implements IClient {
    private String fullName;

    /**
     * Конструктор.
     * Задаёт полное имя клиента.
     * @param fullName - полное имя клиента.
     */
    Client(String fullName) {
        this.fullName = fullName;
    }
 
    public void setFullName(String name) {
        this.fullName = name;
    }
    public String getFullName() {
        return this.fullName;
    }
    
}
