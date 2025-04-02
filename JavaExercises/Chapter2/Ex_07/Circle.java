import java.util.Scanner;
/*
 * This program accepts the radius of a circle
 * to calculate and output the area and circumference
 */

public class Circle {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		
		// declare variables
		final double PI = 3.1416;
		double radius, area, circumference;
		
		// accept radius
		System.out.print("Please enter the radius of your circle (cm): ");
		radius = keyboard.nextDouble();
		
		// calculate area and circumference
		area = PI * (radius * radius);
		circumference = 2 * PI * radius;
		
		// display results with units
		System.out.println("Area = " + area + " cm^2");
		System.out.println("Circumference = " + circumference + " cm");
	}
}
