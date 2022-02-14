package lesson8.homework;

public class SpecificValue {
    public static void main(String[] args) {
        int[] array = {-5, 0, 34, 2, -11, 567, 4, 79, 31, 37};
        int specificValue = 34;
        printInfo(array, specificValue);
    }

    public static boolean findSpecificValue(int[] array, int specificValue) {
        for (int items : array) {
            if (items == specificValue)
                return true;
        }
        return false;
    }

    public static void printInfo(int[] array, int specificValue) {
        if (findSpecificValue(array, specificValue)) {
            System.out.println("The array contains the value");
        } else {
            System.out.println("The array does not contain the value");
        }
    }
}
