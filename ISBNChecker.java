import java.util.Scanner;

public class ISBNChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 10-digit ISBN number:");
        long isbn = scanner.nextLong();

        if (isbn < 1000000000L || isbn > 9999999999L) {
            System.out.println("Illegal ISBN");
            System.exit(0);
        }

        int sum = 0;

        for (int i = 10; i >= 1; i--) {
            int digit = (int) (isbn % 10);
            sum += digit * i;
            isbn /= 10;
        }

        if (sum % 11 == 0) {
            System.out.println("Legal ISBN");
        } else {
            System.out.println("Illegal ISBN");
        }

        scanner.close();
    }
}
