package lesson9.homework.area.rectangle;

import java.util.Scanner;

public class Area {
    private Scanner scanner = new Scanner(System.in);
    private double width;
    private double height;

    public void setDim() {
        System.out.println("We will calculate the area of a rectangle");
        System.out.print("Enter the width: ");
        width = validateInputValue();
        System.out.print("Enter the length: ");
        height = validateInputValue();
        scanner.close();
    }

    public double getDim() {
        return width * height;
    }

    private double validateInputValue() {
        double input = scanner.nextDouble();
        while (input <= 0) {
            System.out.println("The value must be greater than zero");
            System.out.print("Enter again: ");
            input = scanner.nextDouble();
        }
        return input;
    }
}
