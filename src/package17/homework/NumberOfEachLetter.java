package package17.homework;

import java.util.Map;
import java.util.HashMap;

public class NumberOfEachLetter {
    public static Map<Character, Integer> getNumberOfEachLetter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if (map.containsKey(character)) {
                Integer oldValue = map.get(character);
                map.put(character, oldValue + 1);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }
}
