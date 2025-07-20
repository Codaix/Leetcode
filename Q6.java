import java.util.Scanner;

class MinMax {
    int min;
    int max;

    MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class Q6 {

    public static int sumArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static MinMax findMinMax(int[] arr) {
        if (arr.length == 0) {
            return new MinMax(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new MinMax(min, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum
        int sum = sumArray(arr, n);
        System.out.println("Sum of array elements: " + sum);

        // Min-Max
        MinMax result = findMinMax(arr);
        System.out.println("Minimum: " + result.min);
        System.out.println("Maximum: " + result.max);
    }
}
