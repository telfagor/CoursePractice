package lesson6.homework;

import java.util.Scanner;

public class CheckTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxTemp = 65.7;
        double minTemp = -54.5;
        double temperature = scanner.nextDouble();
        scanner.close();
        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porridge is too cold.");
        } else {
            System.out.println("Porridge is just right.");
        }
    }
}
