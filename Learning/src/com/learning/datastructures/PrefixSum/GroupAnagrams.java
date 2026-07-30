package com.learning.datastructures.PrefixSum;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()) count[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                for (int j = 0; j < count[i]; j++){
                    sb.append((char) (i + 'a'));
                }
            }
            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return  new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }
}

