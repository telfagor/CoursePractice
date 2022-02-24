package lesson8.homework;

import util.Helper;

public class Matrix {
    public static int calcMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            sum += Vector.calcVectorSum(array);
        }
        return sum;
    }

    public static double calcMatrixAverage(int[][] matrix) {
        return (double) calcMatrixSum(matrix) / numberOfMatrixElements(matrix);
    }

    public static int numberOfMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            sum += array.length;
        }
        return sum;
    }

    public static int countMatrixEvenElements(int[][] matrix) {
        int counter = 0;
        for (int[] array : matrix) {
            counter += Vector.countVectorEvenElements(array);
        }
        return counter;
    }

    public static int countMatrixOddElements(int[][] matrix) {
        int counter = 0;
        for (int[] array : matrix) {
            counter += Vector.countVectorOddElements(array);
        }
        return counter;
    }

    public static void printMatrixSum(int[][] matrix) {
        int sum = calcMatrixSum(matrix);
        System.out.println("Matrix sum: " + sum);
    }

    public static void printMatrixAverage(int[][] matrix) {
        double average = calcMatrixAverage(matrix);
        System.out.println("Matrix average: " + average);
    }

    public static void printCountMatrixEvenElements(int[][] matrix) {
        int counter = countMatrixEvenElements(matrix);
        System.out.println("The number of even elements: " + counter);
    }

    public static void printCountMatrixOddElements(int[][] matrix) {
        int counter = countMatrixOddElements(matrix);
        System.out.println("The number of odd elements: " + counter);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            Helper.printVector(array);
        }
    }
}
