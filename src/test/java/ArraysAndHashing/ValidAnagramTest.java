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
        String s = "anagram"; //{a=3, r=1, g=1, m=1, n=1}
        String t = "nagaram"; //{a=0, r=0, g=0, m=0, n=0}
        assertTrue(va.isAnagramUsingHashTable(s,t));
        assertTrue(va.isAnagramUsingSort(s,t));
    }

    @Test
    @DisplayName("ValidAnagramTest rat cat")
    void normal_pattern2() {
        String s = "rat"; //hashmap={a=1, r=1, t=1}
        String t = "cat"; //hashmap={a=0, r=1, c=-1, t=0} <- a,tは存在するので0に戻る。
        assertFalse(va.isAnagramUsingHashTable(s,t));
        assertFalse(va.isAnagramUsingSort(s,t));
    }
}
