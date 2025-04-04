
import java.util.Scanner;

/*
 * This program accepts a number form the user and prints the 
 * even numbers from 1 to that number 
 */

public class DisplayEvenOdd 
{
	public static void main(String[] args)
	{
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please insert a number ");
		number = keyboard.nextInt();
		if (number < 0)
		{
			number *= -1;
		}
		System.out.println("*** Numbers from 1 to " + number + " ***");
		System.out.println();
		for (int i = 1; i <= number; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i + " is even");
			}
			else 
			{
				System.out.println(i + " is odd");
			}
		}
	}
}
