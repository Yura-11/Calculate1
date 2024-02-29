package calculator;

import complexoperations.ComplexOperation;
import complexoperations.ComplexNumber;

public class Calculator {

    private ComplexOperation complexOperation;

    public Calculator(ComplexOperation complexOperation) {
        this.complexOperation = complexOperation;
    }

    public ComplexNumber performComplexOperation(ComplexNumber operand1, ComplexNumber operand2) {
        return complexOperation.calculate(operand1, operand2);
    }


}
