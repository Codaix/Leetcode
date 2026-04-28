/*
 * @lc app=leetcode id=2033 lang=java
 *
 * [2033] Minimum Operations to Make a Uni-Value Grid
 */

// @lc code=start
class Solution {
    public int minOperations(int[][] grid, int x) {
        int size = 0;
      for(int[] i : grid){
        size += i.length;
      }

        int[] arr = new int[size];
        int first = 0;
       for(int row : grid){
        for(int el : row){
            arr[first++] = row;
        }
       }
       int mid = 0;
       if(arr.length/2 != 0){
       mid = arr.length/2;
       }
       else{
        mid =Math.(Math.floor(arr.length/2)+Math.ceil(arr.length/2))/2;
       }
       int count = 0;
       for(int i : arr){
        if(Maths.abs(i-arr[mid]%x) != 0){
            return -1;
        }
        count += Math.abs(i-arr[mid])/x;

       }
       return count;        
    }
}
// @lc code=end

