import java.util.Scanner;
/*
 * This program accepts the length and height of a rectangle
 * to calculate and output the area and perimeter
 */

public class Rectangle {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		double length, height, area, perimeter;
		
		// accept length and height
		System.out.print("Please enter the length of your rectangle (cm): ");
		length = keyboard.nextDouble();
		System.out.print("Please enter the height of your rectangle (cm): ");
		height = keyboard.nextDouble();
		
		// calculate area and perimeter
		area = length * height;
		perimeter = 2 * (length + height);
		
		// display results with units
		System.out.println("Area = " + area + " cm^2");
		System.out.println("Perimeter = " + perimeter + " cm");
	}
}
