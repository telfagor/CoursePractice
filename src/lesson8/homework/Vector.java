package lesson8.homework;

public class Vector {
    public static int calcVectorSum (int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public static double calcVectorAverage (int[] array) {
        return (double) calcVectorSum(array) / array.length;
    }

    public static int countVectorEvenElements(int[] array) {
        int counter = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countVectorOddElements(int[] array) {
        int counter = 0;
        for (int elem : array) {
            if (elem % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void printVectorSum(int[] array) {
        int sum = calcVectorSum(array);
        System.out.println("Vector sum: " + sum);
    }

    public static void printVectorAverage(int[] array) {
        double average = calcVectorAverage(array);
        System.out.println("Vector average: " + average);
    }

    public static void printCountVectorEvenElements(int[] array) {
        int counter = countVectorEvenElements(array);
        System.out.println("The number of even elements: " + counter);
    }

    public static void printCountVectorOddElements(int[] array) {
        int counter = countVectorOddElements(array);
        System.out.println("The number of odd elements: " + counter);
    }

    public static void printVector(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
