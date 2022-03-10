package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveTest {

    Remove obj = new Remove();

    @Test
    void removeRepeatedChar() {
        String actual = obj.removeRepeatedChar("dagger");
        assertEquals("daer", actual);

        String actual1 = obj.removeRepeatedChar("convolution");
        assertEquals("cvluti", actual1);

        String actual2 = obj.removeRepeatedChar("remember");
        assertEquals("b", actual2);

        String actual3 = obj.removeRepeatedChar("unfortunate");
        assertEquals("forae", actual3);


    }
}