package ArraysAndHashing;

import org.example.leetcode.ArraysAndHashing.ValidAnagram;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    ValidAnagram va = new ValidAnagram();
    @Test
    @DisplayName("ValidAnagramTest anagram, nagaram")
    void normal_pattern1() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(va.isAnagramUsingHashTable(s,t));
        assertTrue(va.isAnagramUsingSort(s,t));
    }

    @Test
    @DisplayName("ValidAnagramTest rat cat")
    void normal_pattern2() {
        String s = "rat";
        String t = "cat";
        assertFalse(va.isAnagramUsingHashTable(s,t));
        assertFalse(va.isAnagramUsingSort(s,t));
    }
}
