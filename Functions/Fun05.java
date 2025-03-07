import java.util.Scanner;

public class Fun06 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean prime(int n) {
        if (n < 2) {
            System.out.println("Enter a valid value");
            return false;
        }

        if (isPrime(n)) {
            System.out.println("Number is prime");
            return true;
        } else {
            System.out.println("Number is not prime");
            return false;
        }
    }

    public static void main(String[] args) {
        prime(16);
        primeRange(20);
    }
}
