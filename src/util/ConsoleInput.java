package util;

public class ConsoleInput implements Input {
    private final InputValidation input = new InputValidation();

    @Override
    public double askDouble(String message) {
        System.out.print(message);
        return input.validateDoubleInputValue();
    }

    @Override
    public int askInt(String message, int min, int max) {
        System.out.print(message);
        return input.validateIntInputValue(min, max);
    }

    @Override
    public String askString(String message) {
        System.out.println(message);
        return input.askString();
    }

    public void close() {
        input.scanner.close();
    }
}
