class Solution {
    public int maximum69Number (int num) {
        int temp;
        String no = Integer.toString(num);
        int arr[] = new int[no.length()];
        for(int i = no.length()-1; i>=0; i--){
            temp = num%10;
            arr[i] = temp;
            num = num/10;
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 6){
                arr[i] = 9;
                break;
            }
            
        }
        int finalNum = 0;
        for(int d : arr){
            finalNum = finalNum * 10 + d;
        }     
        return finalNum;
    }
}