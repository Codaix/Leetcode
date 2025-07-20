public class Q5 {

    public static void printPrimesUpTo(int N) {
        if (N < 2) {
            System.out.println("No prime numbers in this range.");
            return;
        }

        System.out.println("Prime numbers between 1 and " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
