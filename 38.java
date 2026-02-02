public class 38 {
    public int minimumCost(int[] nums) {
        int sum = 0;
        int  minSum = Integer.MAX_VALUE;
        if(nums.length == 3){
            return nums[0]+nums[1]+nums[2];
        }
        int f_num = nums[0];
            for(int i = 1; i<nums.length-1;i++){
                for(int j = i+1;j<nums.length;j++){
                    minSum = Math.min(minSum, nums[i]+nums[j]);
            }
        }
        return f_num + minSum;
    }
}
