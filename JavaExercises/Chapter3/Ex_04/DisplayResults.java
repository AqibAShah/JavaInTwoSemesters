import java.util.Scanner;

/*
 * This program accepts a users mark and tells them the result of 
 * their exam.
 */
public class DisplayResults 
{

	public static void main(String[] args) 
	{
		int mark;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What exam mark did you get? ");
		mark = keyboard.nextInt();
		if (mark >= 70) 
		{
			System.out.println("Congratulations, you got a distinction.");
		}
		else if (mark >= 40) 
		{
			System.out.println("Congratulations, you passed.");
		}
		else
		{
			System.out.println("Sorry, you have failed.");
		}
		
		System.out.println("Good luck with your other exams");
	}

}
