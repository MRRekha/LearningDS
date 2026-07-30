package com.learning.datastructures.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 19);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                return new int[]{numMap.get(diff), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

