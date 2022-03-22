package package17.homework;

import java.util.StringTokenizer;

public class NumberOfWords {

    public static int getNumberOfWords(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        return tokenizer.countTokens();
    }
}
