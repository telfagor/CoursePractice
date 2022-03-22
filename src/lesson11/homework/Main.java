package lesson11.homework;

import java.util.List;
import java.util.ArrayList;
import util.ConsoleInput;


public class Main {
    public static final String separator = System.lineSeparator();
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        List <SavingsAccount> list = new ArrayList<>();

        do {
            SavingsAccount saver = new SavingsAccount();
            list.add(saver);

            System.out.println();
            System.out.println("Welcome to our services!");
            int money = input.askInt("Enter the money: ");
            saver.setSavingsBalance(money);
            double annualInterestRate = input.askDouble("Enter the annual interest rate: ");
            SavingsAccountManager.modifyAnnualInterestRate(annualInterestRate);
            saver.calculateMonthlyInterest();
            String answer = input.askString("Do you want to continue? Y/N" + separator);

            if (!"Y".equalsIgnoreCase(answer)) {
                input.close();
                break;
            }
        } while(true);

        SavingsAccountManager.printSavingsBalance(list);
        System.out.println("Have a nice day!");
    }
}
