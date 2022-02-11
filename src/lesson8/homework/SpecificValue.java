package lesson8.homework;

public class SpecificValue {
    public static void main(String[] args) {
        int[] array = {-5, 0, 34, 2, -11, 567, 4, 79, 31, 37};
        int specificValue = 34;
        if (foundSpecificValue(array, specificValue)) {
            System.out.println("The array contains the value");
        } else {
            System.out.println("The array does not contain the value");
        }
    }

    public static boolean foundSpecificValue(int[] array, int specificValue) {
        for (int items : array) {
            if (items == specificValue)
                return true;
        }
        return false;
    }
}
