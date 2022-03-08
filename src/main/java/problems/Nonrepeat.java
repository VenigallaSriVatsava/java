package problems;

import java.util.HashMap;

public class Nonrepeat {

    public char nonRepeatingCharacter(String input) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        if (input == null || input.length() == 0) {
            throw new RuntimeException("input cannot be null or empty");
        }
        for (int i = 0; i < input.length(); i++) {
            if (map1.containsKey(input.charAt(i))) {
                int value = map1.get(input.charAt(i));
                map1.put(input.charAt(i), value + 1);
            } else {
                map1.put(input.charAt(i), 1);
            }
        }

        for (char c : input.toCharArray()) {
            int repeat = map1.get(c);
            if (repeat == 1) {
                return c;
            }
        }
        return ' ';
    }

    public char nonRepeatingCharacter_2(String input) {


        if (input == null || input.length() == 0) {
            throw new RuntimeException("input cannot be null or empty");
        }
        for (int i = 0; i < input.length() - 1; i++) {
            boolean isRepeating = false;
            for (int j = i + 1; j <= input.length() - 1; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    isRepeating = true;
                    input = input.substring(0, j) + input.substring(j + 1, input.length());
                    break;
                }
            }
            if (isRepeating == false) {
                return input.charAt(i);
            }
        }

        return ' ';
    }
}