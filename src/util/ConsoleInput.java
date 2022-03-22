package util;

public class ConsoleInput implements Input {
    private final InputValidation input = new InputValidation();

    @Override
    public double askDouble(String message) {
        System.out.print(message);
        return input.validateDoubleInputValue();
    }

    @Override
    public int askInt(String message, int min, int max, String value) {
        System.out.print(message);
        return input.validateIntInputValue(min, max, value);
    }

    @Override
    public int askInt(String message) {
        System.out.print(message);
        return input.validateIntInputValue();
    }

    @Override
    public String askString(String message) {
        System.out.print(message);
        return input.askString();
    }

    @Override
    public String askStringNext() {
        return input.askStringNext();
    }

    @Override
    public String askString() {
        return input.askString();
    }

    public void close() {
        input.scanner.close();
    }
}
