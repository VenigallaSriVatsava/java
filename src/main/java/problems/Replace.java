package problems;

public class Replace {

    public String replaceChar(String input1, char input2, char replace) {

        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == input2) {
                input1 = input1.substring(0, i) + replace + input1.substring(i + 1);
            }
        }
        return input1;
    }
}
