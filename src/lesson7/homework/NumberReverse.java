package lesson7.homework;

import java.util.Scanner;
import help.Helper;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number please: ");
        int number = Helper.validateIntInputValue(Integer.MIN_VALUE, Integer.MAX_VALUE);
        scanner.close();
        System.out.println(reverse(number));
    }
}
