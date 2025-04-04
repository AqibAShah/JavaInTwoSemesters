import java.util.Scanner;
/*
 * This program prints the times table of a number
 * selected by the user with extra validation and a 
 * do while loop
 */

public class TimesTableDoWhile
{

	public static void main(String[] args) 
	{
		do 
		{
			Scanner keyboard = new Scanner(System.in);
			char runProgram;
			int number;
			System.out.print("Do you want to run the program? (Y/N) ");
			runProgram = keyboard.next().charAt(0);
			if (Character.toUpperCase(runProgram) == 'Y') 
			{
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
			else if (Character.toUpperCase(runProgram) == 'N')
			{
				System.out.println("Goodbye");
				break;
			}
		} while (true);
	}
}
