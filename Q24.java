class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        int rows = matrix.length, cols = matrix[0].length;
        int dp[][] = new int[rows][cols];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j] = 1 + Math.min(dp[i -1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                    }
                    count += dp[i][j];
                }
            }
        }
        return count;
    }
}