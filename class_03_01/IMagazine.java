package class_03_01;

import class_02.*;

/**
 * Интерфейс описывает сущность Журнал.
 */
public interface IMagazine {
    /** Тип периодического издания. */
    static final PublicationType TYPE = PublicationType.MAGAZINE;
    

    PublicationType getPublicationType();

    default PublicationPeriod getPublicationPeriod() {
        return PublicationPeriod.WEEKLY;
    }
    
    String getMagazineName();

    void setMagazineName(String name);

    Integer getPagesNumber();

    void setPagesNumber(Integer number);
}