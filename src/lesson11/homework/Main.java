package lesson11.homework;

import static lesson11.homework.SavingsAccount.*;

public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        modifyAnnualInterestRate(0.04);
        printSavingsBalance(saver1, saver2);
        modifyAnnualInterestRate(0.05);
        printSavingsBalance(saver1, saver2);
    }
}
