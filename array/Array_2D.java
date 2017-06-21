// 2D array in java
import java.util.*;
class Array_2D
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		
		System.out.println("Enter the elements of array");
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				a[r][c]=s.nextInt();
			}
		}
		System.out.println("Print the elements of array");
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.print(a[r][c]+"\t");
			}
			System.out.println("\n");
		}
	}
}