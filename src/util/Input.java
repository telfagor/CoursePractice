package util;

public interface Input {
    public double askDouble(String message);

    public int askInt(String message, int min, int max);

    public String askString(String message);
}
