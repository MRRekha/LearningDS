package com.learning.datastructures.Slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap();
        int maxCount = 0, start = 0;
        for(int i=0; i< s.length(); i++){//O(n)
            char c = s.charAt(i);
            maxCount = Math.max(i-start+1 , maxCount);
            if(charMap.containsKey(c)){//O(1)
                if(charMap.get(c) >= start) {
                    start = charMap.get(c) + 1;
                }
            }
            charMap.put(c, i);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
