import java.util.Scanner;

class Cylinder{
	double radius, height, area;
	

	Cylinder(double radius, double height){

		this.radius = radius;
		this.height = height;

	}

	
	

	double getSurfaceArea(){
		area = (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
		return area;

	}

}

public class AreaOfCylinder{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		double r, h;

		System.out.print("Enter the radius of the base of the cylinder: ");

		r = scanner.nextDouble();

		System.out.print("Enter the radius of the base of the cylinder: ");

		h = scanner.nextDouble();


		Cylinder cylinder = new Cylinder(r, h);

		System.out.println("The surface area of the cylinder is: " + cylinder.getSurfaceArea() + "sq. units");

	}
}