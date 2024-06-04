import java.util.Scanner;

public class DuckNumberChecker {
    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int number) {
        int d = 0;
        for (int i = 1; i <= number; i++) {
            d = number % 10;
            if (d == 0) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Duck Number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        scanner.close();
    }
}
