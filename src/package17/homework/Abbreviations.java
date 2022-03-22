package package17.homework;

import java.util.StringTokenizer;

public class Abbreviations {

    public static String[] getTokens(String name) {
        StringTokenizer tokenizer = new StringTokenizer(name);
        String[] tokens = new String[tokenizer.countTokens()];

        int index = 0;
        while(tokenizer.hasMoreTokens()) {
            tokens[index++] = tokenizer.nextToken();
        }
        return tokens;
    }

    public static void printAbbreviations(String[] abbr) {
        for (int i = 0; i < abbr.length - 1; i++) {
            char firstLetter = Character.toUpperCase(abbr[i].charAt(0));
            System.out.print(firstLetter + ".");
        }
        String lastWord = abbr[abbr.length - 1];
        char firstLetterOfLastWord = Character.toUpperCase(lastWord.charAt(0));
        System.out.println(firstLetterOfLastWord + lastWord.substring(1));
    }
}
