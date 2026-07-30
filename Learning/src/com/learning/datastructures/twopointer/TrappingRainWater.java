package com.learning.datastructures.twopointer;

public class TrappingRainWater {
    public static int trap(int[] height) {//O(n) O(1)
        int start =0 , end =height.length -1, trap = 0, leftMax = 0, rightMax =0;
        while(start < end){//O(n)
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);
           if(leftMax < rightMax){
               trap += leftMax -height[start];
               start++;
           }else{
               trap += rightMax -height[end];
               end--;
           }
        }
        return trap;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
