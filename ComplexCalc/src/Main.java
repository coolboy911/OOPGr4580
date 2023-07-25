import Calculator.ViewCalc;
import Calculator.iCalc;
import LoggerDecorator.CalcDecorator;
import LoggerDecorator.Logger;

public class Main {
    public static void main(String[] args) {
        // создаем базовые кальулятор и логгер
        iCalc ComplexCalc = new Calculator.ComplexCalc();
        Logger logger = new Logger();
        // создаем декоратор с только что созданными аргументами
        iCalc CalcDecorator = new CalcDecorator(ComplexCalc, logger);

        // запускаем View с декоратором
        ViewCalc viewCalc = new ViewCalc(CalcDecorator);
        viewCalc.run();
    }
}
