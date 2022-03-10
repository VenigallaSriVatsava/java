package problems;

public class Palindromeother {

    public boolean checkPalindrome(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) { // madam
            output = output + input.charAt(i);
        }
        if (input.equals(output) == true) {
            return true;
        }
        return false;
    }
}
