import java.util.Scanner;

public class VolumeCalculator {

    // Method to calculate the volume of a sphere
    public double volume(double radius) {
        return (4 / 3.0) * (22.0 / 7) * radius * radius * radius;
    }

    // Method to calculate the volume of a cylinder
    public double volume(double radius, double height) {
        return (22.0 / 7) * radius * radius * height;
    }

    // Method to calculate the volume of a cuboid
    public double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator calculator = new VolumeCalculator();

        System.out.println("Choose the shape to calculate the volume:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cuboid");
        System.out.println("4. Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the sphere:");
                double radiusSphere = scanner.nextDouble();
                System.out.println("Volume of Sphere: " + calculator.volume(radiusSphere));
                break;

            case 2:
                System.out.println("Enter the radius of the cylinder:");
                double radiusCylinder = scanner.nextDouble();
                System.out.println("Enter the height of the cylinder:");
                double heightCylinder = scanner.nextDouble();
                System.out.println("Volume of Cylinder: " + calculator.volume(radiusCylinder, heightCylinder));
                break;

            case 3:
                System.out.println("Enter the length of the cuboid:");
                double lengthCuboid = scanner.nextDouble();
                System.out.println("Enter the breadth of the cuboid:");
                double breadthCuboid = scanner.nextDouble();
                System.out.println("Enter the height of the cuboid:");
                double heightCuboid = scanner.nextDouble();
                System.out.println(
                        "Volume of Cuboid: " + calculator.volume(lengthCuboid, breadthCuboid, heightCuboid));
                break;

            case 4:
                System.out.println("Exiting the program.");
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
                break;
        }
        scanner.close();
    }
}