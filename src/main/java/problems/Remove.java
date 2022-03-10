package problems;

public class Remove {

    public String removeRepeatedChar(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); ) { // dagger , convolution,remember
            count = 0;
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count = count + 1;
                    input = input.substring(0, j) + input.substring(j + 1);

                }
            }
            int c = i;
            i++;
            if (count >= 1) {
                input = input.substring(0, c) + input.substring(c + 1);
                i = 0;
            }

        }
        return input;
    }
}
