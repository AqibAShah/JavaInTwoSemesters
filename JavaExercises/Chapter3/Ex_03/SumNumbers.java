import java.util.Scanner;

/*
 * This program accepts two numbers, calculates its sum and 
 * compares it to the users guess
 */

public class SumNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number1, number2, sumGuess, sumActual;
		// accept two numbers
		System.out.println("Please enter your first number");
		number1 = keyboard.nextInt();
		System.out.println("Please enter your second number");
		number2 = keyboard.nextInt();
		// accept users guess of their sum
		System.out.println("Please guess the sum of the two numbers");
		sumGuess = keyboard.nextInt();
		// calculate actual sum
		sumActual = number1 + number2;
		
		if (sumActual == sumGuess) 
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Incorrect, the answer was: " + sumActual);
		}
	}

}
