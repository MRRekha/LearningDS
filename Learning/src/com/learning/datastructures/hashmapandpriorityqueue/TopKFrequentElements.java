package com.learning.datastructures.hashmap;

import java.util.*;

public class TopKFrequentElements {

    //problem statement is to fetch the top most K number which are repeated
    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }

    //Logic is to use Hshmap to identify frequencies and using minheap to maintain the top K elements
    //I traverse the array once. Each HashMap lookup and insertion is O(1) on average, so the overall time
    // complexity is O(n). In the worst case, if every element is unique,
    // the HashMap stores n entries, so the auxiliary space complexity is O(n).
    public static int[] topKFrequent(int[] nums, int k) {
        int[] outPut = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue));
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for (int i=0; i< k ;i++){
            outPut[i] = minHeap.poll().getKey();
        }
        return outPut;
    }

}
