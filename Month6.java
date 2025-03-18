import java.util.Scanner;

public class BanglaSeasonIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        scanner.close();

        if (month == 4 || month == 5) {
            System.out.println("Season: Summer (Grishmo)");
        } else if (month == 6 || month == 7) {
            System.out.println("Season: Rainy (Barsha)");
        } else if (month == 8 || month == 9) {
            System.out.println("Season: Autumn (Shorot)");
        } else if (month == 10 || month == 11) {
            System.out.println("Season: Late Autumn (Hemonto)");
        } else if (month == 12 || month == 1) {
            System.out.println("Season: Winter (Sheet)");
        } else if (month == 2 || month == 3) {
            System.out.println("Season: Spring (Boshonto)");
        } else {
            System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }
    }
}
