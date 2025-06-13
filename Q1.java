/*Que:
 * we are given with an integer array. it is a circular array. we need to tell the maximum
 * absolute diff between adjacent elements.
 * e.g.: arr[] = {1,2,4}
 * output: 3
 */
//solution:
class Diff{
    int adjDiff(int arr[]){
    int maxDiff = 0;
    if(arr.length < 2) return 0;
    maxDiff = Math.abs(arr[0] - arr[arr.length-1]);
    for(int i = 1; i<arr.length; i++){
        maxDiff = Math.max(maxDiff, Math.abs(arr[i] - arr[i-1]));
        }
        return maxDiff;
    }
}

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Diff d = new Diff();
        System.out.println(d.adjDiff(arr));
    }
    
}
