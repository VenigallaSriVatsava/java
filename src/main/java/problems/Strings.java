package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strings {
    static Strings obj = new Strings();

    public static void main(String[] args) {
        obj.printDuplicates("jaava");
    }

    public List<String> printDuplicates(String input) {
        HashMap<Character, Integer> mapCount = new HashMap<>();
        List<String> output = new ArrayList<>();
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                if (mapCount.containsKey(input.charAt(i))) {
                    int value = mapCount.get(input.charAt(i));
                    mapCount.put(input.charAt(i), value + 1);
                } else {
                    mapCount.put(input.charAt(i), 1);
                }


            }
            for (Map.Entry<Character, Integer> entry : mapCount.entrySet()) {
                if (entry.getValue() > 1) {
                    output.add(entry.getKey() + " repeats " + entry.getValue() + " times");
                }
            }
        }

        return output;
    }
}
