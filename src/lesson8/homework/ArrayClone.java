package lesson8.homework;

import util.Helper;

public class ArrayClone {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copyOfArray = createArrayClone(array);
        Helper.printVector(copyOfArray);
    }

    public static int[] createArrayClone(int[] array) {
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < copyOfArray.length; i++) {
            copyOfArray[i] = array[i];
        }
        //System.arraycopy(array, 0, copyOfArray, 0, array.length);
        return copyOfArray;
    }
}
