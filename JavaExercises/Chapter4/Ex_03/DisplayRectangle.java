/*
 * This program uses nested for loops to print *
 * in the shape of a rectangle
 */
public class DisplayRectangle {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
