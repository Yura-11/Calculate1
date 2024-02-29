package input;

import java.util.Scanner;

public class InputReader implements AutoCloseable {
    private final Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void close() {
        scanner.close();
    }

    public int getComplexOperationChoice() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введите корректное число!");
                scanner.nextLine();
            }
        }
    }

    public double getOperand(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введите коррекное число!");
                scanner.nextLine();
            }
        }
    }
}