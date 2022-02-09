package lesson7.homework;

public class DivisibleByFiveAndSix {
    public static void main(String[] args) {
        printNumbers(100, 1000);
    }

    public static void printNumbers(int start, int end) {
        for (int i = start, counter = 0; i <= end; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter > 0 && counter % 10 == 0) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
