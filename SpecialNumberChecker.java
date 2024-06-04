import java.util.Scanner;

public class SpecialNumberChecker {
    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to check if a number is a Special number
    public static boolean isSpecial(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a Special number
        if (isSpecial(number)) {
            System.out.println(number + " is a Special number.");
        } else {
            System.out.println(number + " is not a Special number.");
        }

        sc.close();
    }
}