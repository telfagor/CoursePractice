package lesson9.homework.pin;

public class Password {
    private static final String PASSWORD = "1234";

    public static boolean checkPassword(String userInput) {
        return PASSWORD.equals(userInput);
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
}
