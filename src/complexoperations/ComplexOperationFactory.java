package complexoperations;

public class ComplexOperationFactory {
    public static ComplexOperation createComplexOperation(int choice) {
        return switch (choice) {
            case 1 -> new ComplexAddition();
            case 2 -> new ComplexSubtraction();
            case 3 -> new ComplexMultiplication();
            case 4 -> new ComplexDivision();
            default -> throw new IllegalArgumentException("Неверная операция!");
        };
    }
}