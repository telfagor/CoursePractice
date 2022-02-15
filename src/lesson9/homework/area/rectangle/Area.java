package lesson9.homework.area.rectangle;

import help.Helper;

public class Area {

    private double width;
    private double height;

    public void setDim(double width, double height) {
        System.out.println("We will calculate the area of a rectangle");
        System.out.print("Enter the width: ");
        this.width = width;
        System.out.print("Enter the length: ");
        this.height = height;
    }

    public double getDim() {
        return width * height;
    }
}
