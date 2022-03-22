package lesson5.homework;

import util.ConsoleInput;

public class CheckNumber {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        int number = input.askInt("Enter an integer: ");
        input.close();
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
