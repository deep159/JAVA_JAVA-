import java.lang.*;
import java.util.*; // package for scanner class

class Switch_Demo // declared class
{
	public static void main(String args[]) // declared main function
	{
		Scanner input=new Scanner(System.in); // creating object of scanner class
		System.out.println("Enter 1 if marks between 10 to 40");
		System.out.println("Enter 2 if marks between 40 to 60");
		System.out.println("Enter 3 if marks between 60 to 80");
		System.out.println("Enter 4 if marks between 80 to 100");
		
		int option;
		System.out.println("please choose one option...");
		option=input.nextInt();
		
		//keyword
		switch(option) // expression
		{
			// keyword
			case 1: // condition first
			System.out.println("D Grade");
			break;
			case 2: // condition second
			System.out.println("C Grade");
			break;
			case 3: // condition third
			System.out.println("B Grade");
			break;
			case 4: // condition fouth
			System.out.println("A Grade");
			break;
			default: // condition default.
			System.out.println("Invalid input");
		}		
	}
}