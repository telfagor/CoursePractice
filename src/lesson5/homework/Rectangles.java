package lesson5.homework;

import help.Helper;

import java.util.Scanner;

public class Rectangles {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You need to enter the width and height for two rectangles");
        System.out.println("Values must be greater than zero");
        System.out.print("The width for first rectangle: ");
        double firstRectangleWidth = Helper.validateDoubleInputValue();
        System.out.print("The height for first rectangle: ");
        double firstRectangleHeight = Helper.validateDoubleInputValue();
        System.out.print("The width for second rectangle: ");
        double secondRectangleWidth = Helper.validateDoubleInputValue();
        System.out.print("The height for second rectangle: ");
        double secondRectangleHeight = Helper.validateDoubleInputValue();
        scanner.close();
        double firstRectangleArea  = calcRectangleArea(firstRectangleWidth, firstRectangleHeight);
        double secondRectangleArea = calcRectangleArea(secondRectangleWidth, secondRectangleHeight);
        identifyTheLargestArea(firstRectangleArea, secondRectangleArea);
    }

    public static double calcRectangleArea(double width, double height) {
        return width * height;
    }

    public static void identifyTheLargestArea(double firstArea, double secondArea) {
        if (firstArea > secondArea) {
            System.out.println("The first rectangle is larger than the second");
        } else if (firstArea < secondArea) {
            System.out.println("The second rectangle is larger than the first");
        } else {
            System.out.println("The rectangles are equal");
        }
    }
}
