package com.learning.datastructures.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {//O(n3) O(1)
        Arrays.sort(nums);
        List<List<Integer>> outPut = new ArrayList<>();
        for(int i=0; i< nums.length -3; i++){//O(n)
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int fix = i+1; fix< nums.length -2; fix++){//O(n)
                if (fix > i + 1 && nums[fix] == nums[fix - 1]) continue;
                int start = fix+1, end = nums.length-1;
                while (start < end){//O(n)
                    long sum = nums[i] + nums[fix] + nums[start] + nums[end];
                    if(sum == target){
                        outPut.add(Arrays.asList(nums[i], nums[fix], nums[start], nums[end]));
                        start++;
                        end--;
                        while(start < end && nums[start] == nums[start-1]) start++;
                        while(start < end && nums[end] == nums[end+1]) end--;
                    }else if(sum < target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return outPut;
    }

    public static void main(String[] args) {
        fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);// -2,-1,0,0,1,2
    }
}
