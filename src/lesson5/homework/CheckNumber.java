package lesson5.homework;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
