package lesson9.homework.area.rectangle;

import help.Helper;

public class Main {

    public static void main(String[] args) {
        Area rectangle = new Area();
        double width = Helper.validateDoubleInputValue();
        double height = Helper.validateDoubleInputValue();
        rectangle.setDim(width, height);
        double rectangleArea = rectangle.getDim();
        System.out.printf("The rectangle's area is: %.2f", rectangleArea);
    }
}
