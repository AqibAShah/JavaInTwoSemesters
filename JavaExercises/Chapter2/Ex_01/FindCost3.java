import java.util.Scanner;

/*
 * A program to input the initial price of a product and then calculate
 * and display its cost after tax has been added
 */

public class FindCost3 
{
    public static void main(String[] args)
    {
    	// Create scanner object
        Scanner keyboard =  new Scanner(System.in);
        double price, tax;
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: ");
        // prompt for input
        price = keyboard.nextDouble();
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble();
        // perform the calculation
        price = price * (1 + tax/100);
        System.out.println("Cost after tax = " + price);
    }
}