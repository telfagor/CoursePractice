package help;

import lesson12.homework.garage.Customer;
import java.util.Scanner;

public class Helper {
    private static Scanner scanner = new Scanner(System.in);

    public static double validateDoubleInputValue() {
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

    public static void printVector(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int validateIntInputValue(int min, int max) {
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
                if (scanner.hasNextDouble()) {
                    System.out.print("Enter an integer: ");
                } else {
                    System.out.print("Enter a numeric value: ");
                }
                scanner.nextLine();
            }
        }
        return number;
    }
}
