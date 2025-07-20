package EX_3_15;

import java.util.Scanner;

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Answers_8 {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Doe", 50.00);
        Account account2 = new Account("John Doe", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        input.close();
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}