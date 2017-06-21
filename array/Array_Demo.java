// Single Dimension Array
import java.util.*;
class Array_Demo // class
{
	public static void main(String args[]) // main function
	{
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array.. ");
		size=s.nextInt();
		int array[]=new int[size]; // array
		
		System.out.println("Name of Classs == "+array.getClass().getName());
		
		System.out.println("Enter the elements of Array");
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		
		System.out.println("now printing the array");
		for(int i=0;i<size;i++)
		{
			System.out.println("array at "+i+" = "+array[i]);
		}
	}
}