class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i = 0, num = 1;
        if(n%2==1){
            res[i++] = 0;
        }
        while(i<n){
            res[i++] = num;
            res[i++] = -num;
            num++;
        }
        return res;
    }
}