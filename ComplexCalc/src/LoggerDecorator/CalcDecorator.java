package LoggerDecorator;

import Calculator.iCalc;
import ComplexNumber.ComplexNumber;

public class CalcDecorator implements iCalc {
    private iCalc oldCalc;
    private Logger logger;

    public CalcDecorator(iCalc oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalc add(ComplexNumber arg) {
        logger.log("выполяем операцию сложения");
        return oldCalc.add(arg);
    }

    @Override
    public iCalc subtract(ComplexNumber arg) {
        logger.log("выполняем операцию вычитания");
        return oldCalc.subtract(arg);
    }

    @Override
    public iCalc multiply(ComplexNumber arg) {
        logger.log("выполняем операцию умножения");
        return oldCalc.multiply(arg);
    }

    @Override
    public iCalc devide(ComplexNumber arg) {
        logger.log("выполняем операцию деления");
        return oldCalc.subtract(arg);
    }

    @Override
    public ComplexNumber getResult() {
        logger.log("возвращяем значение из калькулятора");
        return oldCalc.getResult();
    }

    
}
