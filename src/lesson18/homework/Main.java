package lesson18.homework;

import util.ConsoleInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        boolean isExit = true;
        int option;

        do {
            System.out.println();
            System.out.println("1. First task");
            System.out.println("2. Second task");
            System.out.println("3. Third task");
            System.out.println("4. Exit");
            option = input.askInt("Select the option: ");
            switch (option) {
                case 1 -> {
                    Employee andrei = new Employee("Andrei", 0);
                    Employee maria = new Employee("Maria", 6);
                    Employee lidia = new Employee("Lidia", 10);
                    Employee igor = new Employee("Igor", 20);
                    Employee vasile = new Employee("Vasile", 7);
                    Employee[] employees = {andrei, maria, lidia, igor, vasile};
                    ArrayList<Employee> list = Employee.filterEmployees(employees);
                    Employee.printEmployees(list);
                }
                case 2 -> {
                    List<String> strings = UniqueValues.initializeList(5);
                    Set<String> uniqueValues = UniqueValues.getUniqueStrings(strings);
                    System.out.println(uniqueValues);
                }
                case 3 -> {
                    Map<String, String> dictionary = Dictionary.initMap(5);
                    System.out.println(dictionary);
                }
                case 4 -> isExit = false;
                default -> System.out.println("This option does not exist");
            }
        } while(isExit);
        input.close();
    }
}
