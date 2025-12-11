// 5. Factors
// a. Desc -> Computes the prime factorization of N using brute force.
// b. I/P -> Number to find the prime factors
// c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
// d. O/P -> Print the prime factors of number N.

import java.util.*;

public class PrimeFactors {

    // Function to print all prime factors of a number
    public static void printPrimeFactors(int N) {

        System.out.print("Prime factors of " + N + " are: ");

        // Check for smallest prime factor 2
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }

        // Check for odd factors from 3 to sqrt(N)
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        // If remaining N is > 2, it is prime
        if (N > 2) {
            System.out.print(N);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int N = sc.nextInt();

        if (N <= 1) {
            System.out.println("Enter a number greater than 1.");
            return;
        }

        printPrimeFactors(N);
    }
}
