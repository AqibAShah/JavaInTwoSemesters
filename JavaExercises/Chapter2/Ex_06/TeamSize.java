import java.util.Scanner;
/*
 * This program accepts the number of students in a class and the size 
 * of teams that can be formed. The program uses these two values to display 
 * the number of teams that can be formed and the number of remaining students.
 */

public class TeamSize {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		int numStudents, numTeams, teamSize, remainingStudents;
		
		// accept number of students and team size
		System.out.print("Please enter the number of students in the group: ");
		numStudents = keyboard.nextInt();
		System.out.print("Please enter the size of teams you want to form: ");
		teamSize = keyboard.nextInt();
		
		// calculate number of teams and
		// remaining students
		numTeams = numStudents / teamSize;
		remainingStudents = numStudents % teamSize;
		
		// display results
		System.out.println("Number of Teams:" + numTeams + " teams");
		System.out.println("Number of remaining students: " + remainingStudents + " students");
	}
}
