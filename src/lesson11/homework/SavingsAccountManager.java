package lesson11.homework;

import java.util.List;

public final class SavingsAccountManager {
    private static final String separator = System.lineSeparator();
    private static double annualInterestRate;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void modifyAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate > 0) {
            SavingsAccountManager.annualInterestRate = annualInterestRate;
        }
    }

    public static void printSavingsBalance(List <SavingsAccount> list) {
        for (SavingsAccount savingsAccount : list) {
            System.out.printf("The saver1 sold: %.2f" + separator, savingsAccount.getSavingsBalance());
        }
    }
}
