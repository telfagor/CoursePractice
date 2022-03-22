package lesson8.homework;

import static lesson8.homework.Vector.*;
import static lesson8.homework.Matrix.*;
import static util.Helper.printVector;
import java.util.Arrays;

public class Main {
    private static final String separator = System.lineSeparator();

    public static void main(String[] args) {
        int[] vector = {1,2,3,4};
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8},
                {9, 10},
                {11,12,13,14,15,16,17,18,19},
                {20}
        };
        System.out.println("Vector:");
        printVector(vector);
        printVectorSum(vector);
        printVectorAverage(vector);
        printCountVectorEvenElements(vector);
        printCountVectorOddElements(vector);
        System.out.println(separator + "Matrix:");
        printMatrix(matrix);
        printMatrixSum(matrix);
        printMatrixAverage(matrix);
        printCountMatrixEvenElements(matrix);
        printCountMatrixOddElements(matrix);

        int[] array = {1,3,3,4};
        int[] array2 = {1,2,3,4};
        int[] array3 = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.equals(array, array2));
        System.out.println(Arrays.compare(array, array2));
        System.out.println(Arrays.mismatch(array, array2));
        System.out.println(Arrays.binarySearch(array, 4));
        Arrays.sort(array);
        Arrays.fill(array2, -1);
    }
}
