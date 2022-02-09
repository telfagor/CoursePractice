package lesson7.homework;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        do {
            System.out.println("Enter two numbers");
            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();
            System.out.println("The sum: " + (a + b));
            System.out.println("Do you want to repeat the action? Y/N");
            String answer = scanner.next();
            if (!"Y".equalsIgnoreCase(answer)) {
                run = false;
                scanner.close();
            }
        }while (run);
    }
}
