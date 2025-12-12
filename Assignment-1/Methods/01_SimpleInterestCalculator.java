/*
Level 1 Practice Programs
1. Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint =>
a. Simple Interest = Principal * Rate * Time / 100
b. Take user input for principal, rate, time
c. Write a method to calculate the simple interest given principle, rate and time as parameters
d. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/

import java.util.*;

public class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println(
            "The Simple Interest is " + simpleInterest +
            " for Principal " + principal +
            ", Rate of Interest " + rate +
            " and Time " + time
        );
    }
}
