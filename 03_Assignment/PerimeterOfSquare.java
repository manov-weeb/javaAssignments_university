import java.util.Scanner;


class Square{
	double area, side, perimeter;
	
	Square(double area){
		this.area = area;
		this.side = Math.pow(area, 0.5);
	}

	
	double getPerimeter(){
	
		perimeter = 4 * side;	
		return perimeter;
	}

	

}

public class PerimeterOfSquare{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the area of the sqaure: ");
		double area = scanner.nextDouble();
		
		Square square = new Square(area);
		System.out.println("The area of the Square is: " + square.area + "sq. units, and it has perimeter of " + square.getPerimeter() + " units"); 

	}


}