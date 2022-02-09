package lesson5.homework;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a comma number: ");
        double number = scanner.nextDouble();
        scanner.close();
        if (number > 0 && number < 1) {
            System.out.println("Positive small");
        } else if (number > 0 && number <= 1_000_000) {
            System.out.println("Positive");
        } else if (number > 1_000_000) {
            System.out.println("Positive large");
        } else if (number < 0 && Math.abs(number) < 1) {
            System.out.println("Negative small");
        } else if (number < 0 && Math.abs(number) > 1_000_000) {
            System.out.println("Negative large");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

