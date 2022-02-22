package lesson12.homework.prime;

public class PrimeNumbers {

    public static boolean isPrime(int number) {
        boolean flag = number >= 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int getCountPrimeNumbers(int start, int end) {
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        return counter;
    }
}
