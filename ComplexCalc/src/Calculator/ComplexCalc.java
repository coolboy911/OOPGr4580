package Calculator;

import ComplexNumber.ComplexNumber;

public class ComplexCalc implements iCalc {
    ComplexNumber primaryArg;
    
    /**
     * создание калькулятора с числом ужев буфере
     * @param primaryArg - комплексное число с которого будут начинаться подсчеты
     * @return Сущность Калькулятор
     */
    public ComplexCalc(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }
    /**
     * создание калькулятора с Комплексным числом с нулемыми аргументами
     * @return Сущность Калькулятор
     */
    public ComplexCalc() {
        this(new ComplexNumber(0, 0));
    }

    @Override
    public iCalc add(ComplexNumber arg) {
        primaryArg.setRealPart(primaryArg.getRealPart() + arg.getRealPart());
        primaryArg.setImaginaryPart(primaryArg.getImaginaryPart() + arg.getImaginaryPart());
        return this;
    }

    @Override
    public iCalc subtract(ComplexNumber arg) {
        primaryArg.setRealPart(primaryArg.getRealPart() - arg.getRealPart());
        primaryArg.setImaginaryPart(primaryArg.getImaginaryPart() - arg.getImaginaryPart());
        return this;
    }

    @Override
    public iCalc multiply(ComplexNumber arg) {
        primaryArg.setRealPart(primaryArg.getRealPart() * arg.getRealPart());
        primaryArg.setImaginaryPart(primaryArg.getImaginaryPart() * arg.getImaginaryPart());
        return this;
    }

    @Override
    public iCalc devide(ComplexNumber arg) {
        primaryArg.setRealPart(primaryArg.getRealPart() / arg.getRealPart());
        primaryArg.setImaginaryPart(primaryArg.getImaginaryPart() / arg.getImaginaryPart());
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
