package Arrays;

public class Arrays {

    public int[] assignAndPopulateArray1D(int size, int... values) {

        int[] a = {1, 1, 3};       // assigns the values into the array directly

        int e[] = new int[size];
        if (size < values.length) {
            System.out.println("size is lessthan values length");
            return null;
        } else {
//            for (int j = 0; j < values.length; j++) {
//                e[j] = values[j];
//            }
            int j = 0;
            for (int value : values) {
                e[j] = value;
                j++;
            }

            return e;
        }
    }

    public int[][] assignAndPopulateArray2D(int rows, int columns, int... values) {
        int f[][] = new int[rows][columns];
        if (rows * columns < values.length) {
            System.out.println("incorrect matrix size");
            return null;
        } else {
            for (int i = 0, j = 0; i < rows; i++) {
                for (int k = 0; k < columns; k++, j++) {

                    f[i][k] = values[j];
                }
            }
            // 1 2 3  rows = 2, columns = 3, noofelements = 3*2 = 6
            // 4 5 6
            return f;
        }


    }


    // TODO method for 2D array
}




