package EX_4_19;

import java.util.Scanner;

public class Answers_13 {
    public static void main(String[] args) {
        // Item values as per the problem statement
        double[] itemValues = {0, 239.99, 129.75, 99.95, 350.89}; // index 0 unused

        Scanner scanner = new Scanner(System.in);
        double totalSales = 0.0;

        System.out.println("Enter the item numbers sold last week (1-4), one per line.");
        System.out.println("Enter 0 when finished:");

        while (true) {
            System.out.print("Item number (1-4, or 0 to finish): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == 0) {
                break;
            }
            if (itemNumber >= 1 && itemNumber <= 4) {
                totalSales += itemValues[itemNumber];
            } else {
                System.out.println("Invalid item number. Please enter a number between 1 and 4.");
            }
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total earnings for the week: $%.2f\n", earnings);

        scanner.close();
    }
}