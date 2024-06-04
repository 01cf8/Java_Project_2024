import java.util.Scanner;

public class SpecialNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate sum of factorials
        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            number /= 10;
        }

        // Check if the sum of factorials is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a special number.");
        } else {
            System.out.println(originalNumber + " is not a special number.");
        }

        sc.close();
    }
}
