import java.util.*;

public class flipCoin {   // Class name stays flipCoin

    // This function performs the coin flips and prints the percentages
    public static void calculateFlips(int totalFlips, int totalHeads, int totalTails) {

        // Loop for the number of flips entered by the user
        for (int i = 0; i < totalFlips; i++) {

            // Generate a random number between 0.0 and 1.0
            double rand = Math.random();

            // If number < 0.5 → Tails, else → Heads
            if (rand < 0.5) {
                totalTails++;
            } else {
                totalHeads++;
            }
        }

        // Calculate percentages of heads and tails
        double headsPercentage = ((double) totalHeads / totalFlips) * 100;
        double tailsPercentage = ((double) totalTails / totalFlips) * 100;

        // Print the results
        System.out.println("Heads Percentage: " + headsPercentage + "%");
        System.out.println("Tails Percentage: " + tailsPercentage + "%");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Asking user for number of flips
        int totalFlips = sc.nextInt();

        // Calling the new function with initial 0 heads and 0 tails
        calculateFlips(totalFlips, 0, 0);
    }
}
