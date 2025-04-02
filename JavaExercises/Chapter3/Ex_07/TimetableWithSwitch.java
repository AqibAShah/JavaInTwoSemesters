import java.util.Scanner;

/*
 * A program that displays a timetable depending on which group 
 * the user enters using a switch statement
 */

public class TimetableWithSwitch {

	public static void main(String[] args) {
		char group;
		Scanner keyboard = new Scanner(System.in);
		// accept group and converts to upper case char
		System.out.println("***Lab Times***");
		System.out.println("Enter your group (A,B,C)");
		group = keyboard.next().charAt(0);
		group = Character.toUpperCase(group);
		// switch statement
		switch (group) 
		{
			case 'A':
				System.out.println("10:00am");
				break;
			case 'B':
				System.out.println("1:00pm");
				break;
			case 'C':
				System.out.println("11:00am");
				break;
			default:
				System.out.println("No such group");
		}

	}

}
