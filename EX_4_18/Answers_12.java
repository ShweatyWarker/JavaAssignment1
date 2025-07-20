package EX_4_18;

// Answers_12.java
// Credit Limit Calculator

import java.util.Scanner;

public class Answers_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Prompt for account number (sentinel -1 to quit)
            System.out.print("Enter account number (or -1 to quit): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                System.out.println("Program terminated.");
                break;
            }

            // Prompt for account data
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Display results
            System.out.println("New balance for account " + accountNumber + " is: $" + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded\n");
            } else {
                System.out.println("Credit limit not exceeded\n");
            }
        }

        input.close();
    }
}