import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu options
        System.out.println("Menu:");
        System.out.println("1. Find and display the sum of the series: S = x - x^2 + x^3 - x^4 + x^5 - ... - x^20");
        System.out.println(
                "2. Find and display the sum of the series: S = 1/a^2 + 1/a^4 + 1/a^6 + 1/a^8 + ... to n terms");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Sum of the series: S = x - x^2 + x^3 - x^4 + x^5 - ... - x^20
                System.out.print("Enter the value of x: ");
                int x = scanner.nextInt();
                double sum1 = 0;
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        sum1 -= Math.pow(x, i);
                    } else {
                        sum1 += Math.pow(x, i);
                    }
                }
                System.out.println("The sum of the series is: " + sum1);
                break;

            case 2:
                // Sum of the series: S = 1/a^2 + 1/a^4 + 1/a^6 + 1/a^8 + ... to n terms
                System.out.print("Enter the value of a: ");
                int a = scanner.nextInt();
                System.out.print("Enter the number of terms (n): ");
                int n = scanner.nextInt();
                double sum2 = 0;
                for (int i = 1; i <= n; i++) {
                    sum2 += 1 / Math.pow(a, 2 * i);
                }
                System.out.println("The sum of the series is: " + sum2);
                break;

            default:
                // Handle incorrect option
                System.out.println("Error: Invalid option. Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }
}
