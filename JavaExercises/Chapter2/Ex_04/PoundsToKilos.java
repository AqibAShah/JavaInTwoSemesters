import java.util.Scanner;

/*
 * This program accepts the weight of an item in pounds 
 * and converts and displays it in kilograms
 */

public class PoundsToKilos {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		double pounds, kilos;
		
		// accept user input
		System.out.println("Please enter the weight in pounds (lb)");
		pounds = keyboard.nextDouble();
		
		// convert to kilos
		kilos = pounds / 2.2;
		
		// display weight in kilos
		System.out.println("Weight = " + kilos + " kg");
		

	}

}
