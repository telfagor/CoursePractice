package lesson11.homework;

public class SavingsAccount {
    private static String separator = System.lineSeparator();
    private static double annualInterestRate;

    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest() {
        double currentMonthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += currentMonthlyInterest;
    }

    public static void printSavingsBalance(SavingsAccount saver1, SavingsAccount saver2) {
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("The saver1 sold: %.2f" + separator, saver1.getSavingsBalance());
        System.out.printf("The saver2 sold: %.2f" + separator, saver2.getSavingsBalance());
    }
}
