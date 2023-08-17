package class_07_01;

import class_07_01.core.Creator;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new Creator());

        presenter.start();
    }
}
