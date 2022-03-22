package lesson15.homework;

import util.*;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        boolean isExit = true;
        int option;

        while (isExit) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. The first task");
            System.out.println("2. The second task");
            System.out.println("3. Exit");
            option = input.askInt("Select the option: ");
            switch (option) {
                case 1 -> {
                    boolean run = true;
                    int internMenuOption;
                    while (run) {
                        System.out.println();
                        System.out.println("Menu:");
                        System.out.println("1. Telephones");
                        System.out.println("2. TVS");
                        System.out.println("3. Printers");
                        System.out.println("4. Back");
                        internMenuOption = input.askInt("Select the option: ");
                        switch(internMenuOption) {
                            case 1 -> {
                                Invoice telephones = new Invoice("telephone", "smartphone", 2340.5, 6);
                                telephones.printInfo();
                                System.out.println("Total amount: " + telephones.getAmount() + "$");
                            }
                            case 2 -> {
                                Invoice tvs = new Invoice("TV", "Samsung", 3670.34, 4);
                                tvs.printInfo();
                                System.out.println("Total amount: " + tvs.getAmount() + "$");
                            }
                            case 3 -> {
                                Invoice printers = new Invoice("printer", "LG", 4500, 5);
                                printers.printInfo();
                                System.out.println("Total amount: " + printers.getAmount() + "$");
                            }
                            case 4 -> run = false;
                            default -> System.out.println("This option does not exist");
                        }
                    }
                }
                case 2 -> {
                    Date date = new Date(31, 6, 2000);
                    date.setDay(4);
                    date.setMonth(5);
                    date.displayDate();
                }
                case 3 -> {
                    System.out.println("Have a nice day!");
                    isExit = false;
                }
                default -> System.out.println("This option does not exist");
            }
        }
        input.close();
    }
}
