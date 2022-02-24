package lesson12.homework.garage;

import util.*;

public class Helper {
     static void getAction(Customer client) {
         Input input = new ConsoleInput();
        System.out.println("Welcome to our cheap garage park!");
        int hours = input.askInt("How many hours do you want to park: ", 1, 24);
        client.setParkedHours(hours);
        client.calculateCharges();
        System.out.println("Customer fee: " + client.getClientCharge() + "$");
        System.out.println();
    }
}
