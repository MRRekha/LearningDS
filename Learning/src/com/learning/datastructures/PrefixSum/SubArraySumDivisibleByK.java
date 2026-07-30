package com.learning.datastructures.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivisibleByK {

    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{-1,2,9} , 2));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(0, 1);
        int sum =0, mod = 0, count = 0;
        for(int num: nums){
            sum += num;
            mod = sum % k;
            if(numMap.containsKey(mod)){
                count = count+ numMap.get(mod);
            }
            numMap.put(mod, numMap.getOrDefault(mod, 0)+1);
        }
        return count;
    }
}
