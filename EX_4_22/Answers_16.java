package EX_4_22;

public class Answers_16 {
    public static void main(String[] args) {
        // Example 1: Print a table of N, 10*N, 100*N, 1000*N for N from 1 to 5
        System.out.println("Example 1:");
        System.out.printf("%-8s%-8s%-8s%-8s\n", "N", "10*N", "100*N", "1000*N");
        for (int n = 1; n <= 5; n++) {
            System.out.printf("%-8d%-8d%-8d%-8d\n", n, 10 * n, 100 * n, 1000 * n);
        }

        // Example 2: Print a table of N and N squared for N from 1 to 5000
        System.out.println("\nExample 2:");
        System.out.printf("%-8s%-8s\n", "N", "N^2");
        for (int n = 1; n <= 5000; n++) {
            System.out.printf("%-8d%-8d\n", n, n * n);
        }
    }
}
//I did example 2 so it specifically shows "5,000".