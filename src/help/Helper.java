package help;

import java.util.Scanner;

public class Helper {
    public static double validateDoubleInputValue() {
        Scanner scanner = new Scanner(System.in);

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
        //scanner.close();
        return number;
    }

    public static void printVector(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
