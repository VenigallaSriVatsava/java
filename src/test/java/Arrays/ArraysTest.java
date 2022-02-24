package Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ArraysTest {
    Arrays obj = new Arrays();

    @Test
    void assignAndPopulateArray1D() {
        int[] result = obj.assignAndPopulateArray1D(3, 1, 4, 6);

        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
        assertEquals(6, result[2]);

        result = obj.assignAndPopulateArray1D(4, 6, 7, 8, 10);
        assertEquals(6, result[0]);
        assertEquals(7, result[1]);
        assertEquals(8, result[2]);
        assertEquals(10, result[3]);

        result = obj.assignAndPopulateArray1D(2, 6, 7, 8, 10);
        assertNull(result);

    }

    @Test
    void assignAndPopulateArray2D() {
        int[][] result = obj.assignAndPopulateArray2D(2, 2, 3, 4, 5, 6);

        assertEquals(3, result[0][0]);
        assertEquals(4, result[0][1]);
        assertEquals(5, result[1][0]);
        assertEquals(6, result[1][1]);


        result = obj.assignAndPopulateArray2D(2, 2, 3, 4, 5);
        assertNull(result);


    }
}