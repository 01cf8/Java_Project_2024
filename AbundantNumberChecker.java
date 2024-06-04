import java.util.Scanner;

public class AbundantNumberChecker {
    public static boolean isAbundantNumber(int number) {
        int sumOfDivisors = 0;

        // Calculate the sum of proper divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if the sum of proper divisors is greater than the number
        return sumOfDivisors > number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        scanner.close();
    }
}