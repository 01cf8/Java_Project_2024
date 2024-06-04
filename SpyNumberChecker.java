import java.util.Scanner;

public class SpyNumberChecker {

    public static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number = number / 10;
        }

        // Check if the sum of digits is equal to the product of digits
        return sumOfDigits == productOfDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        scanner.close();
    }
}