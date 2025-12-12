// 4. Harmonic Number
// a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
// b. I/P -> The Harmonic Value N. Ensure N != 0
// c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
// d. O/P -> Print the Nth Harmonic Value.

import java.util.*;

public class HarmonicNumber {
    // Function to compute the Nth harmonic value
    public static double computeHarmonic(int N) {
        double sum = 0.0;

        // Add 1/i for i = 1 to N
        for (int i = 1; i <= N; i++) {
            sum += (1.0 / i);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (non-zero): ");
        int N = sc.nextInt();

        // Validate input
        if (N == 0) {
            System.out.println("Error: N cannot be zero.");
            return;
        }

        double harmonicValue = computeHarmonic(N);

        System.out.println("Harmonic Value H" + N + " = " + harmonicValue);
    }
}
