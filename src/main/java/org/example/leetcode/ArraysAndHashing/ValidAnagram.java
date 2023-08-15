package org.example.leetcode.ArraysAndHashing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
242. Valid Anagram
Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    private Logger logger = LogManager.getLogger(getClass());
    /*
    time complexity of O(n log n)
     */
    public boolean isAnagramUsingSort(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    /*
    Approach : Hash Table
    The time complexity of this solution is O(n),

    getOrDefault(Object key, V defaultValue)
    指定されたキーがマップされている値を返します。このマップにそのキーのマッピングが含まれていない場合はdefaultValueを返します。

    put(K key, V value)
    指定された値と指定されたキーをこのマップに関連付けます。
     */
    public boolean isAnagramUsingHashTable(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> hashMap = new HashMap<>();
        // Count the frequency of characters in string s　//Javaは、プリミティブcharのcharストリームを提供しないので無理
        for (char x : s.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) - 1);
        }
        // Check if any character has non-zero frequency
        logger.info("hashMap="+ hashMap);
        for (int val : hashMap.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
