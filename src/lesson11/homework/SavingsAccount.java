package lesson11.homework;

public class SavingsAccount {

    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double currentMonthlyInterest = savingsBalance * SavingsAccountManager.getAnnualInterestRate() / 12;
        savingsBalance += currentMonthlyInterest;
    }
}
