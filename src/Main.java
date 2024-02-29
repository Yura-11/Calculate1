import calculator.CalculatorApp;
import input.InputReader;

public class Main {
    public static void main(String[] args) {
        try (InputReader inputReader = new InputReader()) {
            CalculatorApp calculatorApp = new CalculatorApp(inputReader);
            calculatorApp.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}