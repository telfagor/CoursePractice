package lesson8.homework;

public class SumAverageEvenOdd {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4};
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8},
                {9, 10},
                {11,12,13,14,15,16,17,18,19},
                {20}
        };
        showInfo(vector, matrix);
    }

    public static int calcVectorSum (int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double calcVectorAverage (int[] array, int sum) {
        return (double) sum / array.length;
    }

    public static int countVectorEvenElements(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countVectorOddElements(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int calcMatrixSum (int[][] matrix) {
        int sum = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                sum += j;
            }
        }
        return sum;
    }

    public static double calcMatrixAverage(int[][] matrix, int sum) {
        return (double) sum / numberMatrixElements(matrix);
    }

    public static int numberMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            sum += array.length;
        }
        return sum;
    }

    public static int countMatrixEvenElements(int[][] matrix) {
        int counter = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                if (j % 2 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countMatrixOddElements(int[][] matrix) {
        int counter = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                if (j % 2 != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void showInfo(int[] vector, int[][] matrix) {
        int vectorSum = calcVectorSum(vector);
        double vectorAverage = calcVectorAverage(vector, vectorSum);
        int countVectorEvenElements = countVectorEvenElements(vector);
        int countVectorOddElements = countVectorOddElements(vector);
        int matrixSum = calcMatrixSum(matrix);
        double matrixAverage = calcMatrixAverage(matrix, matrixSum);
        int countMatrixEvenElements = countMatrixEvenElements(matrix);
        int countMatrixOddElements = countMatrixOddElements(matrix);
        System.out.println("The sum of the vector: " + vectorSum);
        System.out.println("The average of the vector: " + vectorAverage);
        System.out.println("The even number of elements of the vector: " + countVectorEvenElements);
        System.out.println("The odd number of elements of the vector: " + countVectorOddElements);
        System.out.println("The sum of the matrix: " + matrixSum);
        System.out.println("The average of the matrix: " + matrixAverage);
        System.out.println("The even number of elements of the matrix: " + countMatrixEvenElements);
        System.out.println("The odd number of elements of the matrix: " + countMatrixOddElements);
    }
}
