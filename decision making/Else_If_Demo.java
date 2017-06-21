import java.lang.*;
import java.util.*; // package for scanner class

class Else_If_Demo // declared class
{
	public static void main(String args[]) // declared main function
	{
		Scanner input=new Scanner(System.in); // creating object of scanner class
		int age; // variable
		System.out.println("Enter your age...");
		age=input.nextInt();
		
		if(age>10 && age<=20) // condtion first
		{
			System.out.println("First complete school");
		}
		else if(age>20 && age<=40) // second condtion
		{
			System.out.println("Job , Marriage(screfy)....");
		}
		else if(age>40 && age<=80) // condtion three 
		{
			System.out.println("Waiting for god.....");
		}
		else{
			System.out.println("Enter valid age");
		}		
	}
}