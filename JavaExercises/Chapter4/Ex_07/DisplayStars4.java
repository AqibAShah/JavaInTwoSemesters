import java.util.Scanner;
/*
 * This program prints a sqaure of a size determined by 
 * the user
 */
public class DisplayStars4 {

	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
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

	}

}
