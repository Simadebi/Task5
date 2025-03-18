import java.util.Scanner;

public class PowerCalculation {
    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base; // Multiply base exponent times
        }
        if (exponent < 0) {
            return 1 / result; // If exponent is negative, take reciprocal
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        double result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}


