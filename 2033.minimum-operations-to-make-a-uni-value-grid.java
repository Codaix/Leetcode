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
       for(int[] row : grid){
        for(int el : row){
            arr[first++] = el;
        }
       }
       Arrays.sort(arr);
       int mid = arr[arr.length/2];
       int count = 0;
       for(int i : arr){
        if((i%x)!=(arr[0]%x)){
            return -1;
        }
        count += Math.abs(i-mid)/x;

       }
       return count;        
    }
}
// @lc code=end

