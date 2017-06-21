import java.lang.*;

class First_Demo // defined class
{
	int a=20; // class or instance 
	
	void display()
	{
		//int a=10; // local variable
		System.out.println(a);
	}
	public static void main(String args[]) // main function for JVM
	{
		First_Demo d=new First_Demo();
		d.display();
	}
	
}