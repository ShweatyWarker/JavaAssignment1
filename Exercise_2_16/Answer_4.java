package Exercise_2_16;

import java.util.Scanner;
public class Answer_4 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt(); // Example: 5

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt(); // Example: 10

        // Compare the two integers
        if (number1 > number2) {
            System.out.printf("%d is larger\n", number1);
        } else if (number2 > number1) {
            System.out.printf("%d is larger\n", number2); // Output: 10 is larger
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}