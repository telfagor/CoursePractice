package lesson5.homework;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a comma number: ");
        double number = scanner.nextDouble();
        if (-(-number) < 1_000_000) {
            System.out.println("Positive");
        } else if (-(-number) > 1_000_000) {
            System.out.println("Positive large");
        } else if (-(-number) < 1) {
            System.out.println("Negative small");
        } else {
            System.out.println("zero");
        }
    }
}

//O parere: faptul ca trebuie neaparat sa adaugam "Positive" sau "Negative" creeaza confuzie,
//deoarece valoarea absoluta va fi intodeauna pozitiva, dar nu stim ce a introdus
//utilizatorul de la tastatura
