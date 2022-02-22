package lesson12.homework.garage;

import lesson12.homework.garage.Customer;

public class ParkingGarage {
    private static final double minCost = 2.0;
    private static final double additionalCost = 0.5;
    private static final double maxCost = 10;
    private static double totalProfit;

    public static double getMinCost() {
        return minCost;
    }

    public static double getAdditionalCost() {
        return additionalCost;
    }

    public static double getMaxCost() {
        return maxCost;
    }

    public static double getTotalProfit() {
        return totalProfit;
    }

    public static double calculateTotalProfit(Customer[] clients) {
        double sum = 0.0;
        for (Customer client : clients) {
            sum += client.getClientCharge();
        }
        return sum;
    }
}
