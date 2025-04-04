import java.util.Scanner;
/*
 * This program prints the times table of a number
 * selected by the user with extra validation
 */

public class TimesTableValidation
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Please enter a number");
		number = keyboard.nextInt();
		while (number < 2)
		{
			System.out.println("Please enter a valid number (>=2).");
			number = keyboard.nextInt();
		}
		System.out.println("*** " + number + " Times Table ***");
		System.out.println();
		for (int i = 1; i <= 12; i++)
		{
			System.out.println(i + " x " + number + " = " + (i * number));
		}
	}
}
