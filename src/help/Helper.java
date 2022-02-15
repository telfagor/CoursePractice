package help;

import java.util.Scanner;

public class Helper {
    public static double validateDoubleInputValue() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        while (number <= 0) {
            System.out.print("Enter a value greater than zero please: ");
            number = scanner.nextDouble();
        }
        return number;
    }
}
