package com.learning.datastructures.Slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {//O(n) O(n+m)
        String minString ="", windowString = "";
        int minLen = Integer.MAX_VALUE;
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> stringMap = new HashMap<>();
        for (int i=0; i<t.length(); i++){
            charMap.put(t.charAt(i), charMap.getOrDefault(t.charAt(i), 0)+1);
        }
        int required = charMap.keySet().size(), formed = 0, start =0;
        for(int i=0; i< s.length(); i++){//O(n)
            char c = s.charAt(i);
            stringMap.put(c, stringMap.getOrDefault(c, 0)+1);
            if(stringMap.get(c) == charMap.get(c)){
                formed++;
            }
            while (formed == required && start <= i){//O(
                windowString = s.substring(start, i+1);
                if(windowString.length() < minLen){
                    minString = windowString;
                    minLen = minString.length();
                }
                char remove = s.charAt(start);
                if(charMap.containsKey(remove)){
                    stringMap.put(remove, stringMap.get(remove)-1);
                    if(stringMap.get(remove) < charMap.get(remove)){
                        formed--;
                    }
                }
                start++;
            }
        }
        return minString;
    }

    public static void main(String[] args) {
        minWindow("ADOBECODEBANC", "ABC");
    }
}
