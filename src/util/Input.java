package util;

public interface Input {
     double askDouble(String message);

     int askInt(String message, int min, int max, String value);

     int askInt(String message);

     String askString(String message);

     String askString();

     String askStringNext();

}
