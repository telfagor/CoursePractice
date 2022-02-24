package lesson6.homework;

import util.*;

public class CheckTemperature {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        double maxTemp = 65.7;
        double minTemp = -54.5;
        double temperature = input.askDouble("Enter temperature: ");
        input.close();
        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porridge is too cold.");
        } else {
            System.out.println("Porridge is just right.");
        }
    }
}
