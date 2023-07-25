package Calculator;

import ComplexNumber.ComplexNumber;

public interface iCalc {
    /**
     * Складывает комплексные числа
     * @param arg - слагаемое
     * @return
     */
    public iCalc add(ComplexNumber arg);
    /**
     * вычитает комплексные числа
     * @param arg - вычитаемое
     * @return
     */
    public iCalc subtract(ComplexNumber arg);
    /**
     * умножает комплексные числа
     * @param arg - умножаемое
     * @return
     */
    public iCalc multiply(ComplexNumber arg);
    /**
     * разделяет комплексные числа
     * @param arg - разделяющее
     * @return
     */
    public iCalc devide(ComplexNumber arg);
    /**
     * возвращает комплексное чесло в буфере калькулятора
     * @return
     */
    public ComplexNumber getResult();
}
