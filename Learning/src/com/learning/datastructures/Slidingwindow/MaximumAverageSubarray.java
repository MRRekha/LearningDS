package com.learning.datastructures.Slidingwindow;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0, maxSum = 0;
        for(int i=0; i< k; i++){
            sum += nums[i];
        }
        maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum/k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
