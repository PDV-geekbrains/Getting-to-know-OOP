package class_07_01.core.Interfaces;

/** Интерфейс описывает сущность Комплексное Число. */
public interface IComplexNumber {
    /**
     * Метод сохраняет действительную часть комплексного числа.
     * @param realPart - действительная часть комплексного числа.
     */
    public void setRealPart(double realPart);

    /**
     * Метод возвращает действительную часть комплексного числа.
     * @return - действительная часть комплексного числа.
     */
    public double getRealPart();

    /**
     * Метод сохраняет мнимую часть комплексного числа.
     * @param imaginaryPart - мнимая часть комплексного числа.
     */
    public void setImaginaryPart(double imaginaryPart);

    /**
     * Метод возвращает мнимую часть комплексного числа.
     * @return - мнимая часть комплексного числа.
     */
    public double getImaginaryPart();

    /**
     * Метод сохраняет комплексное число.
     * @param realPart - действительная часть комплексного числа.
     * @param imaginaryPart - мнммая часть комплексного числа.
     */
    public void setComplexNumber(double realPart, double imaginaryPart);
}
