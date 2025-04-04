import java.util.Scanner;
/*
 * This program accepts the radius of a circle
 * to calculate and output the area and circumference
 * with extra validation and a menu to give the user 
 * more control
 */

public class CircleWithMenu {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		
		// declare variables
		final double PI = 3.1416;
		double radius = 0.0, area, circumference;
		boolean radiusSet = false;
		int menuOption;
		
		do {
			System.out.println("[1] Set radius");
            System.out.println("[2] Display radius");
            System.out.println("[3] Display area");
            System.out.println("[4] Display circumference");
            System.out.println("[5] Quit");
            System.out.print("Choose an option: ");
            menuOption = keyboard.nextInt();
            System.out.println();
            
            switch (menuOption) 
            {
            	case 1:
            		// set radius
            		System.out.print("Please enter the radius of your circle (cm): ");
            		radius = keyboard.nextDouble();
            		while (radius < 0) 
            		{
            			System.out.println("Negative number provided. Please provide a non-negative number. ");
            			System.out.print("Please enter the radius of your circle (cm): ");
            			radius = keyboard.nextDouble();
            		}
            		radiusSet = true;
            		break;
            	
            	case 2: 
            		// display radius
            		if (!radiusSet) {
            			System.out.println("Radius not set. Please set radius.");
            			break;
            		}
            		System.out.println("Radius = " + radius + " cm");
            		break;
            	
            	case 3: 
            		if (!radiusSet) {
            			System.out.println("Radius not set. Please set radius.");
            			break;
            		}
            		// display area
            		area = PI * (radius * radius);
            		System.out.println("Area = " + area + " cm^2");
            		break;
            	
            	case 4:
	        		if (!radiusSet) {
	        			System.out.println("Radius not set. Please set radius.");
	        			break;
	        		}
	        		else {
	        			// display circumference
		        		circumference = 2 * PI * radius;
		        		System.out.println("Circumference = " + circumference + " cm");
	        		}
	        		break;
	        	
            	default:
	        		break;
            }
			
		} while(menuOption != 5);
	}
}
