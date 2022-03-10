package problems;

public class Removerepeated {

    public String removeDuplicate(String input) {
        for (int i = 0; i < input.length(); i++) { // school
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {

                    input = input.substring(0, j) + input.substring(j + 1);

                }
            }
        }
        return input;
    }
}
