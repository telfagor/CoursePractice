package util;

import java.util.Scanner;

public class InputValidation {
    final Scanner scanner = new Scanner(System.in);

    public double validateDoubleInputValue() {
        double number = 0.0;
        while (true) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                if (number > 0) {
                    break;
                } else {
                    System.out.print("Enter a value greater than zero: ");
                    scanner.nextLine();
                }
            } else {
                System.out.print("Enter a numeric value: ");
                scanner.nextLine();
            }
        }
        return number;
    }

    public int validateIntInputValue(int min, int max) {
        int number = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= min && number <= max) {
                    break;
                } else {
                    System.out.print("Enter a value from " + min + "to " + max);
                    scanner.nextLine();
                }
            } else {
                System.out.print("Enter an integer: ");
                scanner.nextLine();
            }
        }
        return number;
    }

    public String askString() {
        return scanner.nextLine();
    }
}
