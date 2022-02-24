package lesson5.homework;

import util.*;

public class Rectangles {

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        System.out.println("You need to enter the width and height for two rectangles");
        System.out.println("Values must be greater than zero");
        double firstRectangleWidth = input.askDouble("The width for first rectangle: ");
        double firstRectangleHeight = input.askDouble("The height for first rectangle: ");
        double secondRectangleWidth = input.askDouble("The width for second rectangle: ");
        double secondRectangleHeight = input.askDouble("The height for second rectangle: ");
        input.close();
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
