package problems;

public class Reverse {

    public String string_reverse(String input) {

        if (input == null) {
            throw new RuntimeException("input cannot be null");
        }

        char a[] = input.toCharArray();
        for (int i = input.length() - 1, j = 0; i != j && j < i; i--, j++) {
            char b;
            b = a[i];
            a[i] = a[j];
            a[j] = b;  //
        }
        return String.valueOf(a);

    }

    public String stringReverseRecursive(String input) {
        if (input == null) {
            throw new RuntimeException("input cannot be null");
        }
        if (input.length() <= 1) {
            return input;
        }
        return input.substring(input.length() - 1) + stringReverseRecursive(input.substring(1, input.length() - 1)) + input.substring(0, 1);

    }

}
