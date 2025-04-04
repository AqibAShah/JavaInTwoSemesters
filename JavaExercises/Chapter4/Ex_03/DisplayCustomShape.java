/*
 * This program uses nested for loops to print *
 * in a custom shape
 */
public class DisplayCustomShape {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print("*");
			}
			if (i == 2 || i == 3) 
			{
				for (int j = 0; j < 6; j++) 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
