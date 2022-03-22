package lesson18.homework;

import java.util.*;

import util.ConsoleInput;

public class UniqueValues {
    private static final ConsoleInput input = new ConsoleInput();

    public static List<String> initializeList(int capacity) {
        List<String> strings = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            strings.add(input.askString());
        }
        return strings;
    }

    public static Set<String> getUniqueStrings(List<String> list) {
        return new HashSet<>(list);
    }
}