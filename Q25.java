class Solution {
    public int numSubmat(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] height = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(mat[i][j] == 1){
                    height[i][j] = (i == 0 ? 1: height[i-1][j] + 1);
                }
            }
        }
        int  count = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                int minHeight = height[i][j];
                for(int k = j; k>=0 && minHeight > 0; k--){
                    minHeight = Math.min(minHeight, height[i][k]);
                    count += minHeight;
                }
            }
        }
        return count;
    }
}