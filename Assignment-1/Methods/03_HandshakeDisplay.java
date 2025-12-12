/*
3. Create a program to find the maximum number of handshakes among N number of students.
Hint =>
a. Get integer input for numberOfStudents variable.
b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible
handshakes.
c. Display the number of possible handshakes.
*/

import java.util.*;

public class HandshakeDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum possible handshakes: " + handshakes);
    }
}
