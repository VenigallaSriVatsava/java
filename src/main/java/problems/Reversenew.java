package problems;

public class Reversenew {

    public String reverseNonRecursive(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) { // cricket
            output = output + input.charAt(i);
        }
        return output;
    }
}
