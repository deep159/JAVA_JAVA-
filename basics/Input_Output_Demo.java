import java.lang.*; // defalut package
import java.util.*; // package for scanner class

class Input_Output_Demo  // class name
{
	public static void main(String args[]) // main method
	{
		int a,b,c;// defined variables
		String msg;
		Scanner input=new Scanner(System.in); // created object of scanner class
		
		System.out.println("Enter msg please"); 
		msg=input.nextLine();
		System.out.println("hello "+msg);
		
		System.out.println("Enter the value of A "); // printing message
		a=input.nextInt(); // gettting input for a
		System.out.println("Enter the value of B ");
		b=input.nextInt(); // gettting input for b
		
		c=a+b; // addition of two variables
		
		System.out.print("your sum is"+c); //printing message or variable		
	
		
		
	}
}