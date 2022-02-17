package lesson9.homework.area.rectangle;

import help.Helper;

public class Main {

    public static void main(String[] args) {
        Area rectangle = new Area();
        System.out.println("We will calculate the area of a rectangle");
        System.out.println("The values must be greater than zero");
        System.out.print("Enter the width: ");
        double width = Helper.validateDoubleInputValue();
        System.out.print("Enter the height: ");
        double height = Helper.validateDoubleInputValue();
        rectangle.setDim(width, height);
        double rectangleArea = rectangle.getDim();
        System.out.printf("The rectangle's area is: %.2f", rectangleArea);
    }
}
