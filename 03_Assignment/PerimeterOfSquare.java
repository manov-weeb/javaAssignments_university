import java.util.Scanner;

// Base class Shape
class Shape {
    double area;

    // Constructor for the Shape class
    Shape(double area) {
        this.area = area;
    }

    // Method to display area (common functionality for shapes)
    void displayArea() {
        System.out.println("The area is: " + area + " sq. units");
    }
}

// Derived class Square that inherits from Shape
class Square extends Shape {

    // Constructor for Square class
    Square(double area) {
        super(area);  // Call the constructor of the base class
    }

    // Method to calculate the perimeter
    double calculatePerimeter() {
        double side = Math.sqrt(area);  // Calculate side from area
        return 4 * side;
    }

    // Overriding the displayArea method to provide more details
    @Override
    void displayArea() {
        System.out.println("The area of the square is: " + area + " sq. units");
    }
}

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for area
        System.out.print("Enter the area of the square: ");
        double area = scanner.nextDouble();

        // Creating a Square object (inheriting from Shape)
        Square square = new Square(area);

        // Display area and calculated perimeter using inheritance
        square.displayArea();  // Calls the overridden method in the Square class
        System.out.println("The perimeter of the square is: " + square.calculatePerimeter() + " units");

        // Close the scanner
        scanner.close();
    }
}
