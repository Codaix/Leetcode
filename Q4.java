public class Q4 {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be equal).");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 1};
        int result = findSecondLargest(arr);
        System.out.println("Second largest: " + result);
    }
}
