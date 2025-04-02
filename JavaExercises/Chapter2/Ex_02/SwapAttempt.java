import java.util.Scanner;
/*
 * This program attempts to swap the values of two 
 * variables and outputs the result
 */

public class SwapAttempt {
    public static void main(String [] args){
        // declare variables, new var for swap
        int x,y,temp;
        // scanner to accept input
        Scanner keyboard = new Scanner(System.in); 
        //enter values
        System.out.print("Enter value for x ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y ");
        y = keyboard.nextInt();

        // code attempting to swap two variables
        temp = x;
        x = y;
        y = temp;
        
        //display results
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}