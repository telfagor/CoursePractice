package lesson5.homework;

import util.*;

public class CheckNumber {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        int number = input.askInt("Enter an integer: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        input.close();
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
