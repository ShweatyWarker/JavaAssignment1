package EX_4_20;

import java.util.Scanner;

public class Answers_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EMPLOYEES = 3;

        for (int i = 1; i <= EMPLOYEES; i++) {
            System.out.printf("Enter hours worked for employee %d: ", i);
            double hours = scanner.nextDouble();

            System.out.printf("Enter hourly rate for employee %d: ", i);
            double rate = scanner.nextDouble();

            double grossPay;
            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                grossPay = 40 * rate + (hours - 40) * rate * 1.5;
            }

            System.out.printf("Employee %d gross pay: $%.2f\n\n", i, grossPay);
        }

        scanner.close();
    }
}