/*
4. An athlete runs in a triangular park with sides provided as input by the user in meters. If the
athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint =>
a. Take user input for 3 sides of a triangle
b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
c. Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.*;

public class AthleteRounds {

    // Method to compute number of rounds for 5km run
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        return rounds;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of triangle: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of triangle: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Athlete must complete " + rounds + " rounds to finish 5 km run.");
    }
}
