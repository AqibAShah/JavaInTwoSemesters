import java.util.Scanner;

/*
 * This program accepts the users age and the current year
 * to calculate the year that the user was born
 */

public class AgeGuesser {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int YEAR;
		int age, bornIn;
		System.out.println("How old are you this year?");
		// change from nextDouble to nextInt
		age = keyboard.nextInt();
		// getting current year
		System.out.println("What year is it?");
		// change from nextDouble to nextInt
		YEAR = keyboard.nextInt();
		bornIn = YEAR - age;
		// using correct variable
		System.out.println("I think you were born in " + bornIn);
		
		

	}

}
