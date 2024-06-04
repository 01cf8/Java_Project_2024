import java.util.Scanner;

public class LeadNumberChecker {

    // Method to check if a number is a lead number
    public static boolean isLeadNumber(int number) {
        int evenSum = 0;
        int oddSum = 0;

        // Iterate over each digit in the number string
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        // Check if the sum of even digits equals the sum of odd digits
        return evenSum == oddSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a lead number
        if (isLeadNumber(number)) {
            System.out.println(number + " is a lead number.");
        } else {
            System.out.println(number + " is not a lead number.");
        }

        scanner.close();
    }
}