package com.learning.datastructures.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {//O(n2) // O(1)
        List<List<Integer>> outPut = new ArrayList<>();
        Arrays.sort(nums);//O(n logn)
        for (int fix = 0; fix < nums.length - 2; fix++) {//O(n)
            if(fix >0 && nums[fix-1] == nums[fix]) continue;
            int start = fix+1, end= nums.length -1;
            while(start < end){ // O(n)
                int sum = nums[fix] + nums[start] + nums[end];
                if(sum == 0){
                    List<Integer> op =new ArrayList<>();
                    op.add(nums[start]);
                    op.add(nums[end]);
                    op.add(nums[fix]);
                    outPut.add(op);
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) start++;
                    while (start < end && nums[end] == nums[end + 1]) end--;
                }
                else if(sum < 0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return outPut;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});//-4,-1,-1,0,1,2
    }
}
