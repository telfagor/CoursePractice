package lesson12.homework.garage;

import java.util.Scanner;
import lesson12.homework.prime.PrimeNumbers;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //The first problem
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        getAction(customer1);
        getAction(customer2);
        scanner.close();
        Customer[] clients = {customer1, customer2};
        System.out.println("Total profit: " + ParkingGarage.calculateTotalProfit(clients) + "$");

        //The second problem
        //int counter = PrimeNumbers.getCountPrimeNumbers(0, 10000);
        //System.out.println("In the interval are " + counter + " prime numbers");
    }

    private static void getAction(Customer client) {
        System.out.println("Welcome to our cheap garage park!");
        System.out.print("How many hours do you want to park: ");
        int hours = validateIntInputValue();
        client.setParkedHours(hours);
        client.calculateCharges();
        System.out.println("Customer fee: " + client.getClientCharge() + "$");
        System.out.println();
    }

    private static int validateIntInputValue() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0 && number <= 24) {
                    break;
                } else {
                    System.out.print("Enter a value from 0 to 24: ");
                    scanner.nextLine();
                }
            } else {
                if (scanner.hasNextDouble()) {
                    System.out.print("Enter an integer: ");
                } else {
                    System.out.print("Enter a numeric value: ");
                }
                scanner.nextLine();
            }
        }
        return number;
    }
}
