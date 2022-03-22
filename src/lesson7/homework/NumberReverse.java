package lesson7.homework;

import util.*;

public class NumberReverse {

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int rest = number % 10;
            reverse = reverse * 10 + rest;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        int number = input.askInt("Enter the number please: ");
        input.close();
        System.out.println(reverse(number));
    }
}
