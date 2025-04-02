import java.util.Scanner;

/*
 * A program that displays a timetable depending on which group 
 * the user enters
 */

public class TimetableVersion2 {

	public static void main(String[] args) {
		char group;
		Scanner keyboard = new Scanner(System.in);
		// get group
		System.out.println("***Lab Times***");
		System.out.println("Enter your group (A,B,C)");
		group = keyboard.next().charAt(0);
		// can accept lower and upper case
		group = Character.toUpperCase(group);
		if ( group == 'A')
		{
			System.out.println("10:00am");
		}
		else if (group == 'B')
		{
			System.out.println("1:00pm");
		}
		else if (group == 'C')
		{
			System.out.println("11:00am");
		}
		else 
		{
			System.out.println("No such group");
		}

	}

}
