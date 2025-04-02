import java.util.Scanner;
/*
 * This program accepts the users weight and height to calculate and display their 
 * BMI. It also reports on the range the BMI value is in.
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
		System.out.println("*****RESULTS*****");
		System.out.println("BMI = " + BMI + " kg/m^2");
		// classify BMI
		if (BMI < 18.5)
		{
			System.out.println("Classification: Underweight");
		}
		else if (BMI > 18.5 && BMI < 24.9)
		{
			System.out.println("Classification: Healthy");
		}
		else if (BMI > 24.9) 
		{
			System.out.println("Classification: Overweight");
		}
		System.out.println("*****************");
	}
}
