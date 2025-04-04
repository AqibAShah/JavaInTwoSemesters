import java.util.Scanner;
/*
 * This program gives the user the option of running a program to display 
 * a square of a size defined by the user
 */
public class DisplayStarsRepeat {

	public static void main(String[] args) {
		int num;
		char repeat;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Do you want to run the program? (y/n)");
			repeat = keyboard.next().charAt(0);
			if (Character.toUpperCase(repeat) == 'N') {
				System.out.println("Goodbye");
				return;
			}
			System.out.println("Size of square? ");
			num = keyboard.nextInt();
			while (num < 2 || num > 20) {
				System.out.println("Please enter a number between 2 and 20. ");
				num = keyboard.nextInt();
			}
			for (int i = 1; i <= num; i++)
			{
				for (int j = 1; j <= num; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		} while (Character.toUpperCase(repeat) == 'Y');

	}

}
