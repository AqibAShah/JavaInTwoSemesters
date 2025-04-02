import java.util.Scanner;

/*
 * This program accepts two numbers and determines which number is bigger
 * or if they are equal
 */

public class CompareNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number1, number2;
		// accept numbers
		System.out.println("Please enter your first number");
		number1 = keyboard.nextInt();
		System.out.println("Please enter your second number");
		number2 = keyboard.nextInt();
		if (number1 == number2) 
		{
			System.out.println("NUMBERS ARE EQUAL");
		}
		else if (number1 > number2)
		{
			System.out.println("FIRST NUMBER BIGGER");
		}
		else
		{
			System.out.println("SECOND NUMBER BIGGER");
		}
	}

}
