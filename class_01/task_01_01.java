package class_01;
public class task_01_01 {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.greet();
        Cat cat = new Cat("Мурка", 2);
        cat.greet();

        Owner owner  =new Owner("Вася");
        Cat oneMoreCat = new Cat("Кекс", 4, owner);
        oneMoreCat.greet(owner);
    }
}

/** Класс описывает владельца. */
class Owner {
    /** Имя */
    private String name;

    /**
     * Конструктор.
     * Создаёт экземпляр с именем по умолчанию.
     */
    Owner() {
        this.name = "Иван";
    }

    /**
     * Создаёт экземпляр с произвольным именем.
     * @param name - имя.
     */
    Owner(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя владельца.
     * @return - имя.
     */
    public String getName() {
        return this.name;
    }
}

/** Класс описывает кошку. */
class Cat {
    /** Кличка */
    private String name;

    /** Возраст в годах. */
    private Integer age;

    /** Владелец. */
    private Owner owner;

    /**
     * Конструктор.
     * Создаёт экземпляр кошки со свойствами по умолчанию.
     */
    Cat() {
        this.name = "Бариск";
        this.age = 1;
    }

    /**
     * Конструктор.
     * Создаёт экземпляр кошки с произвольными свойствами.
     * @param name - кличка.
     * @param age - возраст в годах.
     */
    Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Конструктор.
     * Создаёт экземпляр кошки с произвольными свойствами
     * и данными владельца.
     * @param name - кличка кошки.
     * @param age - возраст кошки.
     * @param owner - владелец кошки.
     */
    Cat(String name, Integer age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    /**
     * Возвращает кличку кошки.
     * @return - кличка кошки.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Записывает кличку кошки.
     * @param name - кличка кошки.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает возрвст кошки.
     * @return - возраст кошки в годах.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Записывает возраст кошки.
     * @param age - возраст кошки в годах.
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Возвращает владельца кошки.
     * @return - владелец кошки.
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * Записывает владельца кошки.
     * @param owner - владелец кошки.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    private String makeSentanceEnd() {
        String tail = "";
        switch (this.age) {
            case 1:
                tail = "год";
                break;
            case 2, 3, 4:
                tail = "года";
                break;
            default:
                tail = "лет";
        }
        return tail;
    }

    /**
     * Выводит на консоль приветствие с подстановкой
     * параметров конкретного экземпляра кошки.
     */
    public void greet() {
        String tail = makeSentanceEnd();
        System.out.printf("Мяу! Меня зовут %s. Мне %d %s.\n", this.name, this.age, tail);
    }

    /**
     * Выводит на консоль приветствие с подстановкой
     * параметров конкретного экземпляра кошки и имени владельца.
     * @param owner - владелец кошки.
     */
    public void greet(Owner owner) {
        String tail = makeSentanceEnd();
        System.out.printf("Мяу! Меня зовут %s. Мне %d %s. " +
            "Мой владелец %s.\n", this.name, this.age, tail, this.owner.getName());
    }
}