package lesson9.homework.area.rectangle;

import util.*;

public class Main {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Area rectangle = new Area();
        System.out.println("We will calculate the area of a rectangle");
        System.out.println("The values must be greater than zero");
        double width = input.askDouble("Enter the width: ");
        double height = input.askDouble("Enter the height: ");
        rectangle.setDim(width, height);
        double rectangleArea = rectangle.getDim();
        System.out.printf("The rectangle's area is: %.2f", rectangleArea);
    }
}
