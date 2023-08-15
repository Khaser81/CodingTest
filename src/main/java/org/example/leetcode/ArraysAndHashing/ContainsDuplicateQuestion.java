package org.example.leetcode.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/*
217. Contains Duplicate
Easy
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicateQuestion {

    /*
    Time complexity: O(n)
    Space complexity: O(n)
     */
    public boolean containsDuplicateUsingHashMap(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    /*
    Time complexity: O(n)
    Space complexity: O(n)
     */
    public boolean containsDuplicateUsingHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    /*
    Time complexity: O(nlog(n))
    Space complexity: O(log(n))
     */
    public boolean containsDuplicateUsingSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
