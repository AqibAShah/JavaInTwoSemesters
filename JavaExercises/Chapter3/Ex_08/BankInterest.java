import java.util.Scanner;

/*
 * A program that displays how much money can be earned in one 
 * year as interest for the provided bank account
 */

public class BankInterest
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char account;
		double interest = 0, savings;
		// accept bank account
		System.out.println("Enter your bank account (A,B,C,X)");
		account = keyboard.next().charAt(0);
		account = Character.toUpperCase(account);
		// switch statement to determine interest
		switch (account) 
		{
			case 'A', 'C':
				interest = 1.5;
				break;
			case 'B':
				interest = 2;
				break;
			case 'X':
				interest = 5;
				break;
			default:
				// do not deposit money
				System.out.println("No such account");
				return;
		}
		// accept money to deposit
		System.out.println("Enter the amount of money you want to deposit");
		// calculate and display savings from interest
		savings = keyboard.nextDouble();
		savings *= (interest / 100);
		System.out.printf("You could earn %.2f in interest", savings);

	}
}
