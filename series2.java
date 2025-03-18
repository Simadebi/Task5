

import java.util.Scanner;

public class OddSquareSum {
    public static int sumOfSeries(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1; // Generate the i-th odd number
            total += oddNumber * oddNumber; // Square and add to total
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = sumOfSeries(n);
        System.out.println("The sum of the series up to " + n + " terms is: " + result);
    }
}

