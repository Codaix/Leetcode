class Solution {
    static final int MOD = 1_000_000_007;
    Integer[][] memo;

    public int numberOfWays(int n, int x) {
        memo= new Integer[n+1][n+1];
        return dfs(n, x, 1);
    }
    int dfs(int rem, int x, int curr) {
        if(rem == 0) return 1;
        if(rem < 0 || curr > memo.length -1)  return 0;
        if (memo[rem][curr] != null) return memo[rem][curr];
        
        int p = (int) Math.pow(curr, x);
        long ways = dfs(rem, x, curr + 1);
        if(p <= rem) ways += dfs(rem - p, x, curr + 1);
         return memo[rem][curr] = (int) (ways % MOD);
    }
}