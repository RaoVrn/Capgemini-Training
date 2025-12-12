// 1. Flip Coin and print percentage of Heads and Tails
// a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
// b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
// c. O/P -> Percentage of Head vs Tails

import java.util.*;

public class FlipCoin {
    // Function to perform coin flips and print percentages
    public static void calculateFlips(int totalFlips, int totalHeads, int totalTails) {

        for (int i = 0; i < totalFlips; i++) {

            // Generate a random number between 0 and 1
            double rand = Math.random();

            if (rand < 0.5) {
                totalTails++;
            } else {
                totalHeads++;
            }
        }

        // Calculate percentages
        double headsPercentage = ((double) totalHeads / totalFlips) * 100;
        double tailsPercentage = ((double) totalTails / totalFlips) * 100;

        // Print final results
        System.out.println("Heads Percentage: " + headsPercentage + "%");
        System.out.println("Tails Percentage: " + tailsPercentage + "%");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to flip the coin: ");
        int totalFlips = sc.nextInt();

        // Ensure input is a positive integer
        if (totalFlips <= 0) {
            System.out.print("Please enter a positive integer: ");
            totalFlips = sc.nextInt();
        }

        // Valid input → call function
        calculateFlips(totalFlips, 0, 0);
    }
}
