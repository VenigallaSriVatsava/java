package problems;

public class Containsnum {

    public boolean containsDigits(String str) {
        // Check if character is
        // digit from 0-9
        // then return true
        // else false
        if (str == null || str == "") {
            throw new RuntimeException("input cannot be null or empty");
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println((int) str.charAt(i));
            if (!(str.charAt(i) >= 48) || !(str.charAt(i) <= 57)) {
                return false;
            }
        }

        return true;
    }

}
