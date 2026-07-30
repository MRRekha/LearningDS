package com.learning.datastructures.todo;

//Do it after bst
public class MaximumSumRectanglein2D {
    public static int maximumSumRectangle(int[][] matrix){
        int maxSum = 0, currentSum =0, left =0, right = 0;
        int[] reducedArray = new int[matrix.length];

        while(right < matrix.length){
            System.out.println(matrix[right][left]);
            int item = matrix[right][left];
            currentSum = currentSum + item;
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum , currentSum);
            System.out.println(maxSum);
            right++;
        }
        return 0;
    }

    public static void main(String[] args) {
       int[][] ip =  new int[][]{
               {1,  2, -1, -4},
               {-8, -3,  4,  2},
               {3,  8, 10,  1},
               {-4, -1,  1,  7}};
        maximumSumRectangle(ip);
    }
}
