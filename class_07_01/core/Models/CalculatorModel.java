package class_07_01.core.Models;

import java.util.LinkedList;
import java.util.List;

import class_07_01.core.Interfaces.ICalculatorModel;
import class_07_01.core.Interfaces.IMathOperation;


public class CalculatorModel implements ICalculatorModel {
    private List<IMathOperation> mathOperations;

    /**
     * Конструктор.
     */
    public CalculatorModel() {
        this.mathOperations = new LinkedList<IMathOperation>();
    }

    @Override
    public void saveMathOperation(IMathOperation mathOperation) {
        this.mathOperations.add(mathOperation);
    }

    @Override
    public List<IMathOperation> getAllMathOperations() {
        return this.mathOperations;
    }
    
}
