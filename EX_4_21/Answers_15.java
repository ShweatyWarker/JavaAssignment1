package EX_4_21;

import java.util.Scanner;

//Set counter to 1
//Set largest to a very small number (or first input)
//While counter <= 10
//Prompt user to enter a number
//Read number
//If number > largest
//Set largest to number
//Increment counter by 1
//Print largest

public class Answers_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest = Integer.MIN_VALUE; // Start with the smallest integer

        while (counter <= 10) {
            System.out.printf("Enter integer #%d: ", counter);
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("The largest integer entered is: %d\n", largest);

        scanner.close();
    }
}