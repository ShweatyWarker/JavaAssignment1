package Exercise_2_24;

import java.util.Scanner;

public class Answer_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt and read five integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt(); // 2

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt(); // 4

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt(); // 6

        System.out.print("Enter fourth integer: ");
        int num4 = input.nextInt(); // 8

        System.out.print("Enter fifth integer: ");
        int num5 = input.nextInt(); // 10

        // Assume the first number is both the largest and smallest
        int largest = num1;
        int smallest = num1;

        // Compare each number to find the largest
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;

        // Compare each number to find the smallest
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;
        if (num5 < smallest) smallest = num5;

        // Output the results
        System.out.printf("Largest is %d\n", largest);
        System.out.printf("Smallest is %d\n", smallest);

        input.close();
    }
}

//Co-Pilot expalination for skipping num1 in comparisons:
//Great question!  
//No, you **do not** need to compare `num1` to `largest` or `smallest` 
//in the `if` statements, because you typically **initialize** 
//both `largest` and `smallest` to `num1` before the comparisons.

//**Example:**
//````java
//int largest = num1;
//int smallest = num1;
//````

//This means:
//- At the start, both `largest` and `smallest` are set to the value of `num1`.
//- The `if` statements then only need to compare
// `num2`, `num3`, `num4`, and `num5` to update `largest` and `smallest` if needed.
//
//**If you wrote:**
//```java
//if (num1 > largest) largest = num1;
//```
//It would always be false (or redundant), since `largest` is already `num1`.
//
//---
//
//**Summary:**  
//- Initialize `largest` and `smallest` to `num1`.
//- Then compare the other numbers (`num2` to `num5`) to update them.
//- No need to compare `num1` again.