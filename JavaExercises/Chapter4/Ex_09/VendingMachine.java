import java.util.Scanner;
/*
 * Program to simulate a vending machine
 */
public class VendingMachine {

	public static void main(String[] args) {
		// Scanner to accept input
		Scanner keyboard = new Scanner(System.in);
		
		// declare variables
		int menuOption, gum, choc, popcorn, juice;
		gum = choc = popcorn = juice = 0;
		
		do {
			System.out.println("[1] Get gum");
            System.out.println("[2] Get chocolate");
            System.out.println("[3] Get popcorn");
            System.out.println("[4] Get juice");
            System.out.println("[5] Display total sold so far");
            System.out.println("[6] Quit");
            System.out.print("Choose an option: ");
            menuOption = keyboard.nextInt();
            System.out.println();
            
            switch (menuOption) 
            {
            	case 1:
            		gum += 1;
            		break;
            	
            	case 2: 
            		choc += 1;
            		break;
            	
            	case 3: 
            		popcorn += 1;
            		break;
            	
            	case 4:
	        		juice += 1;
	        		break;
	        	
            	case 5:
            		System.out.println("*** ITEMS SOLD ***");
            		System.out.println("Gum: " + gum);
            		System.out.println("Chocolate: " + choc);
            		System.out.println("Juice: " + juice);
            		System.out.println("Popcorn: " + popcorn);
            		System.out.println();
            		break;
            	
            	default:
	        		break;
            }
			
		} while(menuOption != 6);

	}

}
