// 2425. Bitwise XOR of All Pairings

public class Q13 {
    
}
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int result = 0;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i<nums1.length; i++){
            xor1 = xor1 ^ nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            xor2 = xor2 ^ nums2[i];
        }
        if(nums2.length % 2 == 1){
            result ^= xor1;
        }
        if(nums1.length % 2 == 1){
            result ^= xor2;
        }
        return result;
    }
}