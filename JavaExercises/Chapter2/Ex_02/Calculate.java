import java.util.Scanner;

/*
 * This program performs a calculation on two numbers
 * and outputs the result
 */

public class Calculate {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        num2 = 6;
        System.out.print("Enter value ");
        num1 = keyboard.nextInt();
        num1 = num1 + 2;
        num2 = num1 / num2;
        System.out.println("result = " + num2);
	}
}

// If the user enters 10, the result is 2
