package ArraysAndHashing;

import org.example.leetcode.ArraysAndHashing.ContainsDuplicateQuestion;
import org.example.leetcode.ArraysAndHashing.TwoSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();
    @Test
    void normal_pattern1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        assertArrayEquals(new int[]{0,1}, twoSum.getPairsOfTwoSums(nums, target));
    }

    @Test
    void normal_pattern2() {
        int[] nums = {3,2,4};
        int target = 6;
        assertArrayEquals(new int[]{1,2}, twoSum.getPairsOfTwoSums(nums, target));
    }

    @Test
    void normal_pattern3() {
        int[] nums = {3,3};
        int target = 6;
        assertArrayEquals(new int[]{0,1}, twoSum.getPairsOfTwoSums(nums, target));
    }

    @Test
    void normal_pattern4() {
        int[] nums = {3,1};
        int target = 6;
        assertArrayEquals(new int[]{}, twoSum.getPairsOfTwoSums(nums, target));
    }
}
