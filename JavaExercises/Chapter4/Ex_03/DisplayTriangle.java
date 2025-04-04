/*
 * This program uses nested for loops to print *
 * in the shape of a triangle
 */
public class DisplayTriangle {

	public static void main(String[] args) {
		for (int i = 4; i >= 1; i--) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
