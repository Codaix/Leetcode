
/*public class solution {
    public static void main(String[] args) {
        int[] spells = new int[]{5,1,3};
        int[] potions = new int[]{1,2,3,4,5};
        int success = 7;
        solution sol = new solution();
        int result[] = sol.successPairs(spells, potions, success);
    }

    public int[] successPairs(int[] spells, int[] potions, long success){
        // Implement your logic here
        long product = 0;
        int[] result = new int[spells.length];
        for(int i = 0; i < spells.length; i++){
            for(int j = 0; j < potions.length; j++){
                product = spells[i] * potions[j];
                if(product >= success){
                    result[i]++;
                }
            }
        }
        return result;
    }

}*/
// not optimal for  large data.. 
// time complexity -> O(n*m);
// rather first quick sort the potions and then do success.spells and binary search the first answer that is greater thn potion and count the rest smaller potions left before that
// this way->
public class solution{
    public int[] successPairs(int[] spells, int[] potions, int success){
        int result[] = new int[spells.length];
        quickSort(potions, 0, potions.length - 1);
        for(int i = 0; i<spells.length;i++){
            int key = (success + spells[i] - 1) / spells[i]; // ceil(success / spells[i])
            int index = binarySearch(potions, key);
            result[i] = potions.length - index;
        }

        return result;
    }
    public int quickSort(int[] potion, int low, int high){
        if(low < high){
            int pi = partition(potion, low, high);
            quickSort(potion, low, pi - 1);
            quickSort(potion, pi + 1, high);
        }
        return 0;
    }
    public int partition(int[] potion, int low, int high){
        int pivot = potion[high];
        int i = (low - 1);
        for(int j = low; j < high; j++){
            if(potion[j] <= pivot){
                i++;
                // swap potion[i] and potion[j]
                int temp = potion[i];
                potion[i] = potion[j];
                potion[j] = temp;
            }
        }
        // swap potion[i + 1] and potion[high] (or pivot)
        int temp = potion[i + 1];
        potion[i + 1] = potion[high];
        potion[high] = temp;

        return i + 1;
    }
    public int binarySearch(int[] potion, int key){
        int left = 0;
        int right = potion.length - 1;
        int result = potion.length; // default to length if all elements are less than key
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(potion[mid] >= key){
                result = mid; // potential answer found
                right = mid - 1; // look for a smaller index
            } else {
                left = mid + 1; // look in the right half
            }
        }
        return result;
    }
}