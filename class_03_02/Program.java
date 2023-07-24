package class_03_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        /** Наполняем список, добавляя объекты в произвольном порядке. */
        List<TownNews> list = new ArrayList<>();
        list.add(new TownNews("West Side Daily", 1));
        list.add(new TownNews("East Side Monthly", 111));
        list.add(new TownNews("Central Weekly", 50));
        list.add((new TownNews("Bus Daily", 13)));
        
        /** Критерием сравнения является количество страниц издания. */
        Collections.sort(list);
        
        /** Выводим на консоль отсортированный список. */
        for (TownNews item : list) {
            System.out.printf("Название: %s, страниц: %d\n",
                item.getNewspaperName(), item.getpagesNumber());
        }
    }
}
