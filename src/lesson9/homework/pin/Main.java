package lesson9.homework.pin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput = readPassword();
        boolean isTruePassword = Password.checkPassword(userInput);
        if (isTruePassword) {
            System.out.println("Correct, welcome back.");
        } else {
            repeatPassword();
        }
    }

    public static String readPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password please: ");
        return scanner.next();
    }

    public static void repeatPassword() {
        boolean flag = false;
        for (int i = 0; true; i++) {
            String userInput = readPassword();
            if (Password.checkPassword(userInput)) {
                System.out.println("Correct, welcome back.");
                flag = true;
                break;
            } else {
                if (i == 2) {
                    break;
                }
                System.out.println("Incorrect, try again.");
            }
        }
        if (!flag) {
            System.out.println("Sorry but you have been locked out.");
        }
    }
}
