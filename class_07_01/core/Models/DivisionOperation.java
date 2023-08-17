package class_07_01.core.Models;

import class_07_01.core.Interfaces.IComplexNumber;
import class_07_01.core.Interfaces.IMathOperation;

public class DivisionOperation implements IMathOperation {
    private String operationType;
    private IComplexNumber firstArgument;
    private IComplexNumber secondArgument;
    private IComplexNumber operationRezult;

    public DivisionOperation(IComplexNumber operationRezult) {
        this.operationType = "division";
        this.operationRezult = operationRezult;
    }

    @Override
    public void doOperation(IComplexNumber firstArgument, IComplexNumber secondArgument) {
        double sum1 = firstArgument.getRealPart() * secondArgument.getRealPart() +
            firstArgument.getImaginaryPart() * secondArgument.getImaginaryPart();
        double sum2 = secondArgument.getRealPart() * secondArgument.getRealPart() + 
            secondArgument.getImaginaryPart() * secondArgument.getImaginaryPart();
        double sum3 = firstArgument.getImaginaryPart() * secondArgument.getRealPart() -
            firstArgument.getRealPart() * secondArgument.getImaginaryPart();

        this.operationRezult.setRealPart(sum1 / sum2);
        this.operationRezult.setImaginaryPart(sum3 / sum2);
    }

    @Override
    public IComplexNumber getFirstArgument() {
        return this.firstArgument;
    }

    @Override
    public IComplexNumber getSecondArgument() {
        return this.secondArgument;
    }

    @Override
    public IComplexNumber getOperationResult() {
        return this.operationRezult;
    }

    @Override
    public String getOperationType() {
        return this.operationType;
    }

    @Override
    public String getOperationInLine() {
        // Округлить значения до 2-х знаков после запятой.
        double firstArgRealPrt =
            Math.round(this.firstArgument.getRealPart() * 100.0) / 100.0;
        double firstArgImPrt =
            Math.round(this.firstArgument.getImaginaryPart() * 100.0) / 100.0;
        double secondArgRealPrt =
            Math.round(this.secondArgument.getRealPart() * 100.0) / 100.0;
        double secondArgImPrt =
            Math.round(this.secondArgument.getImaginaryPart() * 100.0) / 100.0;
        double rezultRealPrt =
            Math.round(this.operationRezult.getRealPart() * 100.0) / 100.0;
        double rezultImPrt =
            Math.round(this.operationRezult.getImaginaryPart() * 100.0) / 100.0;
    
        return "(" + firstArgRealPrt + " + " + firstArgImPrt + "i) / (" +
                secondArgRealPrt + " + " + secondArgImPrt + "i) = (" +
                rezultRealPrt + " + " + rezultImPrt + "i)";
    }
    
}
