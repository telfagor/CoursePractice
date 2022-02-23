package lesson8.homework;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int min = findMinOfArray(array);
        int max = findMaxOfArray(array);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    public static int findMinOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printMin(int[] array) {
        int min = findMinOfArray(array);
        System.out.println("Min = " + min);
    }

    public static void printMax(int[] array) {
        int max = findMaxOfArray(array);
        System.out.println("Max = " + max);
    }

    public static void printMinAndMax(int[] array) {
        printMin(array);
        printMax(array);
    }
}
