// 10. Java Program to Find the Largest Among Three Numbers

import java.util.*;

public class LargestOfThree {

    // Function to find and print the largest among three numbers
    public static void findLargest(int a, int b, int c) {

        int largest;

        // Compare all three numbers
        if (a >= b && a >= c) {
            largest = a;
        }
        else if (b >= a && b >= c) {
            largest = b;
        }
        else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        findLargest(a, b, c);
    }
}
