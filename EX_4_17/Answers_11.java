package EX_4_17;

import java.util.Scanner;

public class Answers_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;          // miles driven for a trip
        int gallons;        // gallons used for a trip
        double tripMPG;     // miles per gallon for current trip

        int totalMiles = 0;     // total miles driven
        int totalGallons = 0;   // total gallons used

        System.out.println("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.println("Enter gallons used: ");
            gallons = input.nextInt();

            // Calculate and display MPG for this trip
            tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon this trip: %.2f%n", tripMPG);

            // Update totals
            totalMiles += miles;
            totalGallons += gallons;

            // Prompt for next trip
            System.out.println("\nEnter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        // If trips were entered, display combined MPG
        if (totalGallons != 0) {
            double totalMPG = (double) totalMiles / totalGallons;
            System.out.printf("%nCombined miles per gallon for all trips: %.2f%n", totalMPG);
        } else {
            System.out.println("No data was entered.");
        }

        input.close();
    }
}