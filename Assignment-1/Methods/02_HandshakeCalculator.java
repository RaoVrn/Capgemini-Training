/*
2. Create a program to find the maximum number of handshakes among N number of students.
Hint =>
a. Get integer input for number of students
b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible
handshakes.
c. Write a method to use the combination formulae to calculate the number of handshakes
*/

import java.util.*;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes possible: " + handshakes);
    }
}