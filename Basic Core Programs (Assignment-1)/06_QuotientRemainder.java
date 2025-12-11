// 6. Java Program to Compute Quotient and Remainder

import java.util.*;

public class QuotientRemainder {

    // Function to compute and print quotient & remainder
    public static void computeQR(int dividend, int divisor) {

        // Quotient = dividend / divisor
        int quotient = dividend / divisor;

        // Remainder = dividend % divisor
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Divisor must not be zero
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
            return;
        }

        computeQR(dividend, divisor);
    }
}
