package Calculator;

import java.util.Scanner;

import ComplexNumber.ComplexNumber;

public class ViewCalc {
    private iCalc calculator;

    public ViewCalc(iCalc calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент: ");
            calculator.add(primaryArg);
            // iCalc calculator = CalculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, -, *, /, =) : ");
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.add(arg);
                    continue;
                }
                    if (cmd.equals("-")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.subtract(arg);
                    continue;
                }
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.multiply(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.devide(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат ", result);
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                // обнуление (Был баг, значение оставалось при перезапуске)
                calculator.subtract(calculator.getResult());
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextDouble();
    }

    private ComplexNumber promptComplexNumber(String message) {
        System.out.println(message);
        double realPart = promptDouble(" введите реальную часть первого аргумента: ");
        double imaginaryPartPart = promptDouble(" введите мнимую часть первого аргумента: ");
        ComplexNumber primaryArg = new ComplexNumber(realPart, imaginaryPartPart);
        return primaryArg;
    }
}
