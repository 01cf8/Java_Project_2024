import java.util.Scanner;

public class TwistedPrimeChecker {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Method to check if a number is a Twisted Prime
    public static boolean isTwistedPrime(int number) {
        int reversedNumber = reverseNumber(number);
        return (isPrime(number) && isPrime(reversedNumber));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Twisted Prime
        if (isTwistedPrime(number)) {
            System.out.println(number + " is a Twisted Prime.");
        } else {
            System.out.println(number + " is not a Twisted Prime.");
        }

        scanner.close();
    }
}