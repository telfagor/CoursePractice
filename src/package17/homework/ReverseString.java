package package17.homework;

public class ReverseString {

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        int n = array.length / 2;
        for (int i = 0; i < n; i++) {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return new String(array);
    }

    public static boolean testReverse(String str, String revStr) {
      StringBuilder newStr = new StringBuilder(str);
      return revStr.equals(newStr.reverse().toString());
    }
}
