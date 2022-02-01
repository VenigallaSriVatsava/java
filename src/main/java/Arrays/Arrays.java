package Arrays;

public class Arrays {
    // declaring a one dimensional array
    // array index always starts with '0'

    int a[] = {1,1,3};       // assigns the values into the array directly

    int b[] = new int[5];    // 5 indicates the size of the array and this array will have all zeros

    int c[];                 // declares a variable
    c = new int[4];          // assigned array to it
    c[0] = 1;                // assigning values to the array
    c[1] = 3;
    c[2] = 5;
    c[3] = 6;

        for(int i=0; i<3; i++) {
        System.out.println(a[i]);
    }

        System.out.println(c[0]);
        System.out.println(b[2]);

    // Two dimensional arrays

    int d[][] = new int[3][3];
    int e[][] = {{1,2,3},{4,6,9},{5,7,8}};  // assigning 2D array with values

        for(int j=0; j<3; j++) {
        for(int k=0; k<3; k++) {
            System.out.print(e[j][k] + " ");     // declaring 2D array
        }
        System.out.println();
    }



}
}
