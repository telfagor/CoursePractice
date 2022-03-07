package package17.homework;

public class NumberOfWords {

    public static int countWords(String str) {
        int counter = 1;
        int start = 0;
        int end = str.indexOf(' ');
        while (end != -1) {
            start = end + 1;
            end = str.indexOf(' ', start);
            counter++;
        }
        return counter;
    }

    public static int countWords2(String str) {
        return str.split(" ").length;
    }
}
