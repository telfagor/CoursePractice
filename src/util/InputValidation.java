package util;

import java.util.Scanner;

public class InputValidation {
    final Scanner scanner = new Scanner(System.in);

    public double validateDoubleInputValue() {
        double number;
        while (true) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                if (number > 0) {
                    break;
                } else {
                    System.out.print("Enter a value greater than zero: ");
                }
            } else {
                System.out.print("Enter a numeric value: ");
            }
            scanner.nextLine();
        }
        scanner.nextLine();
        return number;
    }

    public int validateIntInputValue(int min, int max, String value) {
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= min && number <= max) {
                    break;
                } else {
                    System.out.println("Enter a value from " + min + " to " + max);
                    System.out.print("Enter the " + value + ": ");
                }
            } else {
                System.out.print("Enter an integer: ");
            }
            scanner.nextLine();
        }
        scanner.nextLine();
        return number;
    }

    public int validateIntInputValue() {
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                }
                else {
                    System.out.print("Enter a value greater than zero: ");
                }
            } else {
                System.out.print("Enter an integer: ");
            }
            scanner.nextLine();
        }
        scanner.nextLine();
        return number;
    }

    public String askString() {
        return scanner.nextLine();
    }

    public String askStringNext() {
        return scanner.next();
    }
}
