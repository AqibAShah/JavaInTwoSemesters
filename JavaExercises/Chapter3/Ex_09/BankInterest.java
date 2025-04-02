import java.util.Scanner;

/*
 * A program that displays how much money can be earned in one 
 * year as interest for the provided bank account. It also ensures that 
 * the deposit satisfies a minimum balance requirement.
 */

public class BankInterest
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// declare vars
		char account;
		double interest = 0, savings;
		int minBalance;
		// accept bank account
		System.out.println("Enter your bank account (A,B,C,X)");
		account = keyboard.next().charAt(0);
		account = Character.toUpperCase(account);
		// switch statement to determine interest 
		// and min balance requirement
		switch (account) 
		{
			case 'A', 'C':
				interest = 1.5;
				minBalance = 250;
				break;
			case 'B':
				interest = 2;
				minBalance = 1000;
				break;
			case 'X':
				interest = 5;
				minBalance = 5000;
				break;
			default:
				// do not deposit money
				System.out.println("No such account");
				return;
		}
		// accept money to deposit from user
		System.out.println("Enter the amount of money you want to deposit");
		savings = keyboard.nextDouble();
		// if below min balance requirement do not accept
		if (savings < minBalance) 
		{
			System.out.println("You have not satisfied the minimum balance requirement of your selected account");
			System.out.println("Minimum balance requirements: \nA: 250\nB: 1000\nC: 250\nX: 5000");
			return;
		}
		// calculate and display interest 
		savings *= (interest / 100);
		System.out.printf("You could earn %.2f in interest", savings);

	}
}
