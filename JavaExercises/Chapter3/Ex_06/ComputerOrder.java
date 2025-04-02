import java.util.Scanner;

/*
 * This program calculates the cost of an prder for a computer system based on the 
 * screen size and optional extras
 */
public class ComputerOrder {

	public static void main(String[] args) {
		double orderPrice = 375.99;
		int screenSize;
		char printer, virus;
        Scanner keyboard = new Scanner(System.in);
        // get screen size
        System.out.println("Welcome! The basic system costs 375.99. Please choose between a 38 (75.99) or 43 (99.99) inch screen. Type the preferred screen size:");
        screenSize = keyboard.nextInt();
        // add screen to order
        switch (screenSize) 
        {
         	case 38:
         		orderPrice += 75.99;
         		break;
         	case 43:
         		orderPrice += 99.99;
         		break;
         	default:
         		System.out.println("Screen size unavailable. Selecting 38 inch screen.");
         		orderPrice += 75.99;
        }
        System.out.println("Current price: " + orderPrice);
        // adding optional extras
        System.out.println("Would you like to add a printer for 125? (type y or n):");
        printer = keyboard.next().charAt(0);
        if (printer =='y')
        {
            orderPrice += 125.00;
            System.out.println("Printer selected. Current price: " + orderPrice);
        }
        else 
        {
        	System.out.println("Printer not selected. Current price: " + orderPrice);
        }
        System.out.println("Would you like to add an anti virus program for 65.99? (type y or n):");
        virus = keyboard.next().charAt(0);
        if (virus =='y')
        {
        	System.out.println("Anti virus selected.");
            orderPrice += 65.99;
        }
        else 
        {
        	System.out.println("Anti virus not selected.");
        }
        // display final price
        System.out.println("Total Price: "+ orderPrice);

	}

}
