package com.learning.datastructures.PrefixSum;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            System.out.println("***"+str+"***");
            int[] count = new int[26];
            for(char c : str.toCharArray()) {
                System.out.println("count[c - 'a'] "+count[c - 'a']+" "+ c);
                count[c - 'a']++;

            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                for (int j = 0; j < count[i]; j++) {
                    sb.append((char) (i + 'a'));
                }
            }
            Arrays.sort(str.toCharArray());
            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
            System.out.println(map+" --");
        }
        return  new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

}

