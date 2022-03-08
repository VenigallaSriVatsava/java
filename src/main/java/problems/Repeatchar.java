package problems;

public class Repeatchar {

    public char repeatingChar(String input) {
        int count = 1;
        char[] a = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {       //pragrar
                    count = count + 1;
                    input = input.substring(0, j) + input.substring(j + 1);
                    j = j - 1;

                }
            }
            if (count >= 2) {
                int k = 0;
                a[k] = input.charAt(i);
                k = k + 1;
                count = 0;

            }

        }
        for (int i = 0; i < a.length; i++) {


            return a[i];
        }
        return 0;
    }
}
