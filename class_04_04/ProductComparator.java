package class_04_04;

import java.util.Comparator;

/** Класс описывает компаратор, сравнивающий товары по ценам. */
public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        double delta = p1.getPrice() - p2.getPrice();
        if(delta != 0)
            return delta > 0 ? 1 : -1;
        else
            return 0;
    }
    
}
