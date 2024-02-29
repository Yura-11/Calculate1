package calculator;

import input.InputReader;
import complexoperations.ComplexNumber;
import complexoperations.ComplexOperationFactory;
import complexoperations.ComplexOperation;

public class CalculatorApp {
    private final InputReader inputReader;


    public CalculatorApp(InputReader inputReader) {
        this.inputReader = inputReader;
    }



    public void run() {
        System.out.println("Выберите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        int choice = inputReader.getComplexOperationChoice();

        double realPart1 = inputReader.getOperand("Введите реальное первое число: ");
        double imaginaryPart1 = inputReader.getOperand("Введите мнимое первое число: ");
        double realPart2 = inputReader.getOperand("Введите реальное второе число: ");
        double imaginaryPart2 = inputReader.getOperand("Введите мнимое второе число: ");

        ComplexNumber operand1 = new ComplexNumber(realPart1, imaginaryPart1);
        ComplexNumber operand2 = new ComplexNumber(realPart2, imaginaryPart2);

        ComplexOperation complexOperation = ComplexOperationFactory.createComplexOperation(choice);
        Calculator calculator = new Calculator(complexOperation);

        ComplexNumber result = calculator.performComplexOperation(operand1, operand2);
        System.out.println("Результат: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}
