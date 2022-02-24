package lesson5.homework;

import util.*;

public class Number {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        double number = input.askDouble("Please enter a comma number: ");
        input.close();
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

