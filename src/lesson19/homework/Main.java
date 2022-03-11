package lesson19.homework;

import util.ConsoleInput;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.Period;

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
            option = input.askInt("Enter the option: ");
            switch (option) {
                case 1 -> {
                    int interMenuOption;
                    boolean run = true;
                    do {
                        System.out.println();
                        System.out.println("1. Print Local Date");
                        System.out.println("2. Print Local Time");
                        System.out.println("3. Print Local Date Time");
                        System.out.println("4. Back");
                        interMenuOption = input.askInt("Select the option: ");
                        switch (interMenuOption) {
                            case 1 -> DateAndTime.printLocalDate();
                            case 2 -> DateAndTime.printLocalTime();
                            case 3 -> DateAndTime.printLocalDateTime();
                            case 4 -> run = false;
                            default -> System.out.println("This option does not exist");
                        }
                    } while (run);
                }
                case 2 -> {
                    int year = input.askInt("Enter a year: ");
                    boolean rsl = LeapYear.isLeap(year);
                    System.out.println(rsl ? "is leap" : "is not leap");
                }
                case 3 -> {
                    System.out.println("Enter the date");
                    int year = input.askInt("Enter the year: ", 2000, 2022, "year:");
                    int month = input.askInt("Enter the month: ", 1, 12, "month:");
                    int day = input.askInt("Enter the day: ");
                    LocalDate precedentDate;
                    do {
                       try {
                           precedentDate = LocalDate.of(year, month, day);
                           break;
                       } catch (DateTimeException e) {
                           System.out.println("Enter a correct day for month");
                           day = input.askInt("Enter the day: ");
                       }
                    } while(true);
                    LocalDate currentDate = LocalDate.now();
                    int days = NumberOfDays.countDays(precedentDate, currentDate);
                    Period per = NumberOfDays.countDays2(precedentDate, currentDate);
                    System.out.println("Between " + precedentDate + " and " + currentDate + " are " + days + " days.");
                    System.out.println(per);
                }
                case 4 -> {
                    input.close();
                    isExit = false;
                    System.out.println("Have a nice day!");
                }
                default -> System.out.println("This option does not exist");
            }
        } while (isExit);
    }
}
