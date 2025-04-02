import java.util.Scanner;
/*
 * This program accepts the users weight and height to calculate and display their 
 * BMI
 */

public class BMI {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		double weight, height, BMI;
		
		// accept weight and height
		System.out.print("Please enter your weight (kg): ");
		weight = keyboard.nextDouble();
		System.out.print("Please enter your height (m): ");
		height = keyboard.nextDouble();
		
		// calculate BMI
		BMI = weight / (height * height);
		
		// display BMI
		System.out.println("BMI = " + BMI + " kg/m^2");
	}
}
