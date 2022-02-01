package Lesson4.homework;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 5.45;
        double tax = 6.78;
        int quantity = 9;
        double total = price * quantity * tax;
        System.out.println(total);
    }
}
