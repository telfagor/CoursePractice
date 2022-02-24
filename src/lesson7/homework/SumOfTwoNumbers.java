package lesson7.homework;

import util.*;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        boolean run = true;
        do {
            System.out.println("Enter two numbers");
            double a = input.askDouble("Enter the first number: ");
            double b = input.askDouble("Enter the second number: ");
            System.out.println("The sum: " + (a + b));
            String answer = input.askString("Do you want to repeat the action? Y/N");
            if (!"Y".equalsIgnoreCase(answer)) {
                run = false;
                input.close();
            }
        }while (run);
    }
}
