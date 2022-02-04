package lesson5.homework;

import java.util.Scanner;

public class Rectangles {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You need to enter the width and height for two rectangles");
        System.out.println("Values must be greater than zero");
        System.out.print("The width for first rectangle: ");
        double firstRectangleWidth = scanner.nextDouble();
        if (firstRectangleWidth <= 0) {
            firstRectangleWidth = validateInputValue();
        }
        System.out.print("The height for first rectangle: ");
        double firstRectangleHeight = scanner.nextDouble();
        if (firstRectangleHeight <= 0) {
            firstRectangleHeight = validateInputValue();
        }
        System.out.print("The width for second rectangle: ");
        double secondRectangleWidth = scanner.nextDouble();
        if (secondRectangleWidth <= 0) {
            secondRectangleWidth = validateInputValue();
        }
        System.out.print("The height for second rectangle: ");
        double secondRectangleHeight = scanner.nextDouble();
        if (secondRectangleHeight <= 0) {
            secondRectangleHeight = validateInputValue();
        }
        scanner.close();
        double firstRectangleArea  = firstRectangleWidth  * firstRectangleHeight;
        double secondRectangleArea = secondRectangleWidth * secondRectangleHeight;
        if (firstRectangleArea > secondRectangleArea) {
            System.out.println("The first rectangle is larger than the second");
        } else if (firstRectangleArea < secondRectangleArea) {
            System.out.println("The second rectangle is larger than the first");
        } else {
            System.out.println("The rectangles are equal");
        }
    }

    public static double validateInputValue() {
        double number = 0.0;
        while (number <= 0) {
            System.out.print("Enter a value greater than zero please: ");
            number = scanner.nextDouble();
        }
        return number;
    }
}
