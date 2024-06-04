import java.util.Scanner;

public class MeanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b:");
        double b = scanner.nextDouble();

        System.out.println("Choose the mean to calculate:");
        System.out.println("1. Arithmetic Mean");
        System.out.println("2. Geometric Mean");
        System.out.println("3. Harmonic Mean");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double arithmeticMean = (a + b) / 2;
                System.out.println("Arithmetic Mean: " + arithmeticMean);
                break;

            case 2:
                double geometricMean = Math.sqrt(a * b);
                System.out.println("Geometric Mean: " + geometricMean);
                break;

            case 3:
                double harmonicMean = (2 * a * b) / (a + b);
                System.out.println("Harmonic Mean: " + harmonicMean);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}
