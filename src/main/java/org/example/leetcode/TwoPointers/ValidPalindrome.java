package org.example.leetcode.TwoPointers;

import org.apache.commons.lang3.StringUtils;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

Memo:
the if statement below skips the none alphanumeric characters and compare two char
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            //skips the none alphanumeric characters
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    //Not Using Pointer
    public boolean isPalindromeMyAns(String s) {
        if (s.isEmpty()) return true;
        String str = null;
        if (!StringUtils.isAlphanumeric(s)) {
            str = s.replaceAll("[^A-Za-z0-9]", "");
        }
        if(str == null){
            return false;
        }
        str = str.toLowerCase();
        StringBuilder reversedStr = new StringBuilder(str);
        StringBuilder reverse = reversedStr.reverse();
        return str.contentEquals(reverse);
    }
}
