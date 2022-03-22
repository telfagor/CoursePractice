package package17.homework;

import util.ConsoleInput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        boolean isExit = true;
        int option;

        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. First task");
            System.out.println("2. Second task");
            System.out.println("3. Third task");
            System.out.println("4. Fourth task");
            System.out.println("5. Exit");
            option = input.askInt("Select the option: ");
            switch (option) {
                case 1 -> {
                    String strA = input.askString("Enter first string: ");
                    String strB = input.askString("Enter second string: ");
                    boolean rsl = StringCompare.compare(strA, strB);
                    System.out.println(rsl ? "equal" : "not equal");
                }
                case 2 -> {
                    String name = input.askString("Enter your full name: ");
                    String[] tokens = Abbreviations.getTokens(name);
                    Abbreviations.printAbbreviations(tokens);
                }
                case 3 -> {
                    String str = input.askString("Enter a string: ");
                    String revStr = ReverseString.reverseString(str);
                    boolean test = ReverseString.testReverse(str, revStr);
                    System.out.println(test ? "The reverse is: " + revStr : "The reverse is not equal");
                }
                case 4 -> {
                    String str = input.askString("Enter a string: ");
                    int count = NumberOfWords.getNumberOfWords(str);
                    System.out.println("The number of words: " + count);
                }
                case 5  -> {
                    input.close();
                    isExit = false;
                    System.out.println("Have a nice day!");
                }
                default -> System.out.println("This option does not exist");
            }
        } while (isExit);

    }
}
