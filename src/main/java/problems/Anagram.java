package problems;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {

    public boolean checkAnagram(String input1, String input2) {
        if (input1 == null || input2 == null || input1.length() == 0 || input2.length() == 0) {
            throw new RuntimeException("invalid input");
        }
        TreeMap<Character, Integer> mapCount1 = new TreeMap<>();
        TreeMap<Character, Integer> mapCount2 = new TreeMap<>();
        boolean output = true;
        for (int i = 0; i < input1.length(); i++) {
            if (mapCount1.containsKey(input1.charAt(i))) {
                int value = mapCount1.get(input1.charAt(i));
                mapCount1.put(input1.charAt(i), value + 1);
            } else {
                mapCount1.put(input1.charAt(i), 1);
            }
        }
        for (int j = 0; j < input2.length(); j++) {
            if (mapCount2.containsKey(input2.charAt(j))) {
                int value = mapCount2.get(input2.charAt(j));
                mapCount2.put(input2.charAt(j), value + 1);
            } else {
                mapCount2.put(input2.charAt(j), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry1 : mapCount1.entrySet()) {
            if (mapCount2.get(entry1.getKey()) == null || mapCount2.get(entry1.getKey()) != entry1.getValue()) {
                return false;
            }
        }

        return true;


    }

    public boolean checkAnagram_withoutHashMap(String a, String b) {
        if (a == null || b == null || a.length() == 0 || b.length() == 0) {
            throw new RuntimeException("invalid input");
        }
        if (a.length() != b.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {//stop posts
                b = b.substring(0, j) + b.substring(j + 1);
                a = a.substring(i + 1);
                j = 0;
            } else {
                j++;
            }

        }
        if (a.length() != 0 || b.length() != 0) {
            return false;
        }


        return true;
    }
}
