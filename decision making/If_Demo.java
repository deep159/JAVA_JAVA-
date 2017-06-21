import java.lang.*;
import java.util.*; // package for scanner class

class If_Demo // declared class
{
	public static void main(String args[]) // declared main function
	{
		Scanner input=new Scanner(System.in); // creating object of scanner class
		int number; // variable

		System.out.println("Enter number");
		number=input.nextInt();
		
		if((number/2)*2==number) // defined if condition
		{
			System.out.println("even "); //if block  statement
		}
		else // keyword
		{
			System.out.println("Odd  "); //else block statement
		}
	}
}