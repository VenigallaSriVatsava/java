package problems;

public class Occurence {

    public int occurenceOfChar(String input1, char input2) {
        int count = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == input2) {
                count = count + 1;
            }
        }
        return count;
    }

}
