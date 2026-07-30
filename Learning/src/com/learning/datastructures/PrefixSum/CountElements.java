package com.learning.datastructures.PrefixSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountElements {
    public static void main(String[] args) {
        countElements(new int[]{1,2,3});
    }

    public static int countElements(int[] n){
        int count = 0;
        Set<Integer> elements = new HashSet<>();
        for(int i=0; i< n.length; i++){
            elements.add(n[i]);
        }
        for(int i=0; i< n.length; i++){
            if(elements.contains(n[i]+1)){
                count++;
            }
        }
        return count;
    }
}
