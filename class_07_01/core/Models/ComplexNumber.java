package class_07_01.core.Models;

import class_07_01.core.Interfaces.IComplexNumber;

public class ComplexNumber implements IComplexNumber {
    private double realPart;
    private double imaginaryPart;

    @Override
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    @Override
    public double getRealPart() {
        return this.realPart;
    }

    @Override
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public void setComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
}
