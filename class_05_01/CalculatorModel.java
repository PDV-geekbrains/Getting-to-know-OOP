package class_05_01;

public class CalculatorModel implements ICalculatorModel {
    private double result;
    private double arg1;
    private double arg2;
    private ICalculatorException e;

    public CalculatorModel(ICalculatorException e) {
        this.e = e;
    }

    public ICalculatorException getException() {
        return this.e;
    }

    public double getArg1() {
        return this.arg1;
    }

    public double getArg2() {
        return this.arg2;
    }

    public double getResult() {
        return this.result;
    }

    public void add(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = arg1 + arg2;
    }

    public void subtract(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = arg1 - arg2;
    }

    public void multiply(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = arg1 * arg2;
    }

    public void divide(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        if (arg2 != 0)
            this.result = arg1 / arg2;
        else {
            e.setStatus(true);
            e.setMessage("Делить на 0 нельзя.");
        }
    }
}
