package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeTest {
    Palindrome obj = new Palindrome();

    @Test
    void palindromeRecursionTrue() {
        boolean actual = obj.PalindromeRecursion("mistsim");
        assertEquals(true, actual);

        boolean actual1 = obj.PalindromeRecursion("mistyim");
        assertEquals(false, actual1);

        boolean actual2 = obj.PalindromeRecursion("mistyik");
        assertEquals(false, actual2);

    }


}