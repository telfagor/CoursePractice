package lesson18.homework;

import java.util.HashMap;
import java.util.Map;
import util.*;

public class Dictionary {
    private final static ConsoleInput input = new ConsoleInput();

    public static Map<String, String> initMap(int capacity) {
        Map<String, String> dictionary = new HashMap<>(capacity);

        for (int i = 0; i < capacity; i++) {
            dictionary.put(input.askStringNext(), input.askStringNext());
        }
        return dictionary;
    }
}
