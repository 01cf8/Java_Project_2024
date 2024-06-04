import java.util.Scanner;

public class PronicChecker {
    public static boolean isPronic(int number) {
        for (int i = 0; i <= number; i++) {
            if (i * (i + 1) == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a Pronic number
        if (isPronic(number)) {
            System.out.println(number + " is a Pronic number.");
        } else {
            System.out.println(number + " is not a Pronic number.");
        }

        sc.close();
    }
}