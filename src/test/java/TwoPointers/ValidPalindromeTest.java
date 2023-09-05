package TwoPointers;

import org.example.leetcode.TwoPointers.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();
    @Test
    @DisplayName("true pattern")
    void normal_pattern1() {
        Assertions.assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    @DisplayName("empty")
    void abnormal_pattern1() {
        Assertions.assertTrue(validPalindrome.isPalindrome(""));
    }

    @Test
    @DisplayName("true pattern")
    void normal_pattern2() {
        Assertions.assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    @DisplayName("true pattern")
    void my_normal_pattern1() {
        Assertions.assertTrue(validPalindrome.isPalindromeMyAns("A man, a plan, a canal: Panama"));
    }

    @Test
    @DisplayName("empty")
    void my_abnormal_pattern1() {
        Assertions.assertTrue(validPalindrome.isPalindromeMyAns(""));
    }

    @Test
    @DisplayName("true pattern")
    void my_normal_pattern2() {
        Assertions.assertFalse(validPalindrome.isPalindromeMyAns("race a car"));
    }
}
