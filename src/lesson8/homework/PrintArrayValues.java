package lesson8.homework;

import java.util.Scanner;

public class PrintArrayValues {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?");
        System.out.println("The value must be greater than zero");
        System.out.print("Indicate: ");
        int size = validateSize();
        if (size == 0) {
            System.exit(0);
        }
        int[] array = initializeArray(size);
        printArray(array);
    }

    public static int validateSize() {
        int size = scanner.nextInt();
        while (size < 0) {
            System.out.println("The value must be greater than zero");
            System.out.print("Indicate again: ");
            size = scanner.nextInt();
        }
        return size;
    }

    public static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("The entered numbers are:");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
