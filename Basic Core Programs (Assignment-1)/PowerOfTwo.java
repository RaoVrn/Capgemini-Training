// 3. Power of 2
// a. Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
// b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
// c. Logic -> repeat until i equals N.
// d. O/P -> Print the year is a Leap Year or not

import java.util.*;

public class PowerOfTwo {

    // Function to print the powers of 2 up to 2^N
    public static void printPowers(int N) {

        // Loop from 0 to N and print 2^i
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (0 to 30): ");
        int N = sc.nextInt();

        // Validate integer range
        if (N < 0 || N >= 31) {
            System.out.println("Error: N must be between 0 and 30.");
            return;
        }

        printPowers(N);
    }
}
