import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Area of Circle: " + area(radius));
                break;

            case 2:
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                System.out.println("Area of Square: " + area(side, true));
                break;

            case 3:
                System.out.println("Enter the length of the rectangle:");
                double length = scanner.nextDouble();
                System.out.println("Enter the breadth of the rectangle:");
                double breadth = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + area(length, breadth));
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                break;
        }
        scanner.close();
    }

    // Overloaded method to calculate the area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate the area of a square
    public static double area(double side, boolean isSquare) {
        return side * side;
    }

    // Overloaded method to calculate the area of a rectangle
    public static double area(double length, double breadth) {
        return length * breadth;
    }
}
