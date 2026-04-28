/*
 * @lc app=leetcode id=1854 lang=java
 *
 * [1854] Maximum Population Year
 */

// @lc code=start
class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxyear = 0;
        int max = 0;
        for(int year = 1950; year <= 2050; year++) {
            int count = 0;
            for(int[] log : logs) {
                if(log[0] <= year && log[1] > year) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxyear = year;
            }
        }
        return maxyear;
    }
}
// @lc code=end

