package lesson12.homework.garage;

import lesson12.homework.prime.PrimeNumbers;

public class Main {

    public static void main(String[] args) {
        //The first problem
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Helper.getAction(customer1);
        Helper.getAction(customer2);
        Customer[] clients = {customer1, customer2};
        System.out.println("Total profit: " + ParkingGarage.calculateTotalProfit(clients) + "$");

        //The second problem
        //int counter = PrimeNumbers.getCountPrimeNumbers(0, 10000);
        //System.out.println("In the interval are " + counter + " prime numbers");
    }


}
