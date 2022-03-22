package lesson5.homework;

import util.*;

/** Write a Java program that reads a floating-point number. If the
* number is zero it prints "zero", otherwise, print "positive" or "negative". Add
* "small" if the absolute value of the number is less than 1, or "large" if it
* exceeds 1,000,000.
 */

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

