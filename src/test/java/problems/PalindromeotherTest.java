package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeotherTest {

    Palindromeother obj = new Palindromeother();

    @Test
    void checkPalindrome() {
        Boolean actual = obj.checkPalindrome("madam");
        assertEquals(true, actual);
    }

    @Test
    void checkPalindromeFalse() {
        Boolean actual = obj.checkPalindrome("sword");
        assertEquals(false, actual);
    }
}