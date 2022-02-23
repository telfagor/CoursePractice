package lesson12.homework.garage;

public class Helper {
     static void getAction(Customer client) {
        System.out.println("Welcome to our cheap garage park!");
        System.out.print("How many hours do you want to park: ");
        int hours = help.Helper.validateIntInputValue(1, 24);
        client.setParkedHours(hours);
        client.calculateCharges();
        System.out.println("Customer fee: " + client.getClientCharge() + "$");
        System.out.println();
    }
}
