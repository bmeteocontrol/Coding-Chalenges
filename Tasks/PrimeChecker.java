package Tasks;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        // TODO: Add code here to check if the number is prime
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 7 prime? " + isPrime(7)); // Output should be true
        System.out.println("Is 10 prime? " + isPrime(10)); // Output should be false
    }
}
