package com.learning.datastructures.PrefixSum;

import java.util.*;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int output = 0, sum = 0;
        Map<Integer, Integer> numsMap = new HashMap<>();
        numsMap.put(sum, 1);
        for (int i=0; i< nums.length; i++){
            sum += nums[i];

            if(numsMap.containsKey(sum- k)){
                output = output + numsMap.get(sum -k) ;
            }
            numsMap.put(sum, numsMap.getOrDefault(sum , 0)+1);
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{0}, 0));

    }
}
