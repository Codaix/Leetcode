//3201. Find the Maximum Length of Valid Subsequence I

class Solution {
    public int maximumLength(int[] nums) {
        int odd = 0, even = 0, alternate =0;
        for(int num : nums){
            if(num%2 == 0)even++;
            else odd++;
        }
        if(nums.length > 0){
            alternate = 1;
            int prev = nums[0]%2;
        for(int i=1;i<nums.length;i++){
                int curr = nums[i]%2;
                if(curr != prev){
                    alternate++;
                    prev= curr;
                }
            }
        }
        return Math.max(even, Math.max(odd, alternate));
    }
}


public class Q11 {
    
}
