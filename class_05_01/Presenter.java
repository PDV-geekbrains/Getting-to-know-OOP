package class_05_01;

public class Presenter {
    private ICalculatorModel model;
    private View view;

    public Presenter(ICalculatorModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        String text1, text2;
        double in1, in2;
        switch (view.mainMenu()) {
            // Сложение.
            case 1:
                text1 = "Введите первое слагаемое: ";
                text2 = "Введите второе слагаемое: ";
                model.add(view.getUserInput(text1), view.getUserInput(text2));
                if (!model.getException().getStatus())
                    view.print(model.getArg1() + " + " + model.getArg2() + " = " + model.getResult());
                else
                    System.out.println("Ошибка. " + model.getException().getMessage());
                break;
            // Вычитание.
            case 2:
                text1 = "Введите уменьшаемое: ";
                text2 = "Введите вычитаемое: ";
                model.subtract(view.getUserInput(text1), view.getUserInput(text2));
                if (!model.getException().getStatus())
                    view.print(model.getArg1() + " - " + model.getArg2() + " = " + model.getResult());
                else
                    System.out.println("Ошибка. " + model.getException().getMessage());
                break;
            // Умножение.
            case 3:
                text1 = "Введите первый сомножитель: ";
                text2 = "Введите второй сомножитель: ";
                model.multiply(view.getUserInput(text1), view.getUserInput(text2));
                if (!model.getException().getStatus())
                    view.print(model.getArg1() + " * " + model.getArg2() + " = " + model.getResult());
                else
                    System.out.println("Ошибка. " + model.getException().getMessage());
                break;
            // Деление.
            case 4:
                text1 = "Введите делимое: ";
                text2 = "Введите делитель: ";
                model.divide(view.getUserInput(text1), view.getUserInput(text2));
                if (!model.getException().getStatus())
                    view.print(model.getArg1() + " / " + model.getArg2() + " = " + model.getResult());
                else
                    System.out.println("Ошибка. " + model.getException().getMessage());
                break;
            default:
                System.out.println("Ошибка. Необходимо ввести число от 1 до 4.");
        }
    }
}
