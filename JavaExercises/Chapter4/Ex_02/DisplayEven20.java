/*
 * This program prints the even numbers from 1 to 20 
 */
public class DisplayEven20 
{
	public static void main(String[] args)
	{
		System.out.println("*** Even numbers from 1 to 20 ***");
		System.out.println();
		for (int i = 1; i <= 20; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
