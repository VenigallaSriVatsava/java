package problems;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    static Anagram obj = new Anagram();

    public static void main(String[] args) {
        obj.checkAnagram("stop", "spot");
    }

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
//        for (int k = 0; k < input1.length() && k < input2.length(); k++) {
//            int value1 = mapCount1.get(input1.charAt(k));
//            int value2 = mapCount2.get(input2.charAt(k));
//
//            if (value1 != value2) {
//                output = false;
//            }
//        }
        for (Map.Entry<Character, Integer> entry1 : mapCount1.entrySet()) {
            if (mapCount2.get(entry1.getKey()) == null || mapCount2.get(entry1.getKey()) != entry1.getValue()) {
                return false;
            }
        }

        return true;


    }

    public boolean checkAnagram_withoutHashMap(String a, String b) {


        return true;
    }
}
