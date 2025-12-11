// 8. Java Program to Check Whether a Number is Even or Odd

import java.util.*;

public class EvenOddCheck {

    // Function to check if a number is even or odd
    public static void checkEvenOdd(int num) {

        // If number is divisible by 2 → even
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } 
        // Otherwise → odd
        else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkEvenOdd(num); // Calling the function
    }
}
