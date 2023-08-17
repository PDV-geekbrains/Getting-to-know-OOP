package class_07_01.core.Models;

import class_07_01.core.Interfaces.IComplexNumber;
import class_07_01.core.Interfaces.IMathOperation;

public class MultiplicationOperation implements IMathOperation {
    private String operationType;
    private IComplexNumber firstArgument;
    private IComplexNumber secondArgument;
    private IComplexNumber operationRezult;

    public MultiplicationOperation(IComplexNumber operationRezult) {
        this.operationType = "multiplication";
        this.operationRezult = operationRezult;
    }

    @Override
    public void doOperation(IComplexNumber firstArgument, IComplexNumber secondArgument) {
        /** Сохранение аргументов. */
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        /** Выполнение операции. */
        this.operationRezult.setRealPart(
            this.firstArgument.getRealPart() * this.secondArgument.getRealPart() -
            this.firstArgument.getImaginaryPart() * this.secondArgument.getImaginaryPart()
        );
        this.operationRezult.setImaginaryPart(
            this.firstArgument.getRealPart() * this.secondArgument.getImaginaryPart() +
            this.firstArgument.getImaginaryPart() * this.secondArgument.getRealPart()
        );
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
    
        return "(" + firstArgRealPrt + " + " + firstArgImPrt + "i) x (" +
                secondArgRealPrt + " + " + secondArgImPrt + "i) = (" +
                rezultRealPrt + " + " + rezultImPrt + "i)";
    }
    
}
