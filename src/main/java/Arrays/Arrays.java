package Arrays;

public class Arrays {

    public int[] assignAndPopulateArray1D(int size, int... values) {

        int[] a = {1, 1, 3};       // assigns the values into the array directly

        int e[] = new int[size];
        if (size < values.length) {
            System.out.println("size is lessthan values length");
            return null;
        } else {
            for (int j = 0; j < values.length; j++) {
                e[j] = values[j];
            }
            return e;
        }
    }


    // TODO method for 2D array
}




