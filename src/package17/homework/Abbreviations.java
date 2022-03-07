package package17.homework;

import java.util.ArrayList;

public class Abbreviations {

    public static ArrayList<String> getSubstrings(String name) {
        String[] array = name.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        return list;
    }

    public static void printAbbreviations(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            char firstLetter = list.get(i).charAt(0);
            System.out.print(firstLetter + ".");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
