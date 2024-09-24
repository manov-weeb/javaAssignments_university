import java.util.Scanner;

class Shape {
    double radius, height;

    // Constructor for the Shape class
    Shape(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
}

class Cylinder extends Shape {

    // Constructor for Cylinder using the super keyword
    Cylinder(double radius, double height) {
        super(radius, height);
    }

    // Method to calculate the surface area of the cylinder
    double calculateSurfaceArea() {
        double baseArea = Math.PI * radius * radius;
        double lateralSurfaceArea = 2 * Math.PI * radius * height;
        return (2 * baseArea) + lateralSurfaceArea;
    }
}

public class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for radius and height
        System.out.print("Enter the radius of the base of the cylinder: ");
        double r = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double h = scanner.nextDouble();

        // Creating a Cylinder object
        Cylinder cylinder = new Cylinder(r, h);

        // Output the calculated surface area
        System.out.println("The surface area of the cylinder is: " + cylinder.calculateSurfaceArea() + " sq. units");

        // Close the scanner
        scanner.close();
    }
}
