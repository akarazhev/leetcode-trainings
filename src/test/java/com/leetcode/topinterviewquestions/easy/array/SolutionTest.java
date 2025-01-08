package com.leetcode.topinterviewquestions.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testRemoveDuplicatesFromSortedArray() {
        Solution solution = new Solution();
        assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
