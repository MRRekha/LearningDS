package com.learning.datastructures.PrefixSum;

public class RunningSum {
    public static void main(String[] args) {
        runningSum(new int[]{1,2,3,4});
    }

    public static int[] runningSum(int[] nums) {
        for(int i=1; i< nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
