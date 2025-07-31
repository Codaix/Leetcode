// 898. Bitwise ORs of Subarrays

import java.util.*;
public class Q12 {
    
}
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> prev = new HashSet<>();
        int n = arr.length;
        for(int num : arr){
           Set<Integer> curr = new HashSet<>();
           curr.add(num);
           for(int p : prev){
            curr.add(p | num);
           }
           set.addAll(curr);
           prev = curr;
        }
        return set.size();
    }
}

