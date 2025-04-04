/*
 * This program prints the six times table with for loops
 */

public class TimesTable6 
{

	public static void main(String[] args) 
	{
		int number = 6;
		System.out.println("*** " + number + " Times Table ***");
		System.out.println();
		for (int i = 1; i <= 12; i++)
		{
			System.out.println(i + " x " + number + " = " + (i * number));
		}
	}
}
