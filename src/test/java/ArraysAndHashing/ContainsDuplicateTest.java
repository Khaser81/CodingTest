package ArraysAndHashing;

import org.example.leetcode.ArraysAndHashing.ContainsDuplicateQuestion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicateQuestion cdq = new ContainsDuplicateQuestion();
    @Test
    @DisplayName("1,2,3,1 duplicate")
    void normal_pattern1() {
        int[] nums = {1,2,3,1};
        assertTrue(cdq.containsDuplicateUsingHashSet(nums));
        assertTrue(cdq.containsDuplicateUsingHashMap(nums));
        assertTrue(cdq.containsDuplicateUsingSort(nums));
    }

    @Test
    @DisplayName("1,2,3,4 no duplicate")
    void normal_pattern2() {
        int[] nums = {1,2,3,4};
        assertFalse(cdq.containsDuplicateUsingHashSet(nums));
        assertFalse(cdq.containsDuplicateUsingHashMap(nums));
        assertFalse(cdq.containsDuplicateUsingSort(nums));
    }

    @Test
    @DisplayName("1 no duplicate")
    void normal_pattern3() {
        int[] nums = {1};
        assertFalse(cdq.containsDuplicateUsingHashSet(nums));
        assertFalse(cdq.containsDuplicateUsingHashMap(nums));
        assertFalse(cdq.containsDuplicateUsingSort(nums));
    }

    @Test
    @DisplayName("1,1,1,3,3,4,3,2,4,2 duplicate")
    void normal_pattern4() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(cdq.containsDuplicateUsingHashSet(nums));
        assertTrue(cdq.containsDuplicateUsingHashMap(nums));
        assertTrue(cdq.containsDuplicateUsingSort(nums));
    }
}