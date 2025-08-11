import java.util.ArrayList;
import java.util.List;

class Solution {
    static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();

        for(int i =0; (1<< i) <= n; i++){
            if((n & (1 << i)) != 0) {
            powers.add(1 << i);
        }
    }
    int[] ans = new int[queries.length];
            for(int i = 0; i< queries.length; i++){
                long prod =1;
                for(int j = queries[i][0]; j <= queries[i][1]; j++){
                    prod = (prod* powers.get(j)) % MOD;

                }
                ans[i] = (int) prod;
            }
        return ans;
        
    }
}